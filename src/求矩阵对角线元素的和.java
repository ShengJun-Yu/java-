import java.util.Scanner;

public class �����Խ���Ԫ�صĺ� {
	public static void main(String[] args) {
		System.out.println("���������Ԫ�أ�");
		Scanner sum=new Scanner(System.in);
		int a=sum.nextInt();
		int b=sum.nextInt();
		int c=sum.nextInt();
		int d=sum.nextInt();
		int e=sum.nextInt();
		int f=sum.nextInt();
		int g=sum.nextInt();
		int h=sum.nextInt();
		int i=sum.nextInt();
		int z[][]= {{a,b,c},{d,e,f},{g,h,i}};
		int a1=0;
		for(int l=0;l<z.length;l++) {
			for(int j=0;j<z.length;j++) {
				if(l==j||(l+j)==z.length) a1+=z[l][j];}
		}
		System.out.println("�Խ��ߺͣ�"+a1);
	}
}
