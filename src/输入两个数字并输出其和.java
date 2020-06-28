import java.util.Scanner;

public class 输入两个数字并输出其和 {
	public static void main (String [] args) {
		System.out.println("请输入第一个数字：");
		Scanner inone=new Scanner(System.in);
		int one=inone.nextInt();
		System.out.println("请输入第二个数字：");
		Scanner intwo=new Scanner(System.in);
		int two=intwo.nextInt();
//		int temp=add(one,two);
//		System.out.println(temp);
//	}
//	public static int add(int x,int y) {
//		int result=x+y;
//		return result;
//	}
		int sum=one+two;
		System.out.println(sum);
		}
}


