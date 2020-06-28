package 可视化窗口;

import java.awt.*;
import java.awt.event.*;

public class 窗口中鼠标的事件 {
		public static void main(String[] args) {
			 final Frame f=new Frame("Stephen Jun专用记事本");

			Color color=Color.green;
			f.setSize(500,500);
			f.setLocation(500,500);
			f.setVisible(true);
			Button but =new Button("Button");
			f.add(but);
			but.addMouseListener(new MouseListener() {
				public void mouseReleased(MouseEvent e) {
					System.out.println("mouseReleased---鼠标打开事件");
				}
				public void mousePressed(MouseEvent e) {
					System.out.println("mousePressed---鼠标打开事件");
				}
				public void mouseExited(MouseEvent e) {
					System.out.println("mouseExited---鼠标打开事件");
				}
				public void mouseEntered(MouseEvent e) {
					System.out.println("mouseEntered---鼠标打开事件");
				}
				public void mouseClickes(MouseEvent e) {
					System.out.println("mouseClickes---鼠标打开事件");
				}
				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
	});
	}
		}


