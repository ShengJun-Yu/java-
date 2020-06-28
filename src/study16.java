
public class study16 {
	public static void main(String[] args) {
	    Person2 student = new Student("ะกอ๕");
	    student.getMessge(); 
	  }  
	}
class Person2{
	  public String name;
	   public Person2(){
	    System.out.println("Nothing!");
	  }
	   public void getMessge(){
	    System.out.println("class Person");
	  }
	}
class Student extends Person2{
	  public String name;
	   public void getMessge(){
	    System.out.println("class student");
	  }
	   public Student(String name){
	    super();
	    System.out.println(name+" is a student!");
	  }
	}

