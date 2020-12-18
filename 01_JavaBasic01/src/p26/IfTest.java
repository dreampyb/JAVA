package p26;

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		// if (조건){
		//  참조건일때 실행; }
		// else{
		//  거짓일때 실행;
		//	}
		// 사용자로 부터 숫자 하나를 입력받아서 홀수 인지 짝수인지 확인해
		// 주는 프로그램
		Scanner scan = new Scanner(System.in); 
		System.out.println("숫자하나를 입력해주세요:");
		int num=scan.nextInt();
		
		if( (num%2) == 0 ) {
			System.out.println("입력한수가 짝수입니다.");
		}else if(num%2==1) {
			System.out.println("입력한수가 홀수입니다.");
		}else {
			System.out.println("이건 절대 나올수가 없습니다.");
		}
		
		
		
		
	}

}





