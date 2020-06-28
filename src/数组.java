import java.lang.reflect.Array;

public class 数组 {
	public static void main(String[] args) {
		int arr[]=new int[]{12,54,93,34,63,48,51,23,57,48,62};
        int sum=0;
		int max=arr[0],min=arr[0];
	System.out.println("for循环输出：");
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");	
		}
	    System.out.println();	
	
	System.out.println("for each循环输出:");
		for(int i:arr) { 
			System.out.print(i+" ");
		}	
		
	for(int i=0;i<10;i++) {
		if(arr[i]>max) {
		max=arr[i];}
		if(min>arr[i]) {
		min=arr[i];
		}
	}
	System.out.println("\n最大值是："+max);
	System.out.println("最小值是："+min);
		
	
        for(int i=0;i<=10;i++) {
        	sum=sum+arr[i];
        }
        System.out.println("和:"+sum);
        System.out.println("平均值:"+sum/arr.length);
	}
}
