import java.util.Scanner;

public class �ɼ��ּ� {
	public static void main(String[] args) {
		System.out.println("������ѧ��������");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		int[] a=new int[i];
		for(int x=1;x<=i;x++) {
		    System.out.println("�������"+x+"ѧ��������");		
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
				 System.out.println(a[x]+"ΪA");			
			}
			else if(a[x]>max-20&a[x]<max-10) {
				System.out.println(a[x]+"ΪB");
			}
			else if(a[x]>max-30&a[x]<max-20) {
				System.out.println(a[x]+"ΪC");
			}
			else {
				System.out.println(a[x]+"ΪD");
			}
		}
			}	
	}


