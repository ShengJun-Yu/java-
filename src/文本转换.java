import java.io.*;

public class �ı�ת��{
	public static void main(String []args)throws Exception {
		FileOutputStream out =new FileOutputStream( "D:\\�����ı�.txt",true);
		String str="��ӭ���!";
		byte[] b=str.getBytes();
		for(int i=0;i<b.length;i++) {
			out.write(b[i]);
		}
		out.close();
	}
}