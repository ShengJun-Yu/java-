import java.io.*;

public class 文本转换{
	public static void main(String []args)throws Exception {
		FileOutputStream out =new FileOutputStream( "D:\\测试文本.txt",true);
		String str="欢迎大家!";
		byte[] b=str.getBytes();
		for(int i=0;i<b.length;i++) {
			out.write(b[i]);
		}
		out.close();
	}
}