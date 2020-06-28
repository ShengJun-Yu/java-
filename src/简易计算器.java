import java.util.Scanner;
public class 简易计算器 {
	public static void main(String[] args) {
		System.out.println("请输入第一个数值：");
		Scanner a=new Scanner(System.in);
		double b=a.nextInt();
		System.out.println("请输入第二个数值：");
		Scanner c=new Scanner(System.in);
		double d=c.nextInt();
		System.out.println("请输入符号 ：");
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
