package basic;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		DateFormat format = new SimpleDateFormat("yyyy년MM월dd일HH시mm분ss초");
		System.out.println(format.format(date));
		//오늘은 9월 21일 월요일 오전 10시 
		DateFormat format1 = new SimpleDateFormat("오늘은 MM월 dd일 E 요일 HH시");
		System.out.println(format1.format(date));
			
		try {
			Date date2 = format1.parse("오늘은 09월 21일 월 요일 11시");
			System.out.println(date2);
		} catch (ParseException e) {
			e.printStackTrace();
			System.out.println("잘못된 문자열 입력");
		}
		
	}

}
