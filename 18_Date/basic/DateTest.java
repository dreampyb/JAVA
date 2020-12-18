package basic;

import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date now = new Date();	//현재의 시각으로 Date 클래스를 생성한다.
		System.out.println(now);
		//System.out.println(now.toString());
		
		Date date=new Date(5000); //시간지정하여 생성(1970.1.1 0시 기준 + 5000ms)
		System.out.println(date);
				
		//aa aa = new Aaa(1,2);
		//System.out.println(aa.toString());
	
		
	}

}
