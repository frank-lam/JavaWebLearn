package com.gyf.web.servlet;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadBase;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@WebServlet("/UploadServlet")
public class UploadServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException,IOException {

        //1.判断是否为文件上传表单
        if(ServletFileUpload.isMultipartContent(req)){
            //2.创建个文件工厂
            FileItemFactory factory = new DiskFileItemFactory();
            //3.创建文件上传对象
            ServletFileUpload fileUpload = new ServletFileUpload(factory);
            fileUpload.setFileSizeMax(1024 * 1024 * 2);//2M 限制
            fileUpload.setHeaderEncoding("UTF-8");//解决文件字段乱码
            //4.解析请求
            try{
                List<FileItem> items = fileUpload.parseRequest(req);
                for(FileItem item : items){
                    if(item.isFormField()){//普通表单字段
                        processFormField(item);
                    }else{//文件字段
                        processFile(item);
                    }
                }
            }catch (FileUploadBase.FileSizeLimitExceededException fslee){
                System.out.println("文件上传太大了");
            }catch (FileUploadException fue){
                fue.printStackTrace();
            }

        }

    }

    private void processFile(FileItem item) {
        try {
            String fileName = new String(item.getName().getBytes("ISO-8859-1"),"UTF-8");
            System.out.println(item.getName() +  ":" + item.getContentType());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        //1.获取文件扩展名
        String suffix = item.getName().split("\\.")[1];
        String saveFileName = UUID.randomUUID().toString() + "." + suffix;


        //2.创建文件保存的文件夹
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String hex = Integer.toHexString(sdf.format(new Date()).hashCode());//把日期20180108转成16进制字符串d12fde2f
        String folderPath = this.getServletContext().getRealPath("/WEB-INF/upload/" + hex);
        System.out.println("保存的路径:" + folderPath);
        File file = new File(folderPath);
        if(!file.exists()){
            file.mkdirs();
        }

        //3.保存文件
        //文件完整保存路径
        String filePath = folderPath + "/" + saveFileName;
        try {
            item.write(new File(filePath));
            item.delete();//删除临时文件
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

   /* private void processFile1(FileItem item) {
        String fieldName = item.getFieldName();
        String fieldValue = item.getString();
        //1.获取文件扩展名
        String suffix = item.getName().split("\\.")[1];
        String saveFileName = UUID.randomUUID().toString() + "." + suffix;
        System.out.println(saveFileName +  ":" + item.getContentType());

        //2.创建文件保存的文件夹
        String folderPath = this.getServletContext().getRealPath("/WEB-INF/upload");
        System.out.println("保存的路径:" + folderPath);
        File file = new File(folderPath);
        if(!file.exists()){
            file.mkdirs();
        }

        //3.保存文件
        //文件完整保存路径
        String filePath = folderPath + "/" + saveFileName;
        try {
            item.write(new File(filePath));
            item.delete();//删除临时文件
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/

    private void processFormField(FileItem item) {
        String fieldName = item.getFieldName();
        String fieldValue = null;
        try {
            fieldValue = item.getString("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(fieldName + ":" + fieldValue);
    }
}
