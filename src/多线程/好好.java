package 多线程;

class TThread extends Thread{
	public void run() {
		for (int i=0;i<=2000;i++) {
			System.out.println(i+"主线程。。。。。。。。");
		}
	}
	
	
}
public class 好好 {
	public static void main(String[] args) {
		TThread a=new TThread();
		a.start();
		
	}

}


