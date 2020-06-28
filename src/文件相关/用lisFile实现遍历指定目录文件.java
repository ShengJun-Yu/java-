package 文件相关;

import java.io.File;

public class 用lisFile实现遍历指定目录文件 {
	public static void main(String []args) {
		File file=new File("D:\\###AAA各种文件233333");
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
