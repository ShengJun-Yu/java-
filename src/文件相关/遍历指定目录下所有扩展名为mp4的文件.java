package �ļ����;
import java.io.FilenameFilter;
import java.io.File;

public class ����ָ��Ŀ¼��������չ��Ϊmp4���ļ� {
	public static  void main(String[] args)throws Exception{
		File file =new File ("D:\\###AAA�����ļ�233333\\��Ӱ");
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
