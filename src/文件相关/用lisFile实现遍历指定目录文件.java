package �ļ����;

import java.io.File;

public class ��lisFileʵ�ֱ���ָ��Ŀ¼�ļ� {
	public static void main(String []args) {
		File file=new File("D:\\###AAA�����ļ�233333");
		fileDir(file);
	}
	public static void fileDir(File dir) {
		File[]files=dir.listFiles();
		for(File file:files) {
			if(file.isDirectory()) {
				fileDir(file);
				
			}
			System.out.println(file.getAbsolutePath());
		}
}

}
