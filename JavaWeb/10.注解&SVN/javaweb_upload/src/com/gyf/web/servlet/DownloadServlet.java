package com.gyf.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;

@WebServlet("/DownloadServlet")
public class DownloadServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        //1.文件下载的位置
        String filePath = "C:\\Users\\10301\\Desktop\\test\\598573506018647635.jpg";

        //广州国际金融中心
        //2.文件名
        String fileName = "广州国际金融中心.jpg";
        fileName = URLEncoder.encode(fileName,"UTF-8");//中文名文件需要进行URL编码
        //3.设置响应头
        resp.setHeader("Content-Disposition","attachment;filename=" + fileName);
        resp.setContentType("application/octet-stream");

        //4.响应文件
        File file = new File(filePath);
        InputStream is = new FileInputStream(file);
        byte[] bytes = new byte[1024 * 8];
        int len;
        OutputStream os = resp.getOutputStream();
        while((len = is.read(bytes)) != -1){
            os.write(bytes,0,len);
        }

        //5.关闭流
        is.close();
        os.close();
    }
}
