
public class �ַ��� {
	public static void main(String[] args) {
		String s="Hello ";
		String s1=new String(s);
		int chang=s.length();
		System.out.println("�ַ�s="+s1);
		
		System.out.println("�ַ�S����Ϊ"+chang);
		
		String s2="woeld ";
		String s3=s1.concat(s2);
		System.out.println("�ַ�S��S2���Ӻ�Ϊ"+s3);
		System.out.println("S1�Ƿ����S2"+s1.equals(s2));
		
		String s4=s3.substring(2,4);
		
		
		String s5="I am a good cat";
		System.out.println("S5�е�һ��a���ĸ�λ��"+s.indexOf('a'));
		System.out.println("S5�����һ��a���ĸ�λ��"+s.lastIndexOf('a'));

		System.out.println(s5.replaceAll("cat","pig"));
		
		System.out.println("Сд��S3Ϊ��"+s5.toLowerCase());
		System.out.println("��д��S3Ϊ��"+s5.toUpperCase());
		
		System.out.println("ȡ��ǰ�ĳ��ȣ�"+s5.length());
		String s6=s5.trim();
		System.out.println(s6);	
		System.out.println("ȡ����ĳ��ȣ�"+s6.length());
	}

}
