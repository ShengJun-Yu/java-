package ���ӻ�����;

import java.awt.*;
import java.awt.event.*;

public class �����ڼ����� {
	public static void main(String[] args ) {
		Frame f=new Frame("Stephen Junר�ü��±�");

		Color color=Color.green;
		f.setSize(500,500);
		f.setLocation(500,500);
		f.setVisible(true);
		f.setBackground(color);
		Button btn=new Button("�Ͳ��˳�");
		f.add(btn);
		btn.addMouseListener(new MouseAdapter(){
			public void mouseCliked(MouseEvent e) {
				System.exit(0);
			}
		});
				
	}

}

