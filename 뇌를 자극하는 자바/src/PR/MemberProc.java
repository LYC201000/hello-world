package PR;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
 
public class MemberProc extends JFrame implements ActionListener {
   
   
//    JPanel p;
    JTextField tfId, tfName, tfAddr, tfEmail;
    JTextField tfTel1, tfTel2, tfTel3; //전화
    JComboBox cbJob; //직업
    JPasswordField pfPwd; //비밀번호   
    JTextField tfYear, tfMonth, tfDate; //생년월일
    JRadioButton rbMan, rbWoman; //남, 여
    JTextArea taIntro;
    JButton btnInsert, btnCancel, btnUpdate,btnDelete; //가입, 취소, 수정 , 탈퇴 버튼
   
    GridBagLayout gb;
    GridBagConstraints gbc;
    Member_List mList ;
   
    public MemberProc(){ //가입용 생성자
       
        createUI(); // UI작성해주는 메소드
        btnUpdate.setEnabled(false);
        btnUpdate.setVisible(false);
        btnDelete.setEnabled(false);
        btnDelete.setVisible(false);
       
       
    }//생성자
   
    public MemberProc(Member_List mList){ //가입용 생성자
       
        createUI(); // UI작성해주는 메소드
        btnUpdate.setEnabled(false);
        btnUpdate.setVisible(false);
        btnDelete.setEnabled(false);
        btnDelete.setVisible(false);
        this.mList = mList;
       
    }//생성자
    public MemberProc(String id,Member_List mList){ // 수정/삭제용 생성자
        createUI();
        btnInsert.setEnabled(false);
        btnInsert.setVisible(false);
        this.mList = mList;
        
       
        System.out.println("id="+id);
       
        MemberDAO dao = new MemberDAO();
        MemberDTO vMem = dao.getMemberDTO(id);
        viewData(vMem);
       
       
    }//id를 가지고 생성
 
       
    //MemberDTO 의 회원 정보를 가지고 화면에 셋팅해주는 메소드
    private void viewData(MemberDTO vMem){
       
        String id = vMem.getId();
        String pwd = vMem.getPwd();
        String name = vMem.getName();
        String tel = vMem.getTel();
        String addr = vMem.getAddr();
        String birth = vMem.getBirth();
        String job = vMem.getJob();
        String gender = vMem.getGender();
        String email= vMem.getEmail();
        String intro = vMem.getIntro();    
       
        //화면에 세팅
        tfId.setText(id);
        tfId.setEditable(false); //편집 안되게
        pfPwd.setText(""); //비밀번호는 안보여준다.
        tfName.setText(name);
        String[] tels = tel.split("-");
        tfTel1.setText(tels[0]);
        tfTel2.setText(tels[1]);
        tfTel3.setText(tels[2]);
        tfAddr.setText(addr);
       
        tfYear.setText(birth.substring(0, 4));
        tfMonth.setText(birth.substring(4, 6));
        tfDate.setText(birth.substring(6, 8));
       
        cbJob.setSelectedItem(job);
       
       
        if(gender.equals("M")){
            rbMan.setSelected(true);
        }else if(gender.equals("W")){
            rbWoman.setSelected(true);
        }
       
        tfEmail.setText(email);
        taIntro.setText(intro);
   
       
    }//viewData
   
   
   
