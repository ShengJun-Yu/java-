import java.util.Scanner;
public class ����������Ӵ�С��� {
	public static void main(String []args) {
		System.out.println("������������������");
		Scanner sum=new Scanner(System.in);
		int a=sum.nextInt();
		int b=sum.nextInt();
		int c=sum.nextInt();
		System.out.println("�������������Ϊ:A="+a+",B="+b+",C="+c);		
      //ð������
		int s[]= {a,b,c};
		for(int x=0;x<s.length-1;x++) {
			for(int i=0;i<s.length-1-x;i++) {
			if(s[i]>s[i+1]) {
			int temp=s[i];
			s[i]=s[i+1];
			s[i+1]=temp;
			}
		}
	}
		for(int i=0;i<3;i++) {
		    System.out.print(s[i]+"  ");			
	}
	}
}


