
public class study13 {
	public static void main(String[] args) {
		System.out.println(add(10,20));
		System.out.println(add(10,20,30));
		System.out.println(add(10.5,11.5));
	}
	public static int add(int x,int y) {
		int result=x+y;
		return result;
	}
	public static int add(int x,int y,int z) {
		int result=x+y+z;
		return result;
		}
	public static double add(double x,double y) {
		double result=x+y;
		return result;
		}
}
