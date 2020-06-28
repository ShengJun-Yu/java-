package 可视化窗口;

import java.awt.*;
import java.awt.event.*;

public class 窗口内加文字 {
	public static void main(String[] args ) {
		Frame f=new Frame("Stephen Jun专用记事本");

		Color color=Color.green;
		f.setSize(500,500);
		f.setLocation(500,500);
		f.setVisible(true);
		f.setBackground(color);
		Button btn=new Button("就不退出");
		f.add(btn);
		btn.addMouseListener(new MouseAdapter(){
			public void mouseCliked(MouseEvent e) {
				System.exit(0);
			}
		});
				
	}

}

