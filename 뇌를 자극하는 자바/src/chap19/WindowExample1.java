package chap19;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import com.sun.javafx.tk.Toolkit;

public class WindowExample1 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Hello Java program");
		
		//Dimension dim = Toolkit.getDefault().
				
		Container contenPane = frame.getContentPane();
		frame.setLocation(500, 400);
		
		frame.setPreferredSize(new Dimension(400, 400));
		
		JLabel label = new JLabel("ㅋㅋㅋのろのろㅋㅋㅋㅋㅋ",SwingConstants.CENTER);
		contenPane.add(label);
		
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.pack();
		frame.setVisible(true);
		//frame.setLocationRelativeTo(null); // 화면 정중앙 배치

	}

}
