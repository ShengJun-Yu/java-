
public class teststatic {
	static {
		System.out.println("test static");
		}
		public teststatic() {
			System.out.println("test constructor");
		}
		public static void main(String[] args){
			new teststatic();
		}
	}
class Base{
	static {
		System.out.println("base static");
	}
	public Base() {
		System.out.println("base constructor");
	}
}


