package 文件相关;

import java.io.File;

public class 使用delete删除文件 {
	public static void main(String []args) {
		File file=new File("D:\\测试文件.txt");
		if(file.exists()) {
			System.out.println(file.delete());
			
		}
	}

}
