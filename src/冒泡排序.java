import java.util.Scanner;

public class ц╟ещеепР {
	public static void main(String[] args) {;
	int a[]= {1,3,2,4,5,6,8,7,9,0};
	for(int x=0;x<a.length-1;x++) {
		for(int i=0;i<a.length-1-x;i++) {
		if(a[i]>a[i+1]) {
		int temp=a[i];
		a[i]=a[i+1];
		a[i+1]=temp;
		}
	}
}
	for(int i=0;i<a.length;i++) {
	    System.out.print(a[i]+" ");	
	}
	System.out.println();
	}
}
