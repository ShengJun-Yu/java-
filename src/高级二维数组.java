
public class 高级二维数组 {
	public static void main(String []args) {
		char[][] anawers = {
				{'A','B','A','C','C','D','E','E','A','D'},
				{'D','B','A','B','C','A','E','E','A','D'},
				{'E','D','D','A','C','B','E','E','A','E'},
				{'C','B','A','E','D','C','E','E','A','D'},
				{ 'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D' } };
	  char[] keys = { 'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D' };//定义正确答案的数组
	  for(int i=0;i<anawers.length;i++) {
		  int correctCount=0;
		  for(int j=0;j<anawers[i].length;j++) {
			  if(anawers[i][j]==keys[j])
				  correctCount++;
		  }
		  int a=0;
			 a=keys.length-correctCount;
		  System.out.println("学生"+i+"答对的个数为"+correctCount);
		  System.out.println("答错的个数为"+a);
		}
	}

}
