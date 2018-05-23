package chap09;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class DateFormatExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar calendar=new GregorianCalendar();
		SimpleDateFormat dateFormat=  new SimpleDateFormat("yyyy년 MMM EEEE dd일  a h시 m분 s초");
		String str = dateFormat.format(calendar.getTime());
		System.out.println(str);
	}

}
