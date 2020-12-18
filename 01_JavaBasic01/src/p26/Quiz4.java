package p26;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
	/********************************************
	 (공식)①,② 두조건을 다 만족해야 윤년임
	 	   ①년도를 4로 나누어 떨어져야 함
	 	   
		   ②년도를 100으로나누어 떨어지지 않거나
	         년도를 400으로 나누어 떨어져야 함
	
	 (참고) 4(윤년), 100(평년), 400(윤년)임 
	 
	 --출력--
	년도 입력 : 2000
	윤년
	***********************************************/
		Scanner scan = new Scanner(System.in);
		System.out.println("년도를 입력해 주세요. 윤년을 확인해줄게요.");
		int num=scan.nextInt();
	
		if( ((num%100)!=0 || (num%400)==0) && (num%4)==0) {
			System.out.println("윤년");
		}else {
			System.out.println("평년");
		}
		
//		if(((num%100)!=0 || (num%400)==0)) {
//			if((num%4)==0) {
//				//윤년
//			}
//		}
	}
}






