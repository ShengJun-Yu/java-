package ���ӻ�����;

import java.awt.*;
import java.awt.event.*;

public class �����¼� {
	public static void main(String[] args) {
		 final Frame f=new Frame("Stephen Junר�ü��±�");

		Color color=Color.green;
		f.setSize(500,500);
		f.setLocation(500,500);
		f.setVisible(true);
		//ʹ���ڲ��ഴ��Stephen Junר�ü��±� ʵ�����󣬼�������
		f.addWindowListener(new WindowListener(){
			public void windowOpened(WindowEvent e) {
				System.out.println("windowOpened---������¼�");
			}
			public void windowIconified(WindowEvent e) {
				System.out.println("windowIconified---����ͼ�껯�¼�");
		}
			public void windowDeiconified(WindowEvent e) {
				System.out.println("windowDeiconified---����ȡ��ͼ�껯�¼�");
	}
			public void windowDeactivated(WindowEvent e) {
				System.out.println("windowDeactivated---����ͣ���¼�");
	}
			public void windowClosing(WindowEvent e) {
				System.out.println("windowClosing---�������ڹر��¼�");
				((Window)e.getComponent()).dispose();
			}
			public void windowClosed(WindowEvent e) {
				System.out.println("windowClosed---����ر��¼�");
			}
			public void windowActivated(WindowEvent e) {
				System.out.println("windowActivated---���弤���¼�");
			}		
});
}
	}