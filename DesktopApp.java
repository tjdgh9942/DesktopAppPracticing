import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.*;

public class DesktopApp{
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame("HelloWorld GUI");
				// 프레임 창을 어떻게 닫을 것인지 설정
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				// 프레임 틀을 어느 정도로 크기를 설정할지
				frame.setPreferredSize(new Dimension(400, 300));
			    JLabel label = new JLabel("Hello World!!", SwingConstants.CENTER);
			    // label 문구를 가져옴
			    frame.getContentPane().add(label);
			    // 화면 세부 설정
			    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
			    frame.setLocation(dim.width/2-400/2, dim.height/2-300/2);
			    
			    frame.pack();
			    frame.setVisible(true);
			}
		});
	}
}