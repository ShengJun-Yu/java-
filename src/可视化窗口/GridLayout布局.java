package 可视化窗口;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;

public class GridLayout布局 {
	public static void main(String[]args) {
		Frame f=new Frame("GridLayout");
		f.setLayout(new GridLayout(4,4));
		f.setSize(400,400);
		f.setLocation(400,400);
		for (int i=1;i<=9;i++) {//添加循环
			Button btn=new Button("btn"+1);
			f.add(btn);
		
		}
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(java.awt.event.WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				System.exit(0);
			}
		});
	}

}
