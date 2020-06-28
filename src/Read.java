import java.io.FileReader;

public class Read {
	public static void main(String []args)throws Exception{
	FileReader reader=new FileReader("D:\\\\\\\\²âÊÔÎÄ±¾.txt");
	int ch;
	while ((ch=reader.read())!=-1) {
		System.out.print((char)ch);
		
	}
	reader.close();
	}
	}