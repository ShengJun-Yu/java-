
public class 字符串 {
	public static void main(String[] args) {
		String s="Hello ";
		String s1=new String(s);
		int chang=s.length();
		System.out.println("字符s="+s1);
		
		System.out.println("字符S长度为"+chang);
		
		String s2="woeld ";
		String s3=s1.concat(s2);
		System.out.println("字符S与S2连接后为"+s3);
		System.out.println("S1是否等于S2"+s1.equals(s2));
		
		String s4=s3.substring(2,4);
		
		
		String s5="I am a good cat";
		System.out.println("S5中第一个a在哪个位置"+s.indexOf('a'));
		System.out.println("S5中最后一个a在哪个位置"+s.lastIndexOf('a'));

		System.out.println(s5.replaceAll("cat","pig"));
		
		System.out.println("小写版S3为："+s5.toLowerCase());
		System.out.println("大写版S3为："+s5.toUpperCase());
		
		System.out.println("取消前的长度："+s5.length());
		String s6=s5.trim();
		System.out.println(s6);	
		System.out.println("取消后的长度："+s6.length());
	}

}
