package chap19;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.sun.prism.paint.Color;
// flow layout 사용
public class WindowExample4 {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Fruit Basket Program");
		// frame.setPreferredSize(new Dimension(600,300));
		frame.setLocation(500, 400);
		//색상
//		Color color = new Color(205,250,100);
//		frame.getContentPane().setBackground(color);
		Container containerPane = frame.getContentPane();
		FlowLayout layout = new FlowLayout();
		containerPane.setLayout(layout);
		
		JTextField text1= new JTextField(5);
		JTextField text2= new JTextField(5);
		JTextField text3= new JTextField(5);
		JButton okbtn = new JButton("확인");
		JButton cancelbtn = new JButton("취소");
		
		
		
		
		containerPane.add(new JTextField(5));
		containerPane.add(new JLabel("+"));
		containerPane.add(new JTextField(5));
		containerPane.add(new JLabel("="));
		containerPane.add(new JTextField(5));
		containerPane.add(okbtn);
		containerPane.add(cancelbtn);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);

	}

}
