

import java.util.Scanner;

public class ������ά���� {
	  public static void main(String[] args) {
		  System.out.println("�����������뼸�������������");
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[][] rect = new int[n+1][n+1];
	        int x = 0, y = 1; // ��ǰ������λ��
	        int px = 1, py = 0; // x/y �ڵ�ǰѭ�����������
	        int pn = n; // �÷����ϻ���Ҫ���ٸ����֣���ݼ�����Ϊ˳ʱ����������
	        int sum = n; // ��ǰ����������յ�λ��
 
	        /** Ŀ�����˳ʱ�� */
	        // 1  2  3  4  5
	        // 16  17  18  19  6
	        // 15  24  25  20  7
	        // 14  23  22  21  8
	        // 13  12  11  10  9

	        /** ��ת����Ϊ��ʱ�루Ϊ�˱��ں����߼����������ʱ���ٷ�ת��ȥ�� */
	        // 1  16  15  14  13
	        // 2  17  24  23  12
	        // 3  18  25  22  11
	        // 4  19  20  21  10
	        // 5  6  7  8  9
	        
	        for (int i = 1; i <= n * n; i++) { // ��ת����ѭ��
	            // �Ƶ���һ����(��һ�η���1->5 x����Ϊ1�� y������Ϊ0�� �ڶ��η���Ϊ6->9,x����Ϊ0��y����Ϊ1��pn����һ��)
	            x+= px;
	            y+= py;
	            rect[x][y] = i;
	            if (i==sum) { // ����÷�������һ����
	                if(px==1||px==-1){ // x��������Ϊ0����Ϊ���� -> ����
	                    pn=pn-1; // �����Ϊ�����ʱ�򣬸÷��������ֵĸ��������һ��
	                    sum=sum+pn;
	                    py=px;
	                    px=0;
	                }else{ // x������Ϊ0�� y��������Ϊ0����Ϊ���� -> ����
	                    sum=sum+pn;
	                    px=-py;
	                    py=0;
	                }
	            }
	        }
		    System.out.println("˳ʱ�������");
	        for(int i = 1; i<=n;i++) {
	            for(int j=1;j<=n;j++){
	                System.out.print(rect[j][i]+"\t"); // ��ת��ԭ���
	            }
	            System.out.println();
	        }
	        System.out.println("��ʱ�������");
	        for(int i = 1; i<=n;i++) {
	            for(int j=1;j<=n;j++){
	                System.out.print(rect[i][j]+"\t"); // ��ת��ԭ���
	            }
	            System.out.println();
	    }
	  }
	  
	}



