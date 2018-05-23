package chap06;

import java.sql.Date;

public class SeparateVolume1 implements Lendable {

	String requestNo; // 청구번호
	String bookTitle; // 제목
	String writer; // 저자
	String borrower; // 대출인
	Date checkOutDate;// 대출인
	byte state; // 대출상태

	public SeparateVolume1(String requestNo, String bookTitle, String writer) {
		super();
		this.requestNo = requestNo;
		this.bookTitle = bookTitle;
		this.writer = writer;
	}

	public void checkOut(String borrower, Date date) {

		System.out.println("checkOut(String borrower, String date)");
		// if (state != STATE_NORMAL)

		if (state != STATE_BORROWED)
			return;
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = STATE_BORROWED;// 대출중
		// this.state = 1;// 대출시1로셋팅
		System.out.println("*" + bookTitle + "만원이대출됨");
		System.out.println("대출인:" + borrower);
		System.out.println("대출일:" + date + "\n");
	}

	public void checkIn() {
		this.borrower = null;
		this.checkOutDate = null;
		this.state = STATE_BORROWED;
		System.out.println("***" + bookTitle + "이반납되었습니다.\n");
	}

	@Override
	public void checkOut(String borrower, String date) {
		// TODO Auto-generated method stub
	}
}
