
	class car{
		private String carname;
		//���췽��
		public car(String carname) {
			this.carname = carname;
		}
		public void show() {
			System.out.println("����"+carname+",���л�������");
		}
	}
	class Radarcar{
		public car myCar; //����һ��car�Ķ���
		//���캯��
		public Radarcar(car myCar) {
			this.myCar = myCar;
		}
		public void show() {
			myCar.show(); //���ö������ car ��show()�ķ���
			System.out.println("���е����״﹦��");
		}
	}
	public class ��װ {
		public static void main(String[] args) {
			car benz = new car("benz");   //����һ��car�Ķ���,���Զ�����car�д������Ĺ��췽��
			System.out.println("-------------��װǰ---------------");
			benz.show();
			Radarcar benz_A = new Radarcar(benz);
			System.out.println("-------------��װ��---------------");
			benz_A.show();

		}

	}

