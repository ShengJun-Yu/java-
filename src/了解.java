
public class 了解 {
	public static void main (String[] args) {
		per a=new per();
		String b,c;
		b=a.getType();
		c=a.getName();
		System.out.println(b);
		System.out.println(c);
	}
	}
class per{
	public static String getType() {
		return"人类";
	}
	public String getName() {
		return"张三";
	}
	}