    private void createUI(){
    	
        this.setTitle("고객정보");
        gb = new GridBagLayout();
        
        setLayout(gb);
        gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
       
       
        //아이디
        JLabel bId = new JLabel("아이디 : ");
        bId.setForeground(Color.GREEN);
        JPanel pId = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pId.add(bId);
        pId.setBackground(Color.BLACK);
        tfId = new JTextField(20);   
        tfId.setBackground(Color.BLACK);
        tfId.setForeground(Color.green);
        //그리드백에 붙이기
        gbAdd(pId, 0, 0, 0, 1);
        //gbAdd(c, x, y, w, h);
        gbAdd(tfId, 1, 0, 3, 1);
       
        //비밀번호
        JLabel bPwd = new JLabel("비밀번호 : ");
        bPwd.setForeground(Color.GREEN);
        bPwd.setBackground(Color.BLACK);
        JPanel PPwd = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        PPwd.add(bPwd);
       
        pfPwd = new JPasswordField(20);
        pfPwd.setBackground(Color.BLACK);
        pfPwd.setForeground(Color.green);
        gbAdd(bPwd, 0, 1,1, 1);
        gbAdd(pfPwd, 1, 1, 3, 1);
       
        //이름
        JLabel bName = new JLabel("이름 :");
        bName.setForeground(Color.GREEN);
        tfName = new JTextField(20);
        tfName.setBackground(Color.BLACK);
        tfName.setForeground(Color.green);
        gbAdd(bName,0,2,1,1);
        gbAdd(tfName,1,2,3,1);
       
        //전화
        JLabel bTel = new JLabel("전화 :");
        bTel.setForeground(Color.GREEN);
        JPanel pTel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pTel.setBackground(Color.BLACK);
        tfTel1 = new JTextField(6); 
        tfTel1.setBackground(Color.BLACK);
        tfTel1.setForeground(Color.green);
        tfTel2 = new JTextField(6);  
        tfTel2.setBackground(Color.BLACK);
        tfTel2.setForeground(Color.green);
        tfTel3 = new JTextField(6);
        tfTel3.setBackground(Color.BLACK);
        tfTel3.setForeground(Color.green);
        pTel.add(tfTel1);
        pTel.add(new JLabel(" - "));
        pTel.add(tfTel2);
        pTel.add(new JLabel(" - "));
        pTel.add(tfTel3);
        gbAdd(bTel, 0, 3, 1,1);
        gbAdd(pTel, 1, 3, 3,1);
       
        //주소
        JLabel bAddr = new JLabel("주소: ");
        bAddr.setForeground(Color.GREEN);
        tfAddr = new JTextField(20);
        tfAddr.setBackground(Color.BLACK);
        tfAddr.setForeground(Color.green);
        gbAdd(bAddr, 0,4,1,1);
        gbAdd(tfAddr, 1, 4, 3,1);
       
        //생일
        JLabel bBirth= new JLabel("생일: ");
        bBirth.setForeground(Color.GREEN);
        tfYear = new JTextField(6);
        tfYear.setBackground(Color.BLACK);
        tfYear.setForeground(Color.green);
        tfMonth = new JTextField(6);
        tfMonth.setBackground(Color.BLACK);
        tfMonth.setForeground(Color.green);
        tfDate = new JTextField(6);
        tfDate.setBackground(Color.BLACK);
        tfDate.setForeground(Color.green);
        JPanel pBirth = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pBirth.setBackground(Color.BLACK);
        pBirth.add(tfYear);
        pBirth.add(new JLabel("/"));
        pBirth.add(tfMonth);
        pBirth.add(new JLabel("/"));
        pBirth.add(tfDate);
        gbAdd(bBirth, 0,5,1,1);
        gbAdd(pBirth, 1, 5, 3,1);
       
        //직업       
        JLabel bJob = new JLabel("직업 : ");
        bJob.setForeground(Color.GREEN);

        String[] arrJob = {"---", "학생", "직장인", "주부", "기타"};
        
        cbJob = new JComboBox(arrJob);
        cbJob.setBackground(Color.black);
        JPanel pJob = new JPanel(new FlowLayout(FlowLayout.LEFT));
        cbJob.setForeground(Color.green);
        pJob.add(cbJob);       
        gbAdd(bJob, 0,6,1,1);
        gbAdd(pJob,1,6,3,1);
       
        //성별
        JLabel bGender = new JLabel("성별 : ");
        bGender.setForeground(Color.GREEN);
        JPanel pGender = new JPanel(new FlowLayout(FlowLayout.LEFT));
        rbMan = new JRadioButton("남",true);
        rbMan.setForeground(Color.green);
        rbWoman = new JRadioButton("여",true);
        rbWoman.setForeground(Color.green);
        ButtonGroup group = new ButtonGroup();
        group.add(rbMan);
        group.add(rbWoman);
        pGender.add(rbMan);
        pGender.add(rbWoman);      
        gbAdd(bGender, 0,7,1,1);
        gbAdd(pGender,1,7,3,1);
       
        //이메일
        JLabel bEmail = new JLabel("이메일 : ");
      
        bEmail.setForeground(Color.GREEN);
        tfEmail = new JTextField(20);
        tfEmail.setBackground(Color.BLACK);
        tfEmail.setForeground(Color.green);
        gbAdd(bEmail, 0,8,1,1);
        gbAdd(tfEmail,1,8,3,1);
       
        //자기소개
        JLabel bIntro = new JLabel("메모: ");
        bIntro.setForeground(Color.GREEN);

        taIntro = new JTextArea(5, 20); //행 : 열
        taIntro.setBackground(Color.BLACK);
        taIntro.setForeground(Color.green);
        JScrollPane pane = new JScrollPane(taIntro);
        pane.setForeground(Color.green);
        pane.setBackground(Color.black);
        
        gbAdd(bIntro,0,9,1,1);
        gbAdd(pane,1,9,3,1);
       
        //버튼
        JPanel pButton = new JPanel();
        btnInsert = new JButton("등록");
        btnInsert.setBackground(Color.BLACK);
        btnInsert.setForeground(Color.green);
        btnUpdate = new JButton("수정"); 
        btnUpdate.setBackground(Color.BLACK);
        btnUpdate.setForeground(Color.green);
        btnDelete = new JButton("탈퇴");
        btnDelete.setBackground(Color.BLACK);
        btnDelete.setForeground(Color.green);
        btnCancel = new JButton("취소");   
        
        btnCancel.setBackground(Color.BLACK);
        btnCancel.setForeground(Color.green);
        pButton.add(btnInsert);
        pButton.add(btnUpdate);
        pButton.add(btnDelete);
        pButton.add(btnCancel);    
        gbAdd(pButton, 0, 10, 4, 1);
       
        //버튼에 감지기를 붙이자
        btnInsert.addActionListener(this);
        btnUpdate.addActionListener(this);
        btnCancel.addActionListener(this);
        btnDelete.addActionListener(this);
       
        setSize(350,500);
        setVisible(true);
        //setDefaultCloseOperation(EXIT_ON_CLOSE); //System.exit(0) //프로그램종료
        setDefaultCloseOperation(DISPOSE_ON_CLOSE); //dispose(); //현재창만 닫는다.
       
       
    }//createUI
   
