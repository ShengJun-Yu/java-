import java.io.*;

public class 加行数 {
	public static void main(String [ ]args )throws Exception{
		FileReader fr=new FileReader("D:\\Stephen专属空间\\Stephen好好学习\\src\\加行数.java");
		FileWriter fw=new FileWriter("D:\\AAAAAAAA.java");
		LineNumberReader lr=new LineNumberReader(fr);
		lr.setLineNumber(0);
		String line=null;
		while((line =lr.readLine())!=null) {
			fw.write(lr.getLineNumber( )+":"+line);
		    fw.write("\r\n");		
		}
		lr.close();
		fw. close();
	}
}
	