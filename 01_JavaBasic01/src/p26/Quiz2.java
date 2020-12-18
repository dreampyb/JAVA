package p26;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
/*		값을 입력받아 100보다 크면(초과) "입력오류!!"  출력

		점수입력 : 120
		입력오류!!

		점수입력 : 55
		입력된값 : 55		*/
		Scanner scan = new Scanner(System.in);
		System.out.print("점수입력 : ");
		int num=scan.nextInt();
		if( num > 100) {
			System.out.println("입력오류!!");
		}else {
			System.out.println("입력된값 : " +num);
		}
		
	}

}
