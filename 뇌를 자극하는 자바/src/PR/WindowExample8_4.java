package PR;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.kosea.kmove30.JDBC_Manager2;

class WindowExample8_4 {

	public WindowExample8_4() {
		// DB관리 클래스! (연결,조회,삭제,추가 클래스)
		JDBC_Manager2 jdbcManager2 = new JDBC_Manager2();

		JFrame frame = new JFrame("대출TM DB");
		frame.setPreferredSize(new Dimension(800,500));
		frame.setLocation(500, 400);

		Container contentPane = frame.getContentPane();

				
		
		// 테이블생성해서 content pane에 추가
		String colNames[] = { "이름", "전화번호", "성별" };
		String genders[] = { "골라","남", "여" };
		DefaultTableModel model = new DefaultTableModel(colNames, 0);
		JTable table = new JTable(model);
		contentPane.add(new JScrollPane(table), BorderLayout.CENTER);

		// 라벨,텍스트상자, 버튼을 생성해서 테이블아래에 추가
		JPanel panel = new JPanel();

		JTextField text1 = new JTextField(4);
		JTextField text2 = new JTextField(13);
		JComboBox<String> genderComboBox = new JComboBox<String>(genders);
		// JTextField text3 = new JTextField(2);

		JButton selectBtn = new JButton("조회");
		//JButton imBtn = new JButton("통화");
		JButton reBtn = new JButton("등록및보기");
		JButton button1 = new JButton("추가");
		JButton updatebtn = new JButton("수정");
		JButton button2 = new JButton("삭제");

		panel.add(new JLabel("이름"));
		panel.add(text1);
		panel.add(new JLabel("전화번호"));
		panel.add(text2);
		panel.add(new JLabel("성별"));
		panel.add(genderComboBox);
		//panel.add(text3); aaaa

		panel.add(selectBtn);
		panel.add(reBtn);
		panel.add(button1);
		panel.add(updatebtn);
		panel.add(button2);
		contentPane.add(panel, BorderLayout.SOUTH);


		//		// 조회버튼 이벤트리스너 등록
		table.addMouseListener(new MyMouseListener2(text1, text2,genderComboBox));
		selectBtn.addActionListener(new SelectActionListener2(jdbcManager2, table));
		button1.addActionListener(new AddActionListener2(jdbcManager2, table, text1, text2,genderComboBox));
		updatebtn.addActionListener(new UpdateActionListener2(jdbcManager2, text1, text2, table));
		button2.addActionListener(new RemoveActionListener2(jdbcManager2, table));
		//imBtn.addActionListener(new ButtonImageEx(table, jdbcManager2, imBtn));
		reBtn.addActionListener(new CreateMember());
		
		

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);

		System.out.println("프로그램111 시작");

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