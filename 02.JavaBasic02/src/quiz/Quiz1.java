package quiz;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		// 사용자로부터 숫자를 입력받습니다.
		// 계속 입력받습니다.
		// 만일 0을 입력한다면 프로그램 종료
		// 출력예> 숫자입력 : 7
		//         숫자입력 : 9
		//         숫자입력 : 0
		//         프로그램 종료
		//for, while, do while
		//방법1. break 문 이용
		//방법2. break 문 미이용
		Scanner scan = new Scanner(System.in);
		for(int num=1; num!=0; num=scan.nextInt()) {
			System.out.println("숫자입력:");
		}
		System.out.println("for문 break 미사용 프로그램 종료");
		
		int num;
		for(;;) {
			System.out.println("숫자입력:");
			num=scan.nextInt();
			if(num==0) break;
		}
		System.out.println("for문 break 사용 프로그램 종료");
		
		num=1;
		while(num!=0) {
			System.out.println("숫자입력:");
			num=scan.nextInt();
		}
		System.out.println("while문 break 미사용 프로그램 종료");
		
		while(true) {
			System.out.println("숫자입력:");
			num=scan.nextInt();
			if(num==0) break;
		}
		System.out.println("while문 break 사용 프로그램 종료");
		
		do {
			System.out.println("숫자입력:");
			num=scan.nextInt();
		}while(num!=0);
		System.out.println("while문 break 미사용 프로그램 종료");
		
		do {
			System.out.println("숫자입력:");
			num=scan.nextInt();
			if(num==0) break;
		}while(true);
		
		System.out.println("while문 break 사용 프로그램 종료");
	}

}
