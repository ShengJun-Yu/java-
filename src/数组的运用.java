
public class ��������� {
	public static void main(String []args) {
		int a[]= {72,89,65,58,87,91,53,82,71,93,76,68};
		int sum=0;int max=a[0];int min=a[0];
		for(int y=0;y<a.length;y++) {
			sum+=a[y];
			}
			int pjf=sum/a.length;     	
		    System.out.println("�ܷ�Ϊ��"+sum);
			System.out.println("ƽ����Ϊ��"+pjf);
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
				
		
		System.out.println("���ֵΪ��"+max);
		System.out.println("��СֵΪΪ��"+min);


		}		
}
