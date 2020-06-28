
public class 多态性练习 {
	 public static void main(String[] args) {
		 Person a1=new xingming();
		 Person a2=new age();
		 Person a3=new dianhua();
		 a1.name="余盛军";
		 a2.name="年龄";
		 a3.name="电话";
		 a1.work();
		 a2.work();
		 a3.work();
	 }
 }
class Person{
	String name;   
	public void work() {
		System.out.println("?");
	}
	public void setname(String string) {
		// TODO Auto-generated method stub
		
	}
}
class xingming extends Person{
	public void work() {
		System.out.println("姓名："+name);
	}
}
class age extends Person{
	public void work() {
		System.out.println(name+"：20");
	}
}
class dianhua extends Person{
	public void work() {
		System.out.println(name+"：120");
	}
}