
public class study15 {
	public static void main (String[] args) {
		System.out.println(add(1));
	}
	public static int add(int num) {
	    if(num==100) {
	    	return 100;
	    }
	    return num+add(num+1);
	}

}
