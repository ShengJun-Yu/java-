import java.util.Scanner;

public class ͼ����� {
	public static void main(String []args) {
		System.out.println("������Ҫ����ʲôͼ�Σ�1Բ��2������3����");
		Scanner x=new Scanner(System.in);
		int y=x.nextInt();
		switch(y) {
		case 1:
		    System.out.println("������Բ�İ뾶��");
		    Scanner in=new Scanner(System.in);
		    double r=in.nextInt();
		    System.out.println("Բ�����Ϊ:"+r*r*3.141596);
		    break;
		case 2:
			 System.out.println("�����������εĵ׺͸ߣ�");
			    Scanner ins=new Scanner(System.in);
			    double h=ins.nextInt();
			    Scanner inss=new Scanner(System.in);
			    double d=inss.nextInt();
			    System.out.println("�����ε����Ϊ:"+d*h*0.5);
			    break;
		case 3:
			 System.out.println("��������εĳ��Ϳ�");
			    Scanner insss=new Scanner(System.in);
			    double a=insss.nextInt();
			    Scanner inssss=new Scanner(System.in);
			    double b=inssss.nextInt();
			    System.out.println("���ε����Ϊ:"+a*b);
			    break;	
		}
		
	}
}
