package basic;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class FinalDateTimeAPITest {

	public static void main(String[] args) {
		//p295
		LocalDateTime date = LocalDateTime.now(); //현재날짜시간 가져오기
	
		//DateTimeFormatter a1=DateTimeFormatter.ofPattern("yyyy년MM월dd일 HH:mm");
		//String str= a1.format(date);
		String str = DateTimeFormatter.ofPattern("yyyy년MM월dd일 HH:mm").format(date);//출력시
		
		TemporalAccessor p1= DateTimeFormatter.ofPattern(
				"yyyy년MM월dd일 HH:mm").parse("2020년09월22일 12:16");
		
		System.out.println(DateTimeFormatter.ofPattern("yyyy년MM월dd일 HH:mm").format(p1));
		
		System.out.
		println(DateTimeFormatter.ofPattern("yyyy년MM월dd일 HH:mm").format(date.plusDays(100)));

	}

}
