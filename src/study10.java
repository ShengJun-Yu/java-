
public class study10 {
	public static void main(String[] args) {
		int a,b,c,i;
		for(i=100;i<=1000;i++) {
		a=i%10;
		b=i/10%10;
		c=i/100;
		if(c*c*c+b*b*b+a*a*a==i) {
		System.out.println(i);	
		}
	}
	}

}
