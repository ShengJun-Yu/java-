  package 可视化窗口;
import java.awt.*;
import java.awt.event.*;

public class 可关闭的窗口 {
	public static void main(String[] args ) {
		Frame f=new Frame("记事本"+"   "+"文件  格式  编辑  查看  帮助");

		Color color=Color.green;
		f.setSize(500,500);
		f.setLocation(500,500);
		f.setVisible(true);
		f.setBackground(color);
		MyWindowListener mw=new MyWindowListener();
		f.addWindowListener(mw);	
		Button btn=new Button("就不退出");
		btn.addMouseListener(new MouseAdapter(){
			public void mouseCliked(MouseEvent e) {
				System.exit(0);
			}
		});
	}
}
class MyWindowListener implements WindowListener{
	public void windowClosing(WindowEvent e) {
		Window window=e.getWindow();
		window.setVisible(false);
		window.dispose();	
	}
	public void windowActivated(WindowEvent e) {
	}
	public void windowClosed(WindowEvent e) {
	}
	public void windowDeactivated(WindowEvent e) {
	}	
	public void windowDeiconified(WindowEvent e) {
	}
	public void windowconified(WindowEvent e) {
	}
	public void windowOpened(WindowEvent e) {
	}
	public void windowIconified(WindowEvent e) {
	}
}




