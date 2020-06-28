package 文件相关;
import java.io.FilenameFilter;
import java.io.File;

public class 遍历指定目录下所有扩展名为mp4的文件 {
	public static  void main(String[] args)throws Exception{
		File file =new File ("D:\\###AAA各种文件233333\\电影");
		FilenameFilter filter=new FilenameFilter() {
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				File currFile=new File(dir,name);
				if(currFile.isFile()&&name.endsWith(".mp4")) {
					return true;
				}else {
				return false;
				}
			}
		};
		if(file.exists()) {
			String[] lists=file.list(filter);
			for(String name:lists) {
				System.out.println(name);

		}
		}
	}

}
