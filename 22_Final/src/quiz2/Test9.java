package quiz2;

import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		// 프로그램 실행시 10% 확률로 당첨이라고 출력되기
		// 또는 꽝(90%)이라고 출력
		Scanner scan = new Scanner(System.in);
		int a;
		for(int i=0; i<10; i++) {
			System.out.println("숫자입력 : ");
			a = scan.nextInt();
			int num =(int)(Math.random()*10)+1;      // 1~10
		
		if(num==a) 
			System.out.println("당첨");
		else 
			System.out.println("꽝");
		}
	}
}