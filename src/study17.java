
class Book{
	String title;
	double price;
	public void getA() {
		System.out.println("����:"+title+"   "+"���:"+price);
	}
}
public class study17 {
	public static void main(String [] args) {
		Book bookA=new Book();
		Book bookB=new Book();
		bookA.title="java����";
		bookA.price=100;
		bookB.title="C���Կ���";
		bookB.price=88;
		bookA.getA();
		bookB.getA();
	}
}
