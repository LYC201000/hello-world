package PR;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import com.kosea.kmove30.JDBC_Manager2;

public class UpdateActionListener2 implements ActionListener {
	JDBC_Manager2 jdbcManager2;
	JTextField text1, text2;
	JTable table;

	public UpdateActionListener2(JDBC_Manager2 jdbcManager2, JTextField text1, JTextField text2,JTable table) {
		super();
		this.jdbcManager2 = jdbcManager2;
		this.text1 = text1;
		this.text2 = text2;
		this.table = table;
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// DB수정
		try {
			String cname = text1.getText();
			String phoneNum = text2.getText();
			jdbcManager2.updateTable(cname, phoneNum);
			
			SelectActionListener2 selectActionListener2 = 
					new SelectActionListener2(jdbcManager2, table);
			selectActionListener2.actionPerformed(e);
			JOptionPane.showConfirmDialog(null, "수정되었습니다", "수정메세지", JOptionPane.YES_NO_OPTION,
					JOptionPane.WARNING_MESSAGE);

		} catch (Exception ex) {
			// TODO Auto-generated catch block
			System.out.println(ex.getMessage());
		}

	}

}
