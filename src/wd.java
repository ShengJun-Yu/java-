
class Study{
		public void eat(){
			System.out.println("学生去食堂吃饭");
		}
		public void sleep() {
			System.out.println("学生回寝室睡觉");
		}
		public void jiaogong() {
			System.out.println("教师去教工餐厅吃饭！");
		}
		public void school() {
			System.out.println("教师回学校公寓睡觉！");
		}
		public void chifan() {
			System.out.println("家长去招待所饭馆吃饭！");
		}
		public void shuijiao() {
			System.out.println("家长回招待所睡觉！");
		}
		public void likai() {
			System.out.println("领导吃完饭就离开！");
		}
		public void shangcesuo() {
			System.out.println("领导吃完离开之后就去上厕所了！");
		}
		public void chifanbuyaoqian() {
			System.out.println("而且领导吃完饭不要给钱，特别爽！");
		}
	}
	class Pipe extends Study{
		
	}
	
	class Teacher extends Study{
		
	}
	class Parents extends Study{
		
	}
	class lingdao extends Study{
		
	}
	public class wd {
		public static void main(String[] args) {
			Pipe p=new Pipe();
			p.eat();	
			Teacher t=new Teacher();
			t.jiaogong();
			t.school();
			Parents a=new Parents();
			a.chifan();
			a.shuijiao();
			lingdao l=new lingdao();
			l.likai();
			l.shangcesuo();
			l.chifanbuyaoqian();
		}

	}


