package chap19;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ConfirmButtonActionListener implements ActionListener {

	JTextField text;
	JLabel label;

	public ConfirmButtonActionListener(JTextField text, JLabel label) {
		super();
		this.text = text;
		this.label = label;
	}

	public ConfirmButtonActionListener(JTextField text1, JTextField text2, JTextField text3) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		//버튼이 클릭됫을때 발생

		String name = text.getText();
		if(name.equals("이름을 입력하세여"))
			
		label.setText("HI," + name);
		else
			label.setText("HI");
			

	}

}
