package basic;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeAPITest {

	public static void main(String[] args) {
		//날짜
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		//시각
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		//일시
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
		LocalDateTime t1 = LocalDateTime.of(2017, 1, 1, 1, 1, 10);
		System.out.println(t1);

	}

}
