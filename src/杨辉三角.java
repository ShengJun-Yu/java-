
public class Ñî»ÔÈı½Ç {
	public static void main(String[] args) {
		int a[][]=new int[10][];
		for(int x=0;x<a.length;x++) {
			a[x]=new int[x+1];
			for(int y=0;y<=x;y++) {
				if(x==0||y==0||x==y) {
					a[x][y]=1;
				}
				else {
					a[x][y]=a[x-1][y]+a[x-1][y-1];
				}
				System.out.print(a[x][y]+" ");
			}
			System.out.println();	
		}
	}
}
