import java.io.*;

public class Writer {
	public static void main(String []args)throws Exception{
	FileWriter writer=new FileWriter("D:\\\\\\\\�����ı�.txt");
	String str="Stephen Jun,Hello!";
			writer.write(str);
	writer.write("\r\n");
	writer.close();
	}
	}