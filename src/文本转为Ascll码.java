import java.io.*;

public class 文本转为Ascll码 {
	public static void main(String []args)throws Exception {
		FileInputStream in =new FileInputStream( "D:\\测试文本.txt");
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