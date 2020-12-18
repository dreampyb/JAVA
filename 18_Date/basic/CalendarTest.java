package basic;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) throws InterruptedException {
		Calendar cal = Calendar.getInstance(); 
//		System.out.println("Calendar 값찍기:");
//		System.out.println(cal);
//		System.out.println("getTime의 값찍기");
//		System.out.println(cal.getTime());
//		
//		Thread.sleep(2000); //2초 대기
//		System.out.println("getTime의 값찍기");
//		System.out.println(cal.getTime());
		
		cal.set(Calendar.MINUTE, 18);  //분 지정
		System.out.println(cal.getTime());
		
		/******************************************************
		 * 주의>달은 0부터시작 ex>9월은 8 입력
		 ******************************************************/
		cal.set(2020, Calendar.SEPTEMBER, 22, 18, 36, 42); //전부지정 
		System.out.println(cal.getTime());
		
		System.out.println(cal.get(Calendar.DATE)); //날짜만 찍기
		System.out.println(cal.get(Calendar.SECOND)); //초만 찍기
		
		cal.add(Calendar.YEAR, 2); //2년 더하기
		System.out.println(cal.getTime());
		
		cal.add(Calendar.MONTH,-2); //2달빼기
		System.out.println(cal.getTime());
		
	}

}



