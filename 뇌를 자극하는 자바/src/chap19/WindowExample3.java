package chap19;

import java.awt.Button;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
// grid layout 사용
public class WindowExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("zoo Program");
		frame.setPreferredSize(new Dimension(600,300));
		
		//frame.setLocation(800, 600);
		Container containerPane = frame.getContentPane();
		
		
		GridBagLayout layout = new GridBagLayout();
		containerPane.setLayout(layout);
		containerPane.add(new JButton("얼룩말"));
		containerPane.add(new JButton("코끼리"));
		containerPane.add(new JButton("코뿔소"));	
		containerPane.add(new JButton("펭귄"));
		containerPane.add(new JButton("하이에나"));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);


	}

}
