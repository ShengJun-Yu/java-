package ���ӻ�����;
import java.awt.*;
import java.awt.event.*;

public class ���а�ť��С���� {
	public static void main(String[] args ) {
		final Frame f=new Frame("���Ĵ���");
		f.setLayout(new FlowLayout(FlowLayout.LEFT,20,30));
		f.setSize(500,500);
		f.setLocation(500,500);
		Button but1=new Button("��һ����ť");
		f.add(but1);
		but1.addActionListener(new ActionListener() {
			private int num=1;
			public void actionPerformed(ActionEvent e) {
				f.add(new Button("��"+ ++num+"����ť"));
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




