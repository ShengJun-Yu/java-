import java.util.Scanner;

public class ��ά��������� {
	public static void main(String[] args) {
		System.out.println("������ѧ��������");
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
	System.out.println("���ֵΪ��"+max);
	System.out.println("��СֵΪΪ��"+min);
	System.out.println("ƽ����Ϊ��"+(double)sum/b.length);
	}

}
