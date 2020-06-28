import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.*;

public class 异常捕捉 {
	public static void main(String []args) { 
			try {
			FileInputStream fis =new FileInputStream("text.txt");
			int b;
			while((b=fis.read())!=-1) {      //读文件字节数据有效时循环
				System.out.print(b);//显示读出的字节数据
			}
			fis.close();			//关闭文件
			}catch(FileNotFoundException e) {
				System.out.print(e);
				System.out.println("message(异常提示）："+e.getMessage());
			}catch(IOException e) {
				System.out.print(e);
			}
				System.out.println("程序正常结束");
		}
	}



