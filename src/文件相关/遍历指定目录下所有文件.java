package �ļ����;
import java.io.File;

public class ����ָ��Ŀ¼�������ļ� {
	public static  void main(String[] args)throws Exception{
		File file =new File ("D:\\AA");
		if(file.isDirectory()) {
			String []names=file.list();
			for(String		name:names){
				System.out.println(name);
				
			}
		}
	
	}
}
