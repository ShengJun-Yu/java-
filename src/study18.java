//ºÃ≥–  £®◊”¿‡ºÃ≥–∏∏¿‡£©
class A{
	public int a=0;
	public void fun() {
	System.out.println("-----A-----");
	}
}
class B extends A{
	public int a=1;
	public void fun() {
		System.out.println("-----B-----");
	}
	}
public class study18 {//ºÃ≥–
	public static void main(String[] args ) {
		A classA=new B();
		System.out.println(classA.a);
		classA.fun();
	}
}
