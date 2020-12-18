package review;

import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		// 1.사용자로 부터 원하는 달을 입력받습니다.
		// 2.해당달이 몇일로 끝나는지 알려줍니다.
		//   28,30,31  - 스위치문을 이용해서 효과적으로 break 가 안쓰이면 다음이 실행되는 걸 이용
		Scanner scan = new Scanner(System.in);
		System.out.println("달입력:");
		int month=scan.nextInt();
		switch(month) {
		case 2: System.out.println("28일"); break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30일"); break;
		default:
			System.out.println("31일"); break;
		}
	
	}

}
