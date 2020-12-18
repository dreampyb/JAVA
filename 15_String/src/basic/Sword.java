package basic;

import java.util.Scanner;

public class Sword {

	public static void main(String[] args) {
		//집행검 강화 프로그램 (최초값 0)
		//강화 성공시 +1
		//강화 실패시 사라짐
		
		//다른 말로는 홀짝 게임 (판돈은 1원,최초 가지고 있는돈은 0원)
		//연속성공시 +1
		//실패시 모두 사라짐

		Scanner scan = new Scanner(System.in);
		
		int sword=0; 	//최초 검상태
		boolean loop=true;
		System.out.print("집행검 강화를 시작합니다.");
		System.out.println("현재 집행검상태는 0입니다.");
		do {
			System.out.print("강화를 시작하시겠습니까? (네, 아니오)");
			if(scan.next().equals("아니오"))
				loop=false;
			else {
				int com=(int)(Math.random()*2);  //0 or 1
				int user=(int)(Math.random()*2); //0 or 1
				if(com==user) {
					System.out.println("축! 강화성공");
					++sword;
					System.out.println("현재 집행검 상태는 +" + sword + "입니다." );
				}else {
					System.out.println("검이 강화에 실패했습니다.");
					System.out.println("게임을 종료합니다.");
					sword=0;
					loop=false;
				}
			}
		}while(loop);
		System.out.print("최종 집행검 상태는 +"+sword+"입니다.");
		
		
	}

}
