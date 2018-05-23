package chap06;

public class AppCDInfo extends CDInfo implements Lendable {
	String borrower; // 대출인
	String checkOutDate;// 대출일
	byte state; // 대출상태

	public AppCDInfo(String registeNo, String title) {
		super(registeNo, title);
		
		
		System.out.println("=======AppCDInfo(String registeNo, String title)");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void checkOut(String borrower, String date) {
		System.out.println("checkOut(String borrower, String date)");
		// TODO Auto-generated method stub
		if (state != 0) //0이아닐때 종룔
			return;   	//종료
		this.borrower = borrower;
		this.checkOutDate = checkOutDate;
		this.state = 1;  //대출시 1로 셋팅
		System.out.println("*" + title + "만원이 대출됨");
		System.out.println("대출인:" + borrower);
		System.out.println("대출일:" + date + "\n");

	}

	@Override
	public void checkIn() { // 반납한다
		
		System.out.println("checkIn()");
		// TODO Auto-generated method stub
		this.borrower = null;
		this.checkOutDate = null;
		this.state = 0;
		System.out.println("*" + title + "만원이반납됨");

	}

}
