import java.util.Scanner;
public class ���׼����� {
	public static void main(String[] args) {
		System.out.println("�������һ����ֵ��");
		Scanner a=new Scanner(System.in);
		double b=a.nextInt();
		System.out.println("������ڶ�����ֵ��");
		Scanner c=new Scanner(System.in);
		double d=c.nextInt();
		System.out.println("��������� ��");
		Scanner e=new Scanner(System.in);
		String f=e.next();
		switch(f) {
		case "+":
			System.out.println(b+d);
			break;
		case "-":
			System.out.println(b-d);
			break;	
		case "*":
			System.out.println(b*d);
			break;
		case "/":
			System.out.println(b/d);
			break;	
		}
		
		System.out.println();
	}

}
