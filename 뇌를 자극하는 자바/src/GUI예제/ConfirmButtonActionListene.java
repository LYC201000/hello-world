package GUI예제;
import javax.swing.*;
import java.awt.event.*;
class ConfirmButtonActionListener implements ActionListener {
	JTextField text1, text2, text3;

	ConfirmButtonActionListener(JTextField text1, JTextField text2, JTextField text3) {
		this.text1 = text1;
		this.text2 = text2;
		this.text3 = text3;
	}

	public void actionPerformed(ActionEvent e) {
		int num1 = Integer.parseInt(text1.getText());
		int num2 = Integer.parseInt(text2.getText());
		int sum = num1 + num2;
		text3.setText(sum + "");
	}
}