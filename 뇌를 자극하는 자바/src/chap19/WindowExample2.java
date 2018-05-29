package chap19;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.sun.mail.handlers.image_gif;
import com.sun.prism.Image;

public class WindowExample2 {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Hello program");
		frame.setPreferredSize(new Dimension(200, 100));
		// frame.setLocation(500, 400);

		// ImageIcon image = new ImageIcon("image/java.png");
		// JLabel ImageLabel = new JLabel(image);

		Container containerPane = frame.getContentPane();

		JTextField text = new JTextField();
		JTextField text2 = new JTextField();

		JPanel jpanel = new JPanel();
		jpanel.add(text);
		jpanel.add(text2);

		JTextField text1 = new JTextField("이름을 입력하세여");
		JButton button = new JButton("확인");
		JLabel label = new JLabel("Hello");

		containerPane.add(text1, BorderLayout.CENTER);
		containerPane.add(button, BorderLayout.EAST);
		containerPane.add(label, BorderLayout.SOUTH);

		// containerPane.add(ImageLabel, BorderLayout.SOUTH);

		ActionListener listener = new ConfirmButtonActionListener(text1, label); // 인터페이스를 구현한 클래스
		button.addActionListener(listener);
		button.addActionListener(new ConfirmButtonActionListener(text, label));
		
		text.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				
			}
		});

		

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null); // 화면 중앙배치

	}

}
