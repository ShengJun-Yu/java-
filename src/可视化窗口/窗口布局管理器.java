package ���ӻ�����;
import java.awt.*;
import java.awt.event.WindowAdapter;

import com.sun.glass.events.WindowEvent;

public class ���ڲ��ֹ����� {
	public static void main (String[]args) {
		final Frame f=new Frame("BorderLayout");
		f.setLayout(new BorderLayout());
		f.setSize(500,500);
		f.setLocation(500,500);
		f.setVisible(true);
		Button but1=new Button("����");
		Button but2=new Button("����");
		Button but3=new Button("�ϲ�");
		Button but4=new Button("����");
		Button but5=new Button("�в�");
		f.add(but1,BorderLayout.EAST);
		f.add(but2,BorderLayout.WEST);
		f.add(but3,BorderLayout.SOUTH);
		f.add(but4,BorderLayout.NORTH);
		f.add(but5,BorderLayout.CENTER);
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
