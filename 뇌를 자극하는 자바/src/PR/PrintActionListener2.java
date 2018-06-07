package PR;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.table.TableModel;

public class PrintActionListener2 implements ActionListener {
	
	
	JTable table;

	public PrintActionListener2(JTable table) {
		super();
		this.table = table;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		TableModel model = table.getModel();
		int rowNum = model.getRowCount();
		int colNum = model.getColumnCount();
		
		for(int row=0; row<rowNum;row++) {
			for(int col=0;col<colNum; col++) {
				Object obj = model.getValueAt(row, col);
				System.out.println(obj+"\t");
			}
			System.out.println();
		}
		System.out.println("----------------");
	}

}
