import java.io.*;

public class 合并行 {
	public static  void main(String[] args)throws Exception{
		FileInputStream in=new FileInputStream("D:\\测试文本.txt");
		InputStreamReader isr =new InputStreamReader(in);
		BufferedReader br=new BufferedReader(isr);
		FileOutputStream out=new FileOutputStream("D:\\测试文本c.txt");
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
