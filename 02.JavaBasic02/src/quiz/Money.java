package quiz;

import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
/****************************************
 사용자로 부터 돈을 입력받아 화폐의 갯수를 구하시오.
 단, 최대 5자리수만 입력한다고 가정

money = 65430

만원 = 6   -> 65430/10000 = 6

천원 = 5   -> (65430 - (6*10000))/1000=5 or (65430%1000)/1000=5

백원 = 4

십원 = 3
*************************************/
		Scanner scan = new Scanner(System.in);
		System.out.println("money = ");
		int num = scan.nextInt();
		System.out.println("만원 = " + (num/10000));
		System.out.println("천원 = " + ((num%10000)/1000));
		System.out.println("백원 = " + ((num%1000)/100));
		System.out.println("십원 = " + ((num%100)/10));
	}

}










