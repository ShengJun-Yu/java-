
public class 二维数组 {
	public static void main(String [ ] args) {
		int arr[][] = {{5,7,9},{12,14,16,18},{23,25,36,47},{22,54,65,15},{22,34}};
		for(int x=0;x<arr.length;x++) {
		for(int y=0;y<arr[x].length;y++) {
			System.out.print(arr[x][y]+"\t");
		}
		System.out.println();
		}
		float sum=0;
		int max=arr[0][0];
		int min=arr[0][0];
		float pinjun;
		for(int x=0;x<arr.length;x++)
			for(int y=0;y<arr[x].length;y++) {
				sum=sum+arr[x][y];
				if(arr[x][y]>max)
					max=arr[x][y];
				if(arr[x][y]<min)
					min=arr[x][y];
			}
		pinjun=sum/arr.length;
		System.out.println("和为："+sum);
		System.out.println("平均值是："+pinjun);
		System.out.println("最大值为："+max);
		System.out.println("最小值为："+min);	
	}
}
        