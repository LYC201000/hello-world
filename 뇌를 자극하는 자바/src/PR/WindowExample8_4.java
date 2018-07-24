package PR;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import com.kosea.kmove30.JDBC_Manager2;

class WindowExample8_4 {

	private JTable table1;

	public WindowExample8_4() {
		// DB관리 클래스! (연결,조회,삭제,추가 클래스)
		JDBC_Manager2 jdbcManager2 = new JDBC_Manager2();
		JFrame frame = new JFrame("대출TM DB");
		frame.setPreferredSize(new Dimension(800,170));
		frame.setLocation(500, 400);

		Container contentPane = frame.getContentPane();

		// 테이블생성해서 content pane에 추가

		String colNames[] = { "이름", "전화번호", "성별" };
		
		

		String genders[] = { "성별", "남", "여" };

		DefaultTableModel model = new DefaultTableModel(colNames, 5);

		// ----------------------------------------------------------

		JTable table = new JTable(model);
		table.setForeground(Color.green);
		table.setBackground(Color.black);
		
		//속성이름 색상변경
		JTableHeader anHeader = table.getTableHeader();
	    anHeader.setForeground(new Color(0).green);
	    anHeader.setBackground(new Color(0).black);
		contentPane.add(new JScrollPane(table), BorderLayout.CENTER);

		// 라벨,텍스트상자, 버튼을 생성해서 테이블아래에 추가
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		// panel.setBackground(Color.BLACK);

		JTextField text1 = new JTextField(4);
		text1.setBackground(Color.BLACK);

		JTextField text2 = new JTextField(13);
		text2.setBackground(Color.BLACK);
		JComboBox<String> genderComboBox = new JComboBox<String>(genders);
		genderComboBox.setBackground(Color.black);
		genderComboBox.setForeground(Color.GREEN);
		// JTextField text3 = new JTextField(2);

		JButton selectBtn = new JButton("조회");
		selectBtn.setForeground(Color.GREEN);
		selectBtn.setBackground(Color.BLACK);
		// JButton imBtn = new JButton("통화");
		JButton reBtn = new JButton("등록및보기");
		reBtn.setForeground(Color.GREEN);
		reBtn.setBackground(Color.BLACK);
		JButton button1 = new JButton("추가");
		button1.setForeground(Color.GREEN);
		button1.setBackground(Color.BLACK);
		JButton updatebtn = new JButton("수정");
		updatebtn.setForeground(Color.GREEN);
		updatebtn.setBackground(Color.BLACK);
		JButton button2 = new JButton("삭제");
		button2.setForeground(Color.GREEN);
		button2.setBackground(Color.BLACK);
		// --------------------하단
		JLabel JLabel = new JLabel("이름");
		JLabel.setForeground(Color.GREEN);
		panel.add(JLabel);
		// panel.add(new JLabel("이름"));
		panel.add(text1);
		text1.setForeground(Color.GREEN);

		// ---------------------------------
		JLabel JLabel2 = new JLabel("전화번호");
		JLabel2.setForeground(Color.GREEN); // 글자색
		panel.add(JLabel2);
		// panel.add(new JLabel("전화번호"));
		panel.add(text2);
		text2.setForeground(Color.GREEN); // 입력 할때 글자색

		JLabel JLabel3 = new JLabel("성별");
		JLabel3.setForeground(Color.GREEN);
		panel.add(JLabel3);
		// panel.add(new JLabel("성별"));
		panel.add(genderComboBox);

		// panel.add(text3);

		panel.add(selectBtn);
		panel.add(reBtn);
		panel.add(button1);
		panel.add(updatebtn);
		panel.add(button2);
		contentPane.add(panel, BorderLayout.SOUTH);

		// // 조회버튼 이벤트리스너 등록
		table.addMouseListener(new MyMouseListener2(text1, text2, genderComboBox));
		selectBtn.addActionListener(new SelectActionListener2(jdbcManager2, table));
		button1.addActionListener(new AddActionListener2(jdbcManager2, table, text1, text2, genderComboBox));
		updatebtn.addActionListener(new UpdateActionListener2(jdbcManager2, text1, text2, table));
		button2.addActionListener(new RemoveActionListener2(jdbcManager2, table));
		// imBtn.addActionListener(new ButtonImageEx(table, jdbcManager2, imBtn));
		reBtn.addActionListener(new CreateMember());

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);

		System.out.println("프로그램시작");

		try {

			jdbcManager2.DBConnection("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/mysql", "root", "12345");
			System.out.println("데이터베이스에 접속했습니다.");
			frame.setTitle("대출TM DB - DB접속 성공");

		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
			frame.setTitle("연락처 - DB접속 실패");

		} catch (Exception e) {
			e.getMessage();
			frame.setTitle("연락처 - DB접속 실패");
		}
	}

	private void placeLoginPanel(JPanel panel) {
		// TODO Auto-generated method stub

	}

	private void setVisible(boolean b) {
		// TODO Auto-generated method stub

	}

	private void setSize(int i, int j) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		new WindowExample8_4();

	}

}