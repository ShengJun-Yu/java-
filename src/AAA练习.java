import java.util.Scanner;

public class AAA练习 {
	public static void main(String [] args) {
		System.out.println("请输入x，y的值");
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
//			System.out.println("for each循环输出:");
//			for(int i:arr) { 
//				System.out.print(i+" ");
//			}
//			System.out.println();	
//		}
//		}
//			System.out.println("请输入学生人数：");
//			Scanner sc=new Scanner(System.in);
//			int n=sc.nextInt();
//			int[] a=new int[n];
//			for(int i=0;i<n;i++) {
//			    System.out.println("请输入第"+(i+1)+"学生分数：");		
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
//				     System.out.println(a[i]+"分为A");
//				 }	
//				else if(max-a[i]<=20) {
//					 System.out.println(a[i]+"分为B");
//				 }	 
//				else if(max-a[i]<=30) {
//					 System.out.println(a[i]+"分为C");
//				 }
//				else {
//					 System.out.println(a[i]+"分为D");
//				 }
//			}
//		}			
//}
//


//	public static void main(String[] args) {
//	System.out.println("学生去食堂吃饭");	
//	System.out.println("学生回寝室睡觉");	
//	System.out.println("教师去教工餐厅吃饭！");	
//		System.out.println("家长去招待所饭馆吃饭！");
//		System.out.println("家长回招待所睡觉");
//		System.out.println("领导吃完饭就离开！");
//		System.out.println("领导吃完离开之后就去上厕所了！");
//	}
//}

//		public static void main(String []args) {
//			System.out.println("请问您想输入几列数螺旋输出？");
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
//			System.out.println("顺时针输出：");
//			for(int i=1;i<=n;i++) {
//				for(int j=1;j<=n;j++) {
//					System.out.print(rect[j][i]+"\t");
//				}
//				   System.out.println();
//			}
//			 System.out.println("逆时针输出：");
//		        for(int i = 1; i<=n;i++) {
//		            for(int j=1;j<=n;j++){
//		                System.out.print(rect[i][j]+"\t"); // 翻转复原输出
//		            }
//		            System.out.println();
//		        }	
//		}
// }
//
//	
