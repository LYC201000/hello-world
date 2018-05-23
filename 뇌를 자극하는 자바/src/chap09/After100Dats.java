package chap09;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class After100Dats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date()); 	//현재시간 설정	//setTime:이 일정 관리 시간을 지정된 날짜로 설정합니다.	
		calendar.add(Calendar.DATE, +100);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MMM EEEE dd일  a h시 m분 s초");
		String date = dateFormat.format(calendar.getTime());
		System.out.println(date);
		
		/*
		GregorianCalendar a = new GregorianCalendar();
		SimpleDateFormat dateFormat=  new SimpleDateFormat("yyyy년 MMM EEEE dd일  a h시 m분 s초");
		a.add(a.DATE, 5);
		System.out.println(dateFormat.format(a.getTime()));
		*/
	}
}