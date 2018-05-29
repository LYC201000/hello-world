package GUI예제;
import javax.swing.*;
import java.awt.event.*;
//취소 버튼을 처리하는 이벤트 리스너 클래스
class CancelButtonActionListener implements ActionListener {
	JTextField text1, text2, text3;

	CancelButtonActionListener(JTextField text1, JTextField text2, JTextField text3) {
		this.text1 = text1;
		this.text2 = text2;
		this.text3 = text3;
	}

	public void actionPerformed(ActionEvent e) {
		text1.setText("");
		text2.setText("");
		text3.setText("");
	}
}