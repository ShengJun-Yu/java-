
class Study{
		public void eat(){
			System.out.println("ѧ��ȥʳ�óԷ�");
		}
		public void sleep() {
			System.out.println("ѧ��������˯��");
		}
		public void jiaogong() {
			System.out.println("��ʦȥ�̹������Է���");
		}
		public void school() {
			System.out.println("��ʦ��ѧУ��Ԣ˯����");
		}
		public void chifan() {
			System.out.println("�ҳ�ȥ�д������ݳԷ���");
		}
		public void shuijiao() {
			System.out.println("�ҳ����д���˯����");
		}
		public void likai() {
			System.out.println("�쵼���극���뿪��");
		}
		public void shangcesuo() {
			System.out.println("�쵼�����뿪֮���ȥ�ϲ����ˣ�");
		}
		public void chifanbuyaoqian() {
			System.out.println("�����쵼���극��Ҫ��Ǯ���ر�ˬ��");
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


