package chap19;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.kosea.kmove30.JDBC_Manager;

class WindowExample8_2 {
	
	
	public WindowExample8_2() {
		// DB관리 클래스! (연결,조회,삭제,추가 클래스)
		JDBC_Manager jdbcManager = new JDBC_Manager();

		JFrame frame = new JFrame("참가자 f명단 프로그램");
		frame.setPreferredSize(new Dimension(550, 200));
		frame.setLocation(500, 400);

		Container contentPane = frame.getContentPane();

		// 테이블생성해서 content pane에 추가
		String colNames[] = { "이름", "나이", "성별" };
		String genders[] = { "골라","남", "여" };
		DefaultTableModel model = new DefaultTableModel(colNames, 0);
		JTable table = new JTable(model);
		contentPane.add(new JScrollPane(table), BorderLayout.CENTER);

		// 라벨,텍스트상자, 버튼을 생성해서 테이블아래에 추가
		JPanel panel = new JPanel();

		JTextField text1 = new JTextField(3);
		JTextField text2 = new JTextField(3);
		JComboBox<String> genderComboBox = new JComboBox<String>(genders);
		// JTextField text3 = new JTextField(2);

		JButton selectBtn = new JButton("조회");
		JButton button1 = new JButton("추가");
		JButton updatebtn = new JButton("수정");
		JButton button2 = new JButton("삭제");

		panel.add(new JLabel("이름"));
		panel.add(text1);
		panel.add(new JLabel("나이"));
		panel.add(text2);
		panel.add(new JLabel("성별"));
		panel.add(genderComboBox);
		//panel.add(text3);

		panel.add(selectBtn);
		panel.add(button1);
		panel.add(updatebtn);
		panel.add(button2);
		contentPane.add(panel, BorderLayout.SOUTH);

		// 조회버튼 이벤트리스너 등록
		table.addMouseListener(new MyMouseListener(text1, text2,genderComboBox));
		selectBtn.addActionListener(new SelectActionListener(jdbcManager, table));
		button1.addActionListener(new AddActionListener(jdbcManager, table, text1, text2,genderComboBox));
		updatebtn.addActionListener(new UpdateActionListener(jdbcManager, text1, text2, table));
		button2.addActionListener(new RemoveActionListener(jdbcManager, table));
		

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);

		System.out.println("프로그램 시작");

		try {
		
			jdbcManager.DBConnection("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/mysql", "root", "12345");
			System.out.println("데이터베이스에 접속했습니다.");
			frame.setTitle("참가자 명단 프로그램xx - DB접속 성공");

		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
			frame.setTitle("참가자 명단 프로그램 - DB접속 실패");

		} catch (Exception e) {
			e.getMessage();

			frame.setTitle("참가자 명단 프로그램 - DB접속 실패");
		}
		
	}
	
	
	
	public static void main(String[] args) {

		// DB관리 클래스! (연결,조회,삭제,추가 클래스)
		JDBC_Manager jdbcManager = new JDBC_Manager();

		JFrame frame = new JFrame("참가자 명단 프로그램");
		frame.setPreferredSize(new Dimension(550, 200));
		frame.setLocation(500, 400);

		Container contentPane = frame.getContentPane();

		// 테이블생성해서 content pane에 추가
		String colNames[] = { "이름", "나이", "성별" };
		String genders[] = { "골라","남", "여" };
		DefaultTableModel model = new DefaultTableModel(colNames, 0);
		JTable table = new JTable(model);
		contentPane.add(new JScrollPane(table), BorderLayout.CENTER);

		// 라벨,텍스트상자, 버튼을 생성해서 테이블아래에 추가
		JPanel panel = new JPanel();

		JTextField text1 = new JTextField(3);
		JTextField text2 = new JTextField(3);
		JComboBox<String> genderComboBox = new JComboBox<String>(genders);
		// JTextField text3 = new JTextField(2);

		JButton selectBtn = new JButton("조회");
		JButton button1 = new JButton("추가");
		JButton updatebtn = new JButton("수정");
		JButton button2 = new JButton("삭제");

		panel.add(new JLabel("이름"));
		panel.add(text1);
		panel.add(new JLabel("나이"));
		panel.add(text2);
		panel.add(new JLabel("성별"));
		panel.add(genderComboBox);
		//panel.add(text3);

		panel.add(selectBtn);
		panel.add(button1);
		panel.add(updatebtn);
		panel.add(button2);
		contentPane.add(panel, BorderLayout.SOUTH);

		// 조회버튼 이벤트리스너 등록
		table.addMouseListener(new MyMouseListener(text1, text2,genderComboBox));
		selectBtn.addActionListener(new SelectActionListener(jdbcManager, table));
		button1.addActionListener(new AddActionListener(jdbcManager, table, text1, text2,genderComboBox));
		updatebtn.addActionListener(new UpdateActionListener(jdbcManager, text1, text2, table));
		button2.addActionListener(new RemoveActionListener(jdbcManager, table));
		

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);

		System.out.println("프로그램 시작");

		try {

			jdbcManager.DBConnection("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/mysql", "root", "12345");
			System.out.println("데이터베이스에 접속했습니다.");
			frame.setTitle("참가자 명단 프로그램 - DB접속 성공");

		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
			frame.setTitle("참가자 명단 프로그램 - DB접속 실패");

		} catch (Exception e) {
			e.getMessage();

			frame.setTitle("참가자 명단 프로그램 - DB접속 실패");
		}
	}
}