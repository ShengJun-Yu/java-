import java.io.*;

public class �ϲ��� {
	public static  void main(String[] args)throws Exception{
		FileInputStream in=new FileInputStream("D:\\�����ı�.txt");
		InputStreamReader isr =new InputStreamReader(in);
		BufferedReader br=new BufferedReader(isr);
		FileOutputStream out=new FileOutputStream("D:\\�����ı�c.txt");
		OutputStreamWriter osw=new OutputStreamWriter(out);
		BufferedWriter bw=new BufferedWriter(osw);
		String line;
		while((line=br.readLine())!=null) {
			bw.write(line);
		}
		br.close();
		bw.close();
	}
	

}
