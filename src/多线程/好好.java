package ���߳�;

class TThread extends Thread{
	public void run() {
		for (int i=0;i<=2000;i++) {
			System.out.println(i+"���̡߳���������������");
		}
	}
	
	
}
public class �ú� {
	public static void main(String[] args) {
		TThread a=new TThread();
		a.start();
		
	}

}


