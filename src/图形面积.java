import java.util.Scanner;

public class 图形面积 {
	public static void main(String []args) {
		System.out.println("请问您要计算什么图形：1圆形2三角形3矩形");
		Scanner x=new Scanner(System.in);
		int y=x.nextInt();
		switch(y) {
		case 1:
		    System.out.println("请输入圆的半径：");
		    Scanner in=new Scanner(System.in);
		    double r=in.nextInt();
		    System.out.println("圆的面积为:"+r*r*3.141596);
		    break;
		case 2:
			 System.out.println("请输入三角形的底和高：");
			    Scanner ins=new Scanner(System.in);
			    double h=ins.nextInt();
			    Scanner inss=new Scanner(System.in);
			    double d=inss.nextInt();
			    System.out.println("三角形的面积为:"+d*h*0.5);
			    break;
		case 3:
			 System.out.println("请输入矩形的长和宽：");
			    Scanner insss=new Scanner(System.in);
			    double a=insss.nextInt();
			    Scanner inssss=new Scanner(System.in);
			    double b=inssss.nextInt();
			    System.out.println("矩形的面积为:"+a*b);
			    break;	
		}
		
	}
}
