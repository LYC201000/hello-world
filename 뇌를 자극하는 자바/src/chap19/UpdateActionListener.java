package chap19;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import com.kosea.kmove30.JDBC_Manager;

public class UpdateActionListener implements ActionListener {
	JDBC_Manager jdbcManager;
	JTextField text1, text2;

	public UpdateActionListener(JDBC_Manager jdbcManager, JTextField text1, JTextField text2) {
		super();
		this.jdbcManager = jdbcManager;
		this.text1 = text1;
		this.text2 = text2;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// DB수정
		try {
			String name = text1.getText();
			String age = text2.getText();
			jdbcManager.updateTable(name, age);

		} catch (Exception ex) {
			// TODO Auto-generated catch block
			System.out.println(ex.getMessage());
		}

	}

}
