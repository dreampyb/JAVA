package p20;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		// 사용자로부터 2개의 숫자를 입력받아
		// 4칙연산 + 나머지값 
		// 연산을 수행하는 결과는 출력하는 프로그램을 작성하시오.
		// + , - , * , /, %
        // 5/2 = 몫 2, 나머지1 (5%2)
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 숫자입력");
		int num1=scan.nextInt();
		System.out.println("두번째 숫자입력");
		int num2=scan.nextInt();

		System.out.println("몫은:" + (num1/num2));
		System.out.println("나머지는:" + (num1%num2));
		
	}

}
