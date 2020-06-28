import java.io.*;

public class 复制文件并计算所用的时间 {
	public static void main(String []args)throws Exception{
		InputStream in=new FileInputStream("D:\\\\测试文本.txt");
		OutputStream out=new FileOutputStream("D:\\\\测试文本c.txt");
	int len;
	long begintime=System.currentTimeMillis();
	while((len=in.read())!=-1) {
		out.write(len);
	}
	long endtime=System.currentTimeMillis();
	System.out.println("拷贝文件所需的时间为："+(endtime-begintime)+"毫秒");
	in.close();
	out.close();
	}

}
