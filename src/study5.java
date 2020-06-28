
public class study5 {
	public static void main(String[] args) {
//		int a,b,c,d;
//		for(a=1;a<=5;a++) {
//			for(b=1;b<=6-a;b++) {
//				System.out.println("");
//			}
//			for(c=1;c<=a;c++) {
//				System.out.println(c+"");
//			}
//			for(d=a-1;d>0;d--) {
//				System.out.println(d+"");
//			}
//			System.out.println();
//		}
//	}
//}		
	int i,j,n,m;
	for(i=1;i<=5;i++) {
		for(j=1;j<=6-i;j++) {
			System.out.println(" ");
		}
		for(n=1;n<=i;n++) {
			System.out.print(n+" ");
		}
		for(m=i-1;m>0;m--) {
			System.out.print(m+" ");
		}
	}
	System.out.println();
	
}
}
