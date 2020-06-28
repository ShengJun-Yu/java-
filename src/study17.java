
class Book{
	String title;
	double price;
	public void getA() {
		System.out.println("书名:"+title+"   "+"书价:"+price);
	}
}
public class study17 {
	public static void main(String [] args) {
		Book bookA=new Book();
		Book bookB=new Book();
		bookA.title="java开发";
		bookA.price=100;
		bookB.title="C语言开发";
		bookB.price=88;
		bookA.getA();
		bookB.getA();
	}
}
