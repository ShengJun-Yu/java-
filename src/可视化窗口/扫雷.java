package ���ӻ�����;
import java.util.Random;
import java.util.Scanner;

public class ɨ�� {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x,y;
        int a[][]=new int[10][20];
        produce(a);
        show(a);
        while(true){
            x=scanner.nextInt();y=scanner.nextInt();
            if(x<=0||y<=0||x>10||y>20) {System.out.println("Խ�磡��");continue;} //��ֹԽ��
            if(a[x-1][y-1]>=10) {System.out.println("�ѿ�������");continue;}       //��ֹ���ظ�
            if(bomb(a,x,y)) break;
            draw(a,x,y);
            show(a);
            if(All(a)){ System.out.println("��ܹ������е��ף�����");break; }
        }
    }
    public static void show(int a[][]) {
        int lie = 0,x =0,y=0;
        System.out.print("  ��1 ");
        for (short i = 2; i <= 20; i++){
            if(i<9)System.out.print("��"+i+" ");
            else System.out.print("��"+i);
        }
        System.out.println();
        System.out.print("  ");
        for (short i = 0; i <= 20; i++) {    //�����һ��

            if (i == 0) System.out.print("����");
            else if (i == 20) System.out.println("��");
            else System.out.print("�ש�");
        }
        for (short i = 1; i < 2 * 10; i++) {
            if (i % 2 == 0) {
                System.out.print("  ");
                for (short j = 0; j <= 20; j++) {
                    if (j == 0) System.out.print("�ǩ�");
                    else if (j == 20) System.out.println("��");
                    else System.out.print("�賓");
                }
            }
            if (i % 2 == 1) {
                if(lie+1 >= 10) System.out.print(lie+1);else System.out.print(" " + (lie+1));lie++;
                for (short j = 0; j <= 2*20; j++) {
                    if (j % 2 == 0) System.out.print("��");
                    else {
                                if(a[x][y] <= 8) System.out.print("��");
                                if(a[x][y] == 9) System.out.print("?");
                                if(a[x][y] == 10) System.out.print("?");
                                if(a[x][y] == 11) System.out.print("��");
                                if(a[x][y] == 12) System.out.print("��");
                                if(a[x][y] == 13) System.out.print("��");
                                if(a[x][y] == 14) System.out.print("��");
                                if(a[x][y] == 15) System.out.print("��");
                                if(a[x][y] == 16) System.out.print("��");
                                if(a[x][y] == 17) System.out.print("��");
                                if(a[x][y] == 18) System.out.print("��");
                                y++;
                                if(y>=20){
                                    x++;y =0;
                                }
                    }
                }
                System.out.println();
            }
        }
        System.out.print("  ");
        for (short k = 0; k <= 20; k++) {   //������һ��
            if (k == 0) System.out.print("����");
            else if (k == 20) System.out.println("��");
            else System.out.print("�ߩ�");
        }
    }
    public static void produce(int a[][]){
        int random[] = new int[25];        //��
        Random random1 = new Random();
        for(short i =0;i<25;){             //��
            short j = 0;
            int t = random1.nextInt()%200+1;
            if(t<0)t=-t;
            for(;j<25;j++){                //��
                if(random[j]==t)break;
            }
            if(j==25){random[i]=t;i++;}    //��
        }
        java.util.Arrays.sort(random);
        int x = 0;
        System.out.println();
        for(int i = 0; i<10;i++){                  //�������óɹ�
            for(int j = 0 ;j<20 ;j++){
                if(x == 25)break;         //��
                if((i*20)+j+1 == random[x])
                {a[i][j]=-1;x++;}
            }
        }
        //*************���õ����ܱ߲���********************
        for(short i = 0;i<10;i++){
            for(short j = 0;j<20;j++){
                if(a[i][j]==0){
                    int count=0;
                    if(i!=0&&j!=0&&a[i-1][j-1]==-1       ) count++;        //����
                    if(i!=0&&a[i-1][j]==-1               ) count++;        //��
                    if(i!=0&&j<=18&&a[i-1][j+1]==-1      ) count++;        //����
                    if(j!=0&&a[i][j-1]==-1               ) count++;        //��
                    if(j<=18&&a[i][j+1]==-1              ) count++;        //��
                    if(i<=8&&j!=0&&a[i+1][j-1]==-1       ) count++;        //����
                    if(i<=8&&a[i+1][j]==-1               ) count++;        //��
                    if(i<=8&&j<=18&&a[i+1][j+1]==-1      ) count++;        //����
                    a[i][j]=count;
                }
            }
        }
    }
    //*******************************����****************************8
    public static void draw(int a[][],int x,int y){
        a[x-1][y-1]+=10;
        if(a[x-1][y-1]==10) {
            if (x - 1 > 0 && y - 1 > 0 && a[x - 2][y - 2] < 10 && a[x - 2][y - 2] != -1) draw(a, x - 1, y - 1);  //����
            if (x - 1 > 0 && a[x - 2][y - 1] < 10 && a[x - 2][y - 1] != -1) draw(a, x - 1, y);              //��
            if (x - 1 > 0 && y - 1 < 19 && a[x - 2][y] < 10 && a[x - 2][y] != -1) draw(a, x - 1, y + 1);  //����

            if (y - 1 > 0 && a[x - 1][y - 2] < 10 && a[x - 1][y - 2] != -1) draw(a, x, y - 1);          //zuo
            if (y - 1 <= 18 && a[x - 1][y] < 10 && a[x - 1][y] != -1) draw(a, x, y + 1);  //you

            if (x - 1 < 9 && y - 1 > 0 && a[x][y - 2] < 10 && a[x][y - 2] != -1) draw(a, x + 1, y - 1);   //zuo xia
            if (x - 1 < 9 && a[x][y - 1] < 10 && a[x][y - 1] != -1) draw(a, x + 1, y);//xia
            if (x - 1 < 9 && y - 1 < 19 && a[x][y] < 10 && a[x][y] != -1) draw(a, x + 1, y + 1);//you xia
        }
    }
    //*******************************��ը******************************
    public static boolean bomb(int a[][],int x ,int y){

        if(a[x-1][y-1]==-1){
            for(int i =0;i<10;i++){
                for(int j = 0 ;j<20;j++){
                  if(a[i][j]==-1)a[i][j]+=10;
                }
            }
            show(a);
            System.out.println("�����ˣ�����");
        return true;}else return false;
    }
    //*******************************ȫ����********************
    public static boolean All(int a[][]){
        int i,j=0,t=0;
        for(i =0;i<10;i++){
            for(j = 0 ;j<20;j++){
                if(a[i][j]<10) t++;
                if(t>25)break;         //��
            }
        }
        if(t==25)return true;else return false;   //��
    }
}