    //그리드백레이아웃에 붙이는 메소드
    private void gbAdd(JComponent c, int x, int y, int w, int h){
        gbc.gridx = x;
        gbc.gridy = y;
        gbc.gridwidth = w;
        gbc.gridheight = h;
        gb.setConstraints(c, gbc);
        gbc.insets = new Insets(2, 2, 2, 2);
        add(c, gbc);
    }//gbAdd
   
    public static void main(String[] args) {
       
        new MemberProc();
    }
   
 
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == btnInsert){
            insertMember();
            System.out.println("insertMember() 호출 종료");
        }else if(ae.getSource() == btnCancel){
            this.dispose(); //창닫기 (현재창만 닫힘)
            //system.exit(0)=> 내가 띄운 모든 창이 다 닫힘          
        }else if(ae.getSource() == btnUpdate){
            UpdateMember();            
        }else if(ae.getSource() == btnDelete){
            //int x = JOptionPane.showConfirmDialog(this,"정말 삭제하시겠습니까?");
            int x = JOptionPane.showConfirmDialog(this,"정말 삭제하시겠습니까?","삭제",JOptionPane.YES_NO_OPTION);
           
            if (x == JOptionPane.OK_OPTION){
                deleteMember();
            }else{
                JOptionPane.showMessageDialog(this, "삭제를 취소하였습니다.");
            }
        }
       
        //jTable내용 갱신 메소드 호출
        mList.jTableRefresh();
       
    }//actionPerformed 
   
   
    private void deleteMember() {
        String id = tfId.getText();
        String pwd = pfPwd.getText();
        if(pwd.length()==0){ //길이가 0이면
           
            JOptionPane.showMessageDialog(this, "비밀번호를 꼭 입력하세요!");
            return; //메소드 끝
        }
        //System.out.println(mList);
        MemberDAO dao = new MemberDAO();
        boolean ok = dao.deleteMember(id, pwd);
       
        if(ok){
            JOptionPane.showMessageDialog(this, "삭제완료");
            dispose();         
           
        }else{
            JOptionPane.showMessageDialog(this, "삭제실패");
           
        }          
       
    }//deleteMember
   
    private void UpdateMember() {
       
        //1. 화면의 정보를 얻는다.
        MemberDTO dto = getViewData();     
        //2. 그정보로 DB를 수정
        MemberDAO dao = new MemberDAO();
        boolean ok = dao.updateMember(dto);
       
        if(ok){
            JOptionPane.showMessageDialog(this, "수정되었습니다.");
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(this, "수정실패: 값을 확인하세요");   
        }
    }
 
    private void insertMember(){
       
        //화면에서 사용자가 입력한 내용을 얻는다.
        MemberDTO dto = getViewData();
        MemberDAO dao = new MemberDAO();       
        boolean ok = dao.insertMember(dto);
       
        if(ok){
           
            JOptionPane.showMessageDialog(this, "가입이 완료되었습니다.");
            dispose();
           
        }else{
           
            JOptionPane.showMessageDialog(this, "가입이 정상적으로 처리되지 않았습니다.");
        }
       
       
       
    }//insertMember
   
    public MemberDTO getViewData(){
       
        //화면에서 사용자가 입력한 내용을 얻는다.
        MemberDTO dto = new MemberDTO();
        
        
        String id = tfId.getText();
        String pwd = pfPwd.getText();
        String name = tfName.getText();
        String tel1 = tfTel1.getText();
        String tel2 = tfTel2.getText();
        String tel3 = tfTel3.getText();
        String tel = tel1+"-"+tel2+"-"+tel3;
        String addr = tfAddr.getText();
        String birth1 = tfYear.getText();
        String birth2 = tfMonth.getText();
        String birth3 = tfDate.getText();
        //String birth = birth1+"/"+birth2+"/"+birth3;
        String birth = birth1+birth2+birth3;
        String job = (String)cbJob.getSelectedItem();
        String gender = "";
        if(rbMan.isSelected()){
            gender = "M";
        }else if(rbWoman.isSelected()){
            gender = "W";
        }
       
        String email = tfEmail.getText();
        String intro = taIntro.getText();
       
        //dto에 담는다.
        dto.setId(id);
        dto.setPwd(pwd);
        dto.setName(name);
        dto.setTel(tel);
        dto.setAddr(addr);
        dto.setBirth(birth);
        dto.setJob(job);
        dto.setGender(gender);
        dto.setEmail(email);
        dto.setIntro(intro);
       
        return dto;
    }
   
}//end