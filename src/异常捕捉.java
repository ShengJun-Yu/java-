import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.*;

public class �쳣��׽ {
	public static void main(String []args) { 
			try {
			FileInputStream fis =new FileInputStream("text.txt");
			int b;
			while((b=fis.read())!=-1) {      //���ļ��ֽ�������Чʱѭ��
				System.out.print(b);//��ʾ�������ֽ�����
			}
			fis.close();			//�ر��ļ�
			}catch(FileNotFoundException e) {
				System.out.print(e);
				System.out.println("message(�쳣��ʾ����"+e.getMessage());
			}catch(IOException e) {
				System.out.print(e);
			}
				System.out.println("������������");
		}
	}



