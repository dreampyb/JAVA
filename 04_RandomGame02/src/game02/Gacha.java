package game02;

import java.util.Scanner;

public class Gacha {

	public static void main(String[] args) {
		// 2% 로 당첨되는 프로그램
		// 뽑아주세요(1~10),0은 종료: 3
		// 당첨되었습니다.
		// 다음기회에
		
		//1. 1~10사이의 랜덤값을 가져온다.
		Scanner scan = new Scanner(System.in);

		while(true) {
			int com=(int)(Math.random()*50)+1; //1~50
			//System.out.println("컴퓨터값"+com);
			
			System.out.print("뽑아주세요(1~10),0은 종료:");
			int num=scan.nextInt();	//정수값을 사용자로 부터 받아 num 저장한다.
			if(num==0) break;
					
			//2. 그값과 사용자가 입력한 값이 같으면 당첨
			if(com==num) {
				System.out.println("당첨되었습니다.");
			}else { //3. 다르면 비당첨
				System.out.println("다음기회에");
			}
		}
		System.out.println("이용해주셔서 감사합니다.");
	}

}
