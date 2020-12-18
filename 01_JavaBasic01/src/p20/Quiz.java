package p20;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1,num2,num3;
		System.out.println("첫번째 값 입력:");
		num1=scan.nextInt();
		System.out.println("두번째 값 입력:");
		num2=scan.nextInt();
		System.out.println("세번째 값 입력:");
		num3=scan.nextInt();
		
		System.out.println("다더한값은"+ (num1+num2+num3));
		System.out.println("다곱한값은"+ (num1*num2*num3));
		
	}

}
