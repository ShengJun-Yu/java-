
	class car{
		private String carname;
		//构造方法
		public car(String carname) {
			this.carname = carname;
		}
		public void show() {
			System.out.println("我是"+carname+",具有基本功能");
		}
	}
	class Radarcar{
		public car myCar; //创建一个car的对象
		//构造函数
		public Radarcar(car myCar) {
			this.myCar = myCar;
		}
		public void show() {
			myCar.show(); //利用对象调用 car 中show()的方法
			System.out.println("具有倒车雷达功能");
		}
	}
	public class 包装 {
		public static void main(String[] args) {
			car benz = new car("benz");   //创建一个car的对象,会自动调用car中带参数的构造方法
			System.out.println("-------------包装前---------------");
			benz.show();
			Radarcar benz_A = new Radarcar(benz);
			System.out.println("-------------包装后---------------");
			benz_A.show();

		}

	}

