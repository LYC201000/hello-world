//출처
//https://m.blog.naver.com/PostView.nhn?blogId=javaking75&logNo=140190272629&proxyReferer=&proxyReferer=https%3A%2F%2Fwww.google.co.kr%2F
package PR;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import com.sun.swing.internal.plaf.basic.resources.basic;

public class Member_List extends JFrame implements MouseListener, ActionListener {

	Vector v;
	Vector cols;
	DefaultTableModel model1;
	JTable jTable;
	JScrollPane pane;
	JPanel pbtn;
	JButton btnInsert;

	public Member_List() {
		super("고객등록 관리 프로그램  v0.1.1");
		// v=getMemberList();
		// MemberDAO
		MemberDAO dao = new MemberDAO();
		v = dao.getMemberList();
		System.out.println("v=" + v);
		cols = getColumn();

		// public DefaultTableModel()
		// public DefaultTableModel(int rowCount, int columnCount)
		// public DefaultTableModel(Vector columnNames, int rowCount)
		// public DefaultTableModel(Object[] columnNames, int rowCount)
		// public DefaultTableModel(Vector data,Vector columnNames)
		// public DefaultTableModel(Object[][] data,Object[] columnNames)

		model1 = new DefaultTableModel(v, cols);

		// JTable()
		// JTable(int numRows, int numColumns)
		// JTable(Object[][] rowData, Object[] columnNames)
		// JTable(TableModel dm)
		// JTable(TableModel dm, TableColumnModel cm)
		// JTable(TableModel dm, TableColumnModel cm, ListSelectionModel sm)
		// JTable(Vector rowData, Vector columnNames)

		// jTable = new JTable(v,cols);
		
		jTable = new JTable(model1);
		jTable.setBackground(Color.BLACK);
		jTable.setForeground(Color.green);
		JTableHeader anHeader = jTable.getTableHeader();
		anHeader.setForeground(new Color(0).green);
		anHeader.setBackground(new Color(0).black);
		pane = new JScrollPane(jTable);
		pane.getColorModel();

		add(pane);

		pbtn = new JPanel();
		btnInsert = new JButton("고객등록");
		btnInsert.setForeground(Color.green);
		btnInsert.setBackground(Color.black);
		pbtn.add(btnInsert);
		add(pbtn, BorderLayout.NORTH);

		jTable.addMouseListener(this); // 리스너 등록
		btnInsert.addActionListener(this); // 회원가입버튼 리스너 등록

		setSize(650, 145);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}// end 생성자

	public Vector getColumn() {
		Vector col = new Vector();
		col.add("아이디");
		col.add("비밀번호");
		col.add("이름");
		col.add("전화");
		col.add("주소");
		col.add("생일");
		col.add("직업");
		col.add("성별");
		col.add("이메일");
		col.add("메모");

		return col;
	}// getColumn

	// Jtable 내용 갱신 메서드
	public void jTableRefresh() {

		MemberDAO dao = new MemberDAO();
		DefaultTableModel model = new DefaultTableModel(dao.getMemberList(), getColumn());
		jTable.setModel(model);
		jTable.setBackground(Color.black);
		jTable.setForeground(Color.green);

	}

	public static void main(String[] args) {
		new Member_List();
	}// main

	@Override
	public void mouseClicked(MouseEvent e) {
		// mouseClicked 만 사용
		int r = jTable.getSelectedRow();
		String id = (String) jTable.getValueAt(r, 0);
		// System.out.println("id="+id);
		MemberProc mem = new MemberProc(id, this); // 아이디를 인자로 수정창 생성

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 버튼을 클릭하면
		if (e.getSource() == btnInsert) {
			new MemberProc(this);

			/* 테스트 */
			// dao = new MemberDAO();
			// dao.userSelectAll(model);
			// model.fireTableDataChanged();
			// jTable.updateUI();
			// jTable.requestFocusInWindow();

		}

	}

}