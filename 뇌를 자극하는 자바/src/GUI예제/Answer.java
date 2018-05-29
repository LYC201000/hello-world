package GUI예제;
import java.awt.*;

import javax.swing.*;

public class Answer {

	public static void main(String[] args) {

		JFrame frame = new JFrame("덧셈프로그램");

		frame.setLocation(500, 400);

		Container contentPane = frame.getContentPane();

		JPanel pane1 = new JPanel();

		JPanel pane2 = new JPanel();

		contentPane.add(pane1, BorderLayout.CENTER);

		contentPane.add(pane2, BorderLayout.SOUTH);

		pane1.setLayout(new FlowLayout());

		JTextField text1 = new JTextField(5);

		JTextField text2 = new JTextField(5);

		JTextField text3 = new JTextField(5);

		pane1.add(text1);

		pane1.add(new JLabel("+"));

		pane1.add(text2);

		pane1.add(new JLabel("="));

		pane1.add(text3);

		pane2.setLayout(new FlowLayout());

		JButton button1 = new JButton("확인");

		JButton button2 = new JButton("취소");

		pane2.add(button1);

		pane2.add(button2);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ConfirmButtonActionListener actionListener1 = new ConfirmButtonActionListener(text1, text2, text3);

		// 확인 버튼을 처리하는 이벤트 리스너 클래스를 불러옴

		CancelButtonActionListener actionListener2 = new CancelButtonActionListener(text1, text2, text3);

		// 취소 버튼을 처리하는 이벤트 리스너 클래스를 불러옴

		button1.addActionListener(actionListener1);

		button2.addActionListener(actionListener2);

		frame.pack();

		frame.setVisible(true);

	}

}
