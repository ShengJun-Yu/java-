import java.io.*;

public class �����ļ����������õ�ʱ�� {
	public static void main(String []args)throws Exception{
		InputStream in=new FileInputStream("D:\\\\�����ı�.txt");
		OutputStream out=new FileOutputStream("D:\\\\�����ı�c.txt");
	int len;
	long begintime=System.currentTimeMillis();
	while((len=in.read())!=-1) {
		out.write(len);
	}
	long endtime=System.currentTimeMillis();
	System.out.println("�����ļ������ʱ��Ϊ��"+(endtime-begintime)+"����");
	in.close();
	out.close();
	}

}
