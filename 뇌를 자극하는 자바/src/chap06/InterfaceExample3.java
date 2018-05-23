package chap06;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class InterfaceExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeparateVolume1 obj = new SeparateVolume1("863?774개", "2000", "3000");// 객체생성시 멤버필드(변수)값을셋팅
		
		Date date = new Date(0);
		SimpleDateFormat sf= new SimpleDateFormat("yyyy년 MM월 dd일");
		String strDate = sf.format(date);
		System.out.println(strDate);
		
		try {
		obj.checkOut("홍길동", strDate);
		}
		catch(Exception e){
		printState(obj);
		System.out.println(e.getMessage());
		}
	}

	static void printState(SeparateVolume1 obj) {
		if (obj.state == Lendable.STATE_NORMAL) {
			System.out.println("==============");
			System.out.println("대출상태:대출가능");
			System.out.println("==============");

		} else {
			System.out.println("==============");
			System.out.println("대출상태:대출중");
			System.out.println("대출인:"+obj.borrower);
			System.out.println("대출일:"+obj.checkOutDate);
			System.out.println("==============");

		}
	}

}
