package game02;

import java.util.Scanner;

public class Dice {

	public static void main(String[] args) {
		// 반복할 횟수를 입력해주세요: 200
		// 8주사위를 입력된 횟수만큼 던져서 각 눈금이 나오는 회수를 출력하시오.
        // 출력예> 1눈금 : 16%
		//         2눈금 : 14%
		//         ..
		//         6눈금 : 15%
		//1. 100번 반복문을 만든다.
		//  2-1. 반복문안에 주사위를 던지는 행위(즉 랜덤을이용)를 한번한다.
		//  2-2. 주사위를 던지고 나서 나온눈금의 해당횟수를 저장한다.  
		//3. 반복문이 끝나면 해당횟수를 출력한다.
		Scanner scan = new Scanner(System.in);
		System.out.println("반복횟수를 입력해주세요:");
		int count=scan.nextInt();
		int count1=0,count2=0,count3=0,count4=0,count5=0,count6=0,count7=0,count8=0;
		for(int i=0; i<count; ++i) {
			int num=(int)(Math.random()*6)+1;
			if(num==1)	++count1;
			else if(num==2)	++count2;
			else if(num==3) ++count3;
			else if(num==4) ++count4;
			else if(num==5) ++count5;
			else if(num==6) ++count6;
			else if(num==7) ++count7;
			else ++count8;
		}

		System.out.println("1눈금 나온확률:"+(count1*100/count)+"%");
		System.out.println("2눈금:"+(count2*100/count)+"%");
		System.out.println("3눈금:"+(count3*100/count)+"%");
		System.out.println("4눈금:"+(count4*100/count)+"%");
		System.out.println("5눈금:"+(count5*100/count)+"%");
		System.out.println("6눈금:"+(count6*100/count)+"%");
		System.out.println("7눈금:"+(count7*100/count)+"%");
		System.out.println("8눈금:"+(count8*100/count)+"%");
	}
	
	
	
	

}
