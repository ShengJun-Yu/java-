import java.util.Scanner;

public class AAA��ϰ {
	public static void main(String [] args) {
		System.out.println("������x��y��ֵ");
		Scanner sc=new Scanner (System.in);
		int x=sc.nextInt();
		Scanner intwo=new Scanner(System.in);
		int y=intwo.nextInt();
		int c=x+y;
		System.out.println(c);
	}
//	public static void main(String[] args) {
//		
//
//		     for (int i = 0; i < 6; i++) {
//
//		          System.out.print(i );

//		            while (++i < 5) {
//
//		                     continue;
//
//		              }
//
//		              System.out.print(i);
//
//		       }

//		}
	}


//			int arr[]=new int[]{12,54,93,34,63,48,51,23,57,48,62};
//			System.out.println("for eachѭ�����:");
//			for(int i:arr) { 
//				System.out.print(i+" ");
//			}
//			System.out.println();	
//		}
//		}
//			System.out.println("������ѧ��������");
//			Scanner sc=new Scanner(System.in);
//			int n=sc.nextInt();
//			int[] a=new int[n];
//			for(int i=0;i<n;i++) {
//			    System.out.println("�������"+(i+1)+"ѧ��������");		
//			    a[i]=sc.nextInt();
//			}
//			int max=a[0];
//			for(int i=1;i<n;i++) {
//				if(a[i]>max) 
//					max=a[i];				
//				}
//			
//			for(int i=0;i<n;i++) {
//				if(max-a[i]<=10) {
//				     System.out.println(a[i]+"��ΪA");
//				 }	
//				else if(max-a[i]<=20) {
//					 System.out.println(a[i]+"��ΪB");
//				 }	 
//				else if(max-a[i]<=30) {
//					 System.out.println(a[i]+"��ΪC");
//				 }
//				else {
//					 System.out.println(a[i]+"��ΪD");
//				 }
//			}
//		}			
//}
//


//	public static void main(String[] args) {
//	System.out.println("ѧ��ȥʳ�óԷ�");	
//	System.out.println("ѧ��������˯��");	
//	System.out.println("��ʦȥ�̹������Է���");	
//		System.out.println("�ҳ�ȥ�д������ݳԷ���");
//		System.out.println("�ҳ����д���˯��");
//		System.out.println("�쵼���극���뿪��");
//		System.out.println("�쵼�����뿪֮���ȥ�ϲ����ˣ�");
//	}
//}

//		public static void main(String []args) {
//			System.out.println("�����������뼸�������������");
//			Scanner in =new Scanner(System.in);
//			int n=in.nextInt();
//			int [][]rect =new int [n+1][n+1];
//			int x=0,y=1,px=1,py=0, pn=n ,sum=n;
//			for(int i=1;i<=n*n;i++) {
//				x= px+x;
//	            y= py+y;
//	            rect[x][y]=i;
//				if(i==sum) {
//					if(px==1||px==-1) {
//						pn=pn-1;
//						sum=sum+pn;
//						py=px;
//						px=0;
//					}
//					else {
//						sum=sum+pn;
//						px=-py;
//						py=0;
//					}
//				}
//			}
//			System.out.println("˳ʱ�������");
//			for(int i=1;i<=n;i++) {
//				for(int j=1;j<=n;j++) {
//					System.out.print(rect[j][i]+"\t");
//				}
//				   System.out.println();
//			}
//			 System.out.println("��ʱ�������");
//		        for(int i = 1; i<=n;i++) {
//		            for(int j=1;j<=n;j++){
//		                System.out.print(rect[i][j]+"\t"); // ��ת��ԭ���
//		            }
//		            System.out.println();
//		        }	
//		}
// }
//
//	
