package chap19;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class aaaaaaaaaaaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("로그인");
		frame.setPreferredSize(new Dimension(250, 150));
		frame.setLocation(500, 400);
		
		
		
//		String str= text.getText();
//		label.setText(str);

		Container contentPane = frame.getContentPane();
		JPanel panel = new JPanel();   //패널생성
		panel.setLayout(new GridLayout(3, 2));// 패널의 레이아웃을 설정합니다
		JTextField Text1 = new JTextField();	//
		JTextField Text2 = new JTextField();	//
		JTextField Text3 = new JTextField();	//
												//
		panel.add(new JLabel("아이디"));			//
		panel.add(Text1);						//
												// 컴포넌트를 생성해서 패널에 추가
		panel.add(new JLabel("+"));			//
		panel.add(Text2);						//
												//
		panel.add(new JLabel("전화번호"));		//
		panel.add(Text3);                   	//

		contentPane.add(panel, BorderLayout.CENTER); //패널을 content pane에 추가
		contentPane.add(new JButton("입력"), BorderLayout.SOUTH);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);

	}

}