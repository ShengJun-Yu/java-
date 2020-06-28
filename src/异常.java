import java.io.*;

public class 异常 {
	public static void main(String[] args) {
		String str=null;
		int strlen=0;
		try {
		    int a=4/0;
		}catch(NullPointerException b) {
			System.out.println("异常");
			strlen=3;
		}catch(Exception b) {
			System.out.print("捕获Exception异常为：");
		}
		System.out.print(strlen);	    		    
		  		    }

	}


