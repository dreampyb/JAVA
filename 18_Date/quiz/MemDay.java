package quiz;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class MemDay {

	public static void main(String[] args) {
		//사용자로 부터 특정일(첫 만남)을 입력받는다.
		//ex>2020년06월29일
		//100일:
		Scanner scan = new Scanner(System.in);
		System.out.println("첫 만남일을 입력하세요(ex>2020년6월24일):");
		String str = scan.next();

		DateFormat format = new SimpleDateFormat("yyyy년MM월dd일");
		
		try {
			 Date date = format.parse(str);
			 Calendar cal = Calendar.getInstance();
			 cal.setTime(date);
			 cal.add(Calendar.DAY_OF_MONTH, 100);
			 System.out.println("100일후"+format.format(cal.getTime()));
			  
		} catch (ParseException e) {
			System.out.println("잘못된입력");	
		}
	}
}