package quiz;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Scanner;

public class MemDay2 {

	public static void main(String[] args) {
		//사용자로 부터 특정일(첫 만남)을 입력받는다.
		//ex>2020년06월29일
		//100일:
		//단, Date and Time API를 이용하시요
		//(LocalDate, LocalTime, LocalDateTime)
		Scanner scan = new Scanner(System.in);
		System.out.println("첫만남 입력(ex>2020년1월1일)");
		TemporalAccessor temp= 
				DateTimeFormatter.ofPattern("yyyy년MM월dd일").parse(scan.next());
		System.out.println(temp);
//		LocalDate date = (LocalDate) temp;
//		System.out.println(
//		"100일후 "+DateTimeFormatter.ofPattern("yyyy년MM월dd일").format(date.plusDays(100)));
	}
}