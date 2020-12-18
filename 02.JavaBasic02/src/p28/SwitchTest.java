package p28;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		//사용자로부터 숫자하나를 입력받아
		// 1이면 사과
		// 2이면 수박
		// 3이면 오렌지
		// 4이면 멜론
		// 5이면 망고
		// 6이면 참외 
		// 그외의 숫자가 입력되면 딸기가 출력되도록 만드시오.
		// 출력예>   숫자입력: 5
		//           망고다
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자입력:");
		int num=scan.nextInt();
		if(num==1) {
			System.out.println("사과다");
		}else if(num==2) {
			System.out.println("수박");
		}else if(num==3) {
			System.out.println("오렌지");
		}else if(num==4) {
			System.out.println("멜론");
		}else if(num==5) {
			System.out.println("망고");
		}else if(num==6) {
			System.out.println("참외");
		}else {
			System.out.println("딸기");
		}
		
		//스위치 문으로 작성시
		switch(num) {
			case 1:	
				System.out.println("사과다");
				break;
			case 2:	
				System.out.println("수박");
				break;
			case 3:	
				System.out.println("오렌지");
				break;
			case 4:	
				System.out.println("멜론");
				break;
			case 5:	
				System.out.println("망고");
				break;
			case 6:	
				System.out.println("참외");
				break;
			default:
				System.out.println("딸기");
		}
	}

}

















