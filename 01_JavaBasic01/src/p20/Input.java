package p20;

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		//사용자로 부터 키보드값 입력받기
		Scanner scan = new Scanner(System.in); //이건 한번만 선언
		
		//입력을 받고 싶으면 이후에는
		int a,b;
		System.out.println("첫번째 숫자하나를 입력해주세요");
		a=scan.nextInt(); //키보드로 부터 값을 받는다.
		System.out.println("입력된 숫자는" + a);
		
		System.out.println("두번째 숫자하나를 입력해주세요");
		b=scan.nextInt(); //키보드로 부터 값을 받는다.
		System.out.println("입력된 숫자는" + b);
		int c;
		c=a+b;
		
		
	}
}
