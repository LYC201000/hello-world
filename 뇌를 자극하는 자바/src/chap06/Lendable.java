package chap06;

import java.sql.Date;

//추상메소드
public interface Lendable {

	// 상수필드
	final static 	byte STATE_BORROWED = 1;	//대출중(대출불가)
					byte STATE_NORMAL = 0;		//대출되지않은상태

	abstract void checkOut(String borrower, String date) throws Exception; // 대출하는기능
			void checkIn(); // 반납하는 기능
//			void checkOut(String borrower, Date date);

}
