package review;

import java.util.Scanner;

public class If_Test {

	public static void main(String[] args) {
		// 사용자로 부터 두개의 숫자를 입력받아 큰수를 출력하는 프로그램
		// 단 두수가 동일하면 똑같은 수입니다. 라고 출력되게 변경
		Scanner scan = new Scanner(System.in);
				
		System.out.print("첫번째 숫자입력:");
		int num1 = scan.nextInt();
		System.out.print("두번째 숫자입력:");
		int num2 = scan.nextInt();
		
		if(num1>num2) {
			System.out.println("큰수는"+num1);
		}else if(num1<num2) { 
			System.out.println("큰수는"+num2);
		}else {
			System.out.println("두수가 동일합니다.");
		}
	}

}
