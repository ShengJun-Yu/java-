package �ļ����;

import java.io.File;

public class ʹ��deleteɾ���ļ� {
	public static void main(String []args) {
		File file=new File("D:\\�����ļ�.txt");
		if(file.exists()) {
			System.out.println(file.delete());
			
		}
	}

}
