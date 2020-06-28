import java.util.Scanner;

public class Case的运用查月份天数 {
	public static void main(String[] args) {
		System.out.println("请输入年份：");
		Scanner innian= new Scanner(System.in);
			int nian=innian.nextInt();
			System.out.println("请输入月份：");
	    Scanner inyue= new Scanner(System.in);
			int yue=inyue.nextInt();
			int tian=0;
			switch (yue) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
			    tian=31;break;
			case 4:
			case 6:
			case 9:
			case 11:
				tian=30;break;
			case 2:
			if(((nian%4==0)&&!(nian%100==0))||(nian%400==0)) {
				tian=29;
				}
				else{
					tian=28;
				}
				break;
			}
			System.out.println(nian+"年"+yue+"月份有"+tian+"天");
			}

}

