package chap19;

import java.awt.Container;
import java.awt.GridBagLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class WindowExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Cafe Program");
		frame.setLocation(500, 400);
		Container containerPane = frame.getContentPane();

		BoxLayout layout = new BoxLayout(containerPane,BoxLayout.X_AXIS);
		
		containerPane.setLayout(layout);
		containerPane.add(new JButton("자바"));
		containerPane.add(new JButton("에스프레소"));
		containerPane.add(new JButton("카푸치노"));
		containerPane.add(new JButton("블루마운틴"));
		containerPane.add(new JButton("콜럼비아"));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);

	}

}
