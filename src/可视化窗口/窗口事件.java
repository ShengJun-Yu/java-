package 可视化窗口;

import java.awt.*;
import java.awt.event.*;

public class 窗口事件 {
	public static void main(String[] args) {
		 final Frame f=new Frame("Stephen Jun专用记事本");

		Color color=Color.green;
		f.setSize(500,500);
		f.setLocation(500,500);
		f.setVisible(true);
		//使用内部类创建Stephen Jun专用记事本 实例对象，监听对象
		f.addWindowListener(new WindowListener(){
			public void windowOpened(WindowEvent e) {
				System.out.println("windowOpened---窗体打开事件");
			}
			public void windowIconified(WindowEvent e) {
				System.out.println("windowIconified---窗体图标化事件");
		}
			public void windowDeiconified(WindowEvent e) {
				System.out.println("windowDeiconified---窗体取消图标化事件");
	}
			public void windowDeactivated(WindowEvent e) {
				System.out.println("windowDeactivated---窗体停用事件");
	}
			public void windowClosing(WindowEvent e) {
				System.out.println("windowClosing---窗体正在关闭事件");
				((Window)e.getComponent()).dispose();
			}
			public void windowClosed(WindowEvent e) {
				System.out.println("windowClosed---窗体关闭事件");
			}
			public void windowActivated(WindowEvent e) {
				System.out.println("windowActivated---窗体激活事件");
			}		
});
}
	}