import java.util.Scanner;

public class 二维数组的运用 {
	public static void main(String[] args) {
		System.out.println("请输入学生分数：");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int [][] b=new int[5][3];
		for(int i=0;i<5;i++) {
			for(int j=0;j<3;j++) {
				b[i][j]=sc.nextInt();
			}
		}
	int max =b[0][0],min=b[0][0],sum=0;
	for(int i=0;i<b.length;i++) {
		for(int j=0;j<b[0].length;j++) {
			if(b[i][j]>max) {
				max=b[i][j];
			}
			if(b[i][j]<min) {
				min=b[i][j];
			}
			sum+=b[0][0];
		}		
	}
	System.out.println("最大值为："+max);
	System.out.println("最小值为为："+min);
	System.out.println("平均分为："+(double)sum/b.length);
	}

}
