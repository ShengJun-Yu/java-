package ���ӻ�����;

import java.awt.*;
import java.awt.event.*;

public class �����������¼� {
		public static void main(String[] args) {
			 final Frame f=new Frame("Stephen Junר�ü��±�");

			Color color=Color.green;
			f.setSize(500,500);
			f.setLocation(500,500);
			f.setVisible(true);
			Button but =new Button("Button");
			f.add(but);
			but.addMouseListener(new MouseListener() {
				public void mouseReleased(MouseEvent e) {
					System.out.println("mouseReleased---�����¼�");
				}
				public void mousePressed(MouseEvent e) {
					System.out.println("mousePressed---�����¼�");
				}
				public void mouseExited(MouseEvent e) {
					System.out.println("mouseExited---�����¼�");
				}
				public void mouseEntered(MouseEvent e) {
					System.out.println("mouseEntered---�����¼�");
				}
				public void mouseClickes(MouseEvent e) {
					System.out.println("mouseClickes---�����¼�");
				}
				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
	});
	}
		}


