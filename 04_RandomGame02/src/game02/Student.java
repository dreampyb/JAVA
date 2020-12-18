package game02;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		// 참여인원: 0명
		// 1. 고민중: 0명
		// 2. 코딩중: 0명
		// 3. 코딩중막힘: 0명
		// 4. 완료: 0명
		// 5. 초기화
        // 현재상태를 입력해주세요(1~5): 
		Scanner scan = new Scanner(System.in);
		int a=0,b=0,c=0,d=0,e=0,answer=0;
		
		while(true) {
			System.out.println("참여인원:"+a);
			System.out.println("1.고민중:"+b);
			System.out.println("2.코딩중:"+c);
			System.out.println("3.코딩중막힘:"+d);
			System.out.println("4.완료::"+e);
			System.out.println("5.초기화");
			System.out.println("현재상태를 입력해주세요(1~5):");
			answer=scan.nextInt();
			if(a==0) ++a;	//참여인원 증가
			if(a!=0) { //두번째 입력
				b=0; c=0; d=0; e=0;
			}
				
			switch(answer) {
				case 1: ++b; break;
				case 2: ++c; break;
				case 3: ++d; break;
				case 4: ++e; break;
			}
			if(answer==5) {
				a=0; b=0; c=0; d=0; e=0;
			}
			
		}//while
	}//main
}//class
