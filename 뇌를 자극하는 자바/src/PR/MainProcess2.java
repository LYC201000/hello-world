package PR;

public class MainProcess2 {
	LoginView2 loginView2;
	TestFrm2 testFrm2;
	public MainProcess2() {
		System.out.println("MainProcess()");
		
	//로그인	
	}

	// 테스트프레임창
	public void showFrameTest() {
		System.out.println("MainProcess.showFrameTest");
		
		loginView2.dispose(); // 로그인창닫기
		
		this.testFrm2 = new TestFrm2(); // 테스트프레임 오픈
	}
	public static void main(String[] args) {
		
		
		// 메인클래스 실행
		MainProcess2 main = new MainProcess2();
		main.loginView2 = new LoginView2(); // 로그인창 보이기
		main.loginView2.setMain(main); // 로그인창에게 메인 클래스보내기
	}
}