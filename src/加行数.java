import java.io.*;

public class ������ {
	public static void main(String [ ]args )throws Exception{
		FileReader fr=new FileReader("D:\\Stephenר���ռ�\\Stephen�ú�ѧϰ\\src\\������.java");
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
	