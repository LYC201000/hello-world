package PR;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;

import com.kosea.kmove30.JDBC_Manager;

public class LoginView2 extends JFrame {
	private MainProcess2 main;
	private TestFrm2 testFrm;

	private JButton btnLogin;
	private JButton btnInit;
	private JPasswordField passText;
	private JTextField userText;
	private boolean bLoginCheck;
	ResultSet rs = null;

	public static void main(String[] args) {
		// new LoginView();
	}

	public LoginView2() {

		System.out.println("LoginView()생성자");
		// setting
		setTitle("대출TM DB 로그인");
		setSize(280, 150);
		setResizable(false);
		setLocation(800, 450);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// panel

		JPanel panel = new JPanel();
		placeLoginPanel(panel);
		Color b = new Color(0, 0, 0);
		panel.setBackground(b);

		// add
		add(panel);

		// visiible
		setVisible(true);
	}

	// 프레임짜기
	public void placeLoginPanel(JPanel panel) {
		panel.setLayout(null);
		JLabel userLabel = new JLabel("직원이름");
		userLabel.setForeground(Color.GREEN);
		userLabel.setBounds(10, 10, 80, 25);
		panel.add(userLabel);

		JLabel passLabel = new JLabel("비밀번호");
		passLabel.setForeground(Color.GREEN);
		passLabel.setBounds(10, 40, 80, 25);
		panel.add(passLabel);

		userText = new JTextField(20);
		userText.setBackground(Color.BLACK);
		userText.setForeground(Color.GREEN);
		userText.setBounds(100, 10, 160, 25);
		panel.add(userText);

		passText = new JPasswordField(20);
		passText.setBackground(Color.BLACK);
		passText.setForeground(Color.green);

		passText.setBounds(100, 40, 160, 25);
		panel.add(passText);
		passText.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// isLoginCheck(userText.getText(), passText.getPassword().toString());
			}
		});

		btnInit = new JButton("Reset");
		btnInit.setForeground(Color.GREEN);
		btnInit.setBackground(Color.BLACK);
		btnInit.setBounds(10, 80, 100, 25);
		panel.add(btnInit);
		btnInit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				userText.setText("");
				passText.setText("");
			}
		});

		btnLogin = new JButton("Login");
		btnLogin.setBackground(Color.BLACK);
		btnLogin.setForeground(Color.GREEN);
		btnLogin.setBounds(160, 80, 100, 25);
		panel.add(btnLogin);
		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				isLoginCheck(userText.getText(), new String(passText.getPassword()));
			}
		});
	}

	public void isLoginCheck(String id, String pass) {

		String idCheckQuery = "SELECT id, pass FROM MEMBER where id ='" + id + "'";

		System.out.println("idCheckQuery: " + idCheckQuery);
		JDBC_Manager jdbcManager = new JDBC_Manager();

		try {
			jdbcManager.DBConnection("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/mysql", "root", "12345");
			rs = jdbcManager.SelectTable(idCheckQuery);

			if (rs.next()) {

				System.out.println(rs.getString("id") + "  " + rs.getString("pass"));
				// 아이디가 존재하면 패스워드 비교
				System.out.println("  ");
				if (pass.equals(rs.getString("pass"))) {
					// 로그인 성공
					// JOptionPane.showMessageDialog(null, "성공!!");
					UIManager UI = new UIManager();
					UI.put("OptionPane.background", Color.black);
					UI.put("Panel.background", Color.black);
					UI.put("Button.background", Color.black);
					javax.swing.JOptionPane j = new javax.swing.JOptionPane();
					UI.put("OptionPane.messageForeground", Color.green);

					JOptionPane.showMessageDialog(null, "성공!", "로그인!!", JOptionPane.INFORMATION_MESSAGE);

					bLoginCheck = true;
					// 로그인 성공이라면 매니져창 뛰우기

					if (isLogin()) {
						main.showFrameTest(); // 메인창 메소드를 이용해 창뛰우기

					}
				} else {
					// 패스워드가 틀림

					UIManager UI1 = new UIManager();
					UI1.put("OptionPane.background", Color.black);
					UI1.put("Panel.background", Color.black);
					UI1.put("Button.background", Color.black);
					UI1.put("OptionPane.messageForeground", Color.green);
					UI1.put("Button.messageForeground", Color.green);
					JOptionPane.showMessageDialog(null, "패스워드 틀렷다");

				}
			} else {
				// 아이디가 없음

				UIManager UI2 = new UIManager();
				UI2.put("OptionPane.background", Color.black);
				UI2.put("Panel.background", Color.black);
				UI2.put("Button.background", Color.black);
				UI2.put("OptionPane.messageForeground", Color.green);
				UI2.put("Button.messageForeground", Color.green);
				JOptionPane.showMessageDialog(null, "아이디가없다");

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	// mainProcess와 연동
	public void setMain(MainProcess2 main) {
		this.main = main;
	}

	public boolean isLogin() {
		return bLoginCheck;
	}

}