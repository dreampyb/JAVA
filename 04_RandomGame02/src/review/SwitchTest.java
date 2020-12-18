package review;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		// Switch문만을 이용해서 사용자로 숫자1~4사이의 값을 입력받고
		// 1이면 봄, 2면 여름, 3이면 가을, 4면 겨울이 출력되는 프로그램
		// 출력예> 숫자하나 입력:3
		//         가을
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자입력(1~4): ");
		int num = scan.nextInt();
				
		switch (num) {
			case 1:
				System.out.println("봄");
				break;
			case 2:
				System.out.println("여름");
				break;
			case 3:
				System.out.println("가을");
				break;
			case 4:
				System.out.println("겨울");
				break;
			default:
				System.out.println("잘못 입력했습니다.");
				break;		
		}
	}

}
