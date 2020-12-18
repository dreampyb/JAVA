package review;

import java.util.Scanner;

public class Input_Test {

	public static void main(String[] args) {
		// 사용자로 부터 두개의 숫자를 입력받아서
		// 더한값을 알려주는 프로그램
		// 출력형태> 
		// 첫번째 숫자입력: 3
		// 두번째 숫자입력: 5
		// 3과5를 더한수는 8입니다.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 숫자입력:");
		int num1 = scan.nextInt();
		System.out.println("두번째 숫자입력:");
		int num2 = scan.nextInt();
		
		System.out.println(num1+"과"+num2+"를 더한수는 "+(num1+num2)+"입니다.");
		
	}

}
