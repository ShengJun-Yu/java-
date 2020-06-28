
public class 数组的运用 {
	public static void main(String []args) {
		int a[]= {72,89,65,58,87,91,53,82,71,93,76,68};
		int sum=0;int max=a[0];int min=a[0];
		for(int y=0;y<a.length;y++) {
			sum+=a[y];
			}
			int pjf=sum/a.length;     	
		    System.out.println("总分为："+sum);
			System.out.println("平均分为："+pjf);
		for(int y=0;y<a.length;y++) {
			if(a[y]>max) {
				 max=a[y];
				 y=y+1;
			}
			if(a[y]<min) {
				 min=a[y];	
				 y=y+1;
			}
		}
				
		
		System.out.println("最大值为："+max);
		System.out.println("最小值为为："+min);


		}		
}
