package review;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// 사용자로 부터 반지름을 입력받아 원의 넓이를 계산하는 프로그램
		// 원의 넓이: R * R * 3.14 
		Scanner scan = new Scanner(System.in);
		System.out.println("반지름 입력:");
		int r=scan.nextInt();
		
		System.out.println(r*r*3.14);
		
	}

}
