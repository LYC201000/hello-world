package PR;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;
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

		UIManager UI5 = new UIManager();
		UI5.put("OptionPane.background", Color.black);
		UI5.put("Panel.background", Color.black);
		UI5.put("Button.background", Color.black);
		UI5.put("OptionPane.messageForeground", Color.green);
		UI5.put("Button.messageForeground", Color.green);
		int confirm = JOptionPane.showConfirmDialog(null, "삭제하시겠습니까?", "삭제", JOptionPane.YES_NO_OPTION,
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