
public class ��ά�������л��� {
	public static void main(String[] args) {
	   int arr[][] =new int[][]{ {1,2,3},{4,5,6},{7,8,9}};
	   System.out.println("ԭ���飺");
	   for(int x=0;x<arr.length;x++) {
			for(int y=0;y<arr[x].length;y++) {
				System.out.print(arr[x][y]+"\t");
			}
			System.out.println();
			}
	   System.out.println("���л���������飺");
	   int arrnew[][]=new int[arr.length][arr.length];
	   for(int a=0;a<arr.length;a++) {
		   for(int b=0;b<arr[a].length;b++) {
			   arrnew[a][b]=arr[b][a];
		   }
		   }
		   for(int x=0;x<arrnew.length;x++) {
				for(int y=0;y<arrnew[x].length;y++) {
					System.out.print(arrnew[x][y]+"\t");
				}
		   System.out.println();
		}
	   }
	}

	

