
public class ��̬����ϰ {
	 public static void main(String[] args) {
		 Person a1=new xingming();
		 Person a2=new age();
		 Person a3=new dianhua();
		 a1.name="��ʢ��";
		 a2.name="����";
		 a3.name="�绰";
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
		System.out.println("������"+name);
	}
}
class age extends Person{
	public void work() {
		System.out.println(name+"��20");
	}
}
class dianhua extends Person{
	public void work() {
		System.out.println(name+"��120");
	}
}