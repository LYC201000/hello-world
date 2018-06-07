package PR;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.*;

import com.kosea.kmove30.JDBC_Manager2;
public class ButtonImageEx extends JFrame implements ActionListener{
	JTable table;
	JDBC_Manager2 jdbcManager2;
	JButton imBtn;
	//생성자
	public ButtonImageEx(JTable table, JDBC_Manager2 jdbcManager2, JButton imBtn) throws HeadlessException {
		super();
		this.table = table;
		this.jdbcManager2 = jdbcManager2;
		this.imBtn = imBtn;
		
	}


	//메소드
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
			
			
			setTitle("사진보기");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Container c = getContentPane();
			c.setLayout(new FlowLayout());
	System.out.println("aasd");
			ImageIcon normalIcon = new ImageIcon("C:\\Users\\Administrator\\Desktop\\PR/qqqqqqqqqq1.gif");
			ImageIcon rolloverIcon = new ImageIcon("C:\\Users\\Administrator\\Desktop\\PR/qqq1.png");
			ImageIcon pressedIcon = new ImageIcon("C:\\Users\\Administrator\\Desktop\\PR/qqq1.png");
			JButton imBtn = new JButton("전화", normalIcon);
			setSize(300	,300); 
			imBtn.setPressedIcon(pressedIcon); // pressedIcon용 이미지 등록
			imBtn.setRolloverIcon(rolloverIcon); // rolloverIcon용 이미지 등록
			c.add(imBtn);
			setSize(550,550);
			setVisible(true);
			
	}
}
