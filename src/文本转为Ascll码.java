import java.io.*;

public class �ı�תΪAscll�� {
	public static void main(String []args)throws Exception {
		FileInputStream in =new FileInputStream( "D:\\�����ı�.txt");
		int b=0;
		while(true) {
			b=in.read();
			if(b==-1) {
	         break;
	}
	System.out.println(b);
}
   in.close();
}
}