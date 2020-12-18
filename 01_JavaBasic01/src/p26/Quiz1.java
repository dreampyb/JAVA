package p26;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		/**********************************
		키보드로 수를 입력받아 두수중 큰수를 출력하시오
     	Input a : 5
		Input b : 13
		큰수 : 13 
		***********************************/
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input a : ");
		//int num1=scan.nextInt();
		int num1;
		num1=scan.nextInt();
		System.out.print("Input b : ");
		int num2=scan.nextInt();
		
		if (num1 > num2) {
			System.out.println("큰수 : "+num1);
		}else if(num1 == num2){
			System.out.println("두수가 같습니다.");
		}else {
			System.out.println("큰수 : "+num2);
		}
	}
}





