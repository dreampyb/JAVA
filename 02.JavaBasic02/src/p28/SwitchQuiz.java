package p28;

import java.util.Scanner;

public class SwitchQuiz {

	public static void main(String[] args) {
		// 사용자로 부터 숫자를 입력받습니다.
		// 단 사용자는 100,90,80,70,60 만 입력합니다.
		// 100,90이면 우수
		// 80이면 보통
		// 70,60이면 낙제
		// 가 출력되도록 if문을 사용하지 말고 switch 로만 구현 하시오
		// 출력예> 숫자입력: 90
		//         우수 
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자입력:");
		int num=scan.nextInt();
		switch (num) {
		case 100:
		case 90:
			System.out.println("우수");
			break;
		case 80:
			System.out.println("보통");
			break;
		case 70:
		case 60:
			System.out.println("낙제");
			break;		
		}

	}

}









