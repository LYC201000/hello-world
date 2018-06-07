package PR;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.kosea.kmove30.JDBC_Manager2;

public class RemoveActionListener2 implements ActionListener {
	JTable table;
	JDBC_Manager2 jdbcManager2;

	public RemoveActionListener2(JDBC_Manager2 jdbcManager2, JTable table) {
		super();
		this.table = table;
		this.jdbcManager2 = jdbcManager2;
	}

	public void actionPerformed(ActionEvent e) {

		int confirm = JOptionPane.showConfirmDialog(null, "혼도우?", "삭제", JOptionPane.YES_NO_OPTION,
				JOptionPane.WARNING_MESSAGE);

		System.out.println("confirm" + confirm);

		if (confirm == 1)// 아니요를 선태하면 
			return;		 // 종료

		int row = table.getSelectedRow();

		if (row == -1)
			return;
		DefaultTableModel model = (DefaultTableModel) table.getModel();

		// 삭제될 이름
		Object name = table.getValueAt(row, 0);
		String deleteName = (String) name.toString();
		System.out.println(deleteName);
		///////////////////////////////////

		model.removeRow(row); // 선택된 행을 삭제
		// DB Table 레코드(데이터) 삭제
		try {
			jdbcManager2.deleteTable(deleteName);

		} catch (Exception ex) {
			// TODO Auto-generated catch block
			ex.getMessage();
		}

	}
}