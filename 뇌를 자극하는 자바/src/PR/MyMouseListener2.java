package PR;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

public class MyMouseListener2 extends MouseAdapter {

	JTextField text1, text2, text3;
	JComboBox genderComboBox;

	public MyMouseListener2(JTextField text1, JTextField text2, JComboBox genderComboBox) {
		super();
		this.text1 = text1;
		this.text2 = text2;
		this.genderComboBox = genderComboBox;
	}

	public MyMouseListener2(JTextField text1, JTextField text2, JTextField text3) {
		super();
		this.text1 = text1;
		this.text2 = text2;
		this.text3 = text3;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		super.mouseClicked(e);
		// 마우스클릭이벤트발생시
		JTable table = (JTable) e.getSource();
		int row = table.getSelectedRow(); // 선택되어진 row구하기
		if (row != -1) { // 셀이 선택되어진 상태인경우
			System.out.println(row);
			System.out.println(table.getValueAt(row, 0));

			text1.setText((String) table.getValueAt(row, 0));
			text2.setText((String) table.getValueAt(row, 1));
			String genderStr = ((String) table.getValueAt(row, 2));
			if (genderStr.equals("남")) {
				// 콤보박스 "남"를 선택
				genderComboBox.setSelectedIndex(1);
			} else if (genderStr.equalsIgnoreCase("여")) {
				// 콤보박스 "여"를 선택
				genderComboBox.setSelectedIndex(2);
			} else {
				// 콤보박스 "선택"를 선택
				genderComboBox.setSelectedIndex(0);
			}

			// System.out.println("SelectedIndex"+ SelectedIndex);
			// System.out.println("item" + item.toString());

			// text3.setText((String)table.getValueAt(row, 2));

		}

	}
	public void mouseClicked1(MouseEvent e) {
		super.mouseClicked(e);
		// 마우스클릭이벤트발생시
		JTable table = (JTable) e.getSource();
		int row = table.getSelectedRow(); // 선택되어진 row구하기
		if (row != -1) { // 셀이 선택되어진 상태인경우
			System.out.println(row);
			System.out.println(table.getValueAt(row, 0));

			text1.setText((String) table.getValueAt(row, 0));
			text2.setText((String) table.getValueAt(row, 1));
			String genderStr = ((String) table.getValueAt(row, 2));
			if (genderStr.equals("남")) {
				// 콤보박스 "남"를 선택
				genderComboBox.setSelectedIndex(1);
			} else if (genderStr.equalsIgnoreCase("여")) {
				// 콤보박스 "여"를 선택
				genderComboBox.setSelectedIndex(2);
			} else {
				// 콤보박스 "선택"를 선택
				genderComboBox.setSelectedIndex(0);
			}

			// System.out.println("SelectedIndex"+ SelectedIndex);
			// System.out.println("item" + item.toString());

			// text3.setText((String)table.getValueAt(row, 2));

		}
		
	}
	
	

}
