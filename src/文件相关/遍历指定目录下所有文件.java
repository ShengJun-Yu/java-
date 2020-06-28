package 文件相关;
import java.io.File;

public class 遍历指定目录下所有文件 {
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
