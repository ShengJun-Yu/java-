package 可视化窗口;
import java.awt.*;
import java.awt.event.*;

public class 建有按钮的小窗口 {
	public static void main(String[] args ) {
		final Frame f=new Frame("他的窗口");
		f.setLayout(new FlowLayout(FlowLayout.LEFT,20,30));
		f.setSize(500,500);
		f.setLocation(500,500);
		Button but1=new Button("第一个按钮");
		f.add(but1);
		but1.addActionListener(new ActionListener() {
			private int num=1;
			public void actionPerformed(ActionEvent e) {
				f.add(new Button("第"+ ++num+"个按钮"));
				f.setVisible(true);	
			}
		});		
		f.setVisible(true);	
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent args) {
			super.windowClosing(args);
				System.exit(0);
			}
		});
	}			
}




