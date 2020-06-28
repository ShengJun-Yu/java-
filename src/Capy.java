
public class Capy {
		 public static void main(String args[]){
		 int a[][] = {{1,2,3},{4,5,6}};
		 int b[][] = new int[a.length][a[0].length];
		 System.arraycopy(a,0,b,0,a.length); //通过arraycopy()函数拷贝数组
		b[0][0] = 4; //改变数组b[0][0]的值
		System.out.println("a[][]");
		 for(int i=0;i<2;i++){
		 for(int j=0;j<3;j++){
		 System.out.print(a[i][j]+" ");
		 }
		 System.out.println();
		 }
		 System.out.println("b[][]");
		 for(int i=0;i<2;i++){
		 for(int j=0;j<3;j++){
		 System.out.print(b[i][j]+" ");
		 }
		 System.out.println();
		 }
		 }

}
