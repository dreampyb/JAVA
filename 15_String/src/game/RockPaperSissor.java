package game;

import java.util.Scanner;

public class RockPaperSissor {
	
	private static final int 가위=1, 바위=2, 보=3;
	
	public static void main(String[] args) {
		// 가위바위보 게임
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("시작:1, 종료:2");
			
			if(scan.nextInt()>1) break; {
				int win = 0;
				int lose = 0;
				int compare = 0;
				int com = 0;
				int human =0;
			
				for(int i=0; i<10; i++) {
					int result=0;
				
					com =(int)(Math.random()*10)%3+1;
					System.out.print("가위:1, 바위:2, 보:3");
					human = scan.nextInt();
			
					result = result(human,com);
			
			if(result==0) {
				win++;
			}else if(result==1) {
				lose++;
			}else if (result==2) {
				Compare++;
			}
			System.out.println(win+"승"+lose+"패"+compare+"비김");
		}
	}
}
		