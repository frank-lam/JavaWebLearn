package lesson12;

public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//捋一捋IO流
		
		/**
		 * 一、IO流-输入输出流
		 * I:input
		 * O:out
		 * IO流 操作文件，读取文件内容，往文件写内容
		 * 
		 * 二、字节流
		 * 
		 * >InputStream
		 *  -FileInputStream 文件输入流，读的单位是字节
		 *  -BufferedInputStream 缓冲输入流，内部有个byte[]字节数组
		 *  -SequenceInputStream 序列流，把多个字节流整合成一个流
		 *  -ObjectInputStream 对象输入流，直接从文件中读取一个对象,这个对象要实现serilazable接口
		 *  -Sytem.in 标准输入流-指键盘
		 *  -DataInputStream 数据输入流，按基本数据类型的大小(long) 读取文件
		 *  
		 * >OutputStream
		 *  -FileOutputStream 文件输出流，写的单位是字节
		 *  -BufferedOutputStream 缓冲输出流，内部有个byte[]字节数组
		 *  -ByteArrayOutputStream 字节数组输出流，把数据读取到内存中，这个类不需要关联文件
		 *  -ObjectOutputStream 对象输出流，直接把一个对象存入文件，
		 *  -PrintStream 打印流，把内容打印到控制台
		 *  -System.out 标准输出流-指控制台
		 *  -DataOutputStream 数据输出流，按基本数据类型的大小(long) 写入文件
		 *  
		 * 三、字符流
		 * >Reader
		 *  -FileReader 文件读取流，读取的单位是字符
		 *  -BufferedReader 缓冲读取流，内部有个char[] 字符数组
		 *  -InputStreamReader 指定字符编码读取文件
		 * 
		 * >Writer
		 *  -FileWriter 文件写入流,写入的单位是字符
		 *  -BufferedWriter,缓冲写入流，内部有个char[] 字符数组
		 *  -OutputStreamWriter 指定字符编码写入文件
		 *  -PrintWriter 打印流，把内容打印一个文件
		 *  
		 *  
		 * RandomAccessFile 随机访问流，特点：读和写都在一个类中
		 * 
		 * Properties 相当于Map一样使用，这个类把数据存在一个后缀名为.properties文件
		 */
	}

}
