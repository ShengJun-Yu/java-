import java.util.Scanner;

public class 成绩分级 {
	public static void main(String[] args) {
		System.out.println("请输入学生人数：");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		int[] a=new int[i];
		for(int x=1;x<=i;x++) {
		    System.out.println("请输入第"+x+"学生分数：");		
		    a[x]=sc.nextInt();
		}
		
		int max=a[0];
		for(int x=0;x<i;x++) {
			if(a[x]>max) {
				max=a[x];				
			}
		}
		
		for(int x=0;x<i;x++) {
			if(a[x]>max-10) {
				 System.out.println(a[x]+"为A");			
			}
			else if(a[x]>max-20&a[x]<max-10) {
				System.out.println(a[x]+"为B");
			}
			else if(a[x]>max-30&a[x]<max-20) {
				System.out.println(a[x]+"为C");
			}
			else {
				System.out.println(a[x]+"为D");
			}
		}
			}	
	}


