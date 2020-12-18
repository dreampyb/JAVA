package simple;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		//홀짝 게임을 만들자
		//1. 숫자를 입력받는다(0:짝, 1:홀)
		//2. 맞는지 틀리는지 무한으로 해보자
		Scanner scan = new Scanner(System.in);
		int com;
		int user;
		for(;;) {
			com=(int)(Math.random()*10)+1;	//컴퓨터가 정한수(1~10)
			System.out.println("랜덤값"+com);
			System.out.println("숫자를 입력해주세요(0:짝, 1:홀): ");
			user=scan.nextInt();
			if((com%2) == user) {
				System.out.println("정답입니다.");
			}else {
				System.out.println("틀렸습니다.");
			}
		}
//		a= (int)(Math.random());
	}

}
