package chap19;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.kosea.kmove30.JDBC_Manager;

class AddActionListener implements ActionListener {
	JTable table;
	JTextField text1, text2, text3;
	JDBC_Manager jdbcManager;
	JComboBox genderComboBox;
	
	public AddActionListener( JDBC_Manager jdbcManager,JTable table, JTextField text1, JTextField text2,
			JComboBox genderComboBox) {
		super();
		this.table = table;
		this.text1 = text1;
		this.text2 = text2;
		this.jdbcManager = jdbcManager;
		this.genderComboBox = genderComboBox;
	}


	public AddActionListener(JDBC_Manager jdbcManager,
							JTable table, 
							JTextField text1,
							JTextField text2, 
							JTextField text3) {
		super();
		this.jdbcManager = jdbcManager; 
		this.table = table;
		this.text1 = text1;
		this.text2 = text2;
		this.text3 = text3;
	}
	
	// 텍스트상자에 입력된 값을 가지고 테이블의 마지막에 행을 추가함
	public void actionPerformed(ActionEvent e) {

		// TODO Auto-generated method stub
		String arr[] = new String[3];
		arr[0] = text1.getText();
		arr[1] = text2.getText();
		arr[2] = genderComboBox.getSelectedItem().toString();
		
		
		if(arr[2].equals("골라")) {
			JOptionPane.showConfirmDialog(null, "성별을 선택해라",
					"경고메세지", JOptionPane.WARNING_MESSAGE);

			
			return;//종료
		}
			
		//arr[2] = text3.getText();// TEXT3 데이터를 셋팅
		//int select
		
		// System.out.println("SelectedIndex"+ SelectedIndex);
		// System.out.println("item" + item.toString());
		
		//arr[2] = text3.getText();// TEXT3 데이터를 셋팅
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		boolean isCheck = false;  // 입력창 체크상태

		for (int i = 0; i < arr.length; i++) {	
			if (arr[i].length() > 0)
				isCheck = true;
			else
				isCheck = false;
			System.out.println("arr[" + i + "]:" + arr[i]);

		}

		if (isCheck)
			model.addRow(arr); // 레코드에 데이터 추가
		try {
		jdbcManager.insertTable(arr);
		}catch (Exception ex) {
			ex.getMessage();
		}
		// 입력창 빈칸 만들기
		text1.setText("");
		text2.setText("");
		//text3.setText("");
		// 콤보박스 "선택"를 선택
		genderComboBox.setSelectedIndex(0);
		//text3.setText("");

	}

}