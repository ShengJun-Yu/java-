package �ļ����;
import java.io.File;

public class �ļ����Բ�ѯ {
	public static void main(String [] args) {
		File file=new File("D:\\�����ļ�.txt");
		System.out.println("�ļ����ƣ�"+file.getName());
		System.out.println("�ļ����·����"+file.getPath());
		System.out.println("�ļ�����·����"+file.getAbsolutePath());
		System.out.println("�ļ��ĸ�·����"+file.getParent());
		System.out.println(file.canRead()?"�ļ��ɶ�":"�ļ����ɶ�");
		System.out.println(file.isFile()?"��һ���ļ�":"����һ���ļ�");
		System.out.println(file.isDirectory()?"��һĿ¼":"����һ��Ŀ¼");
		System.out.println(file.isAbsolute()?"�Ǿ���·��":"���Ǿ���·��");
		System.out.println("����޸�ʱ��Ϊ��"+file.lastModified());
		System.out.println("�ļ���СΪ��"+file.length()+"�ֽ�");
		System.out.println("�Ƿ�ɹ�ɾ���ļ�"+file.delete());
		
	}

}
