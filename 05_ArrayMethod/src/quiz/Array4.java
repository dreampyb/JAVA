package quiz;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		// 사용자로부터 3개의 숫자를 입력받는다.
		// 평균값을 출력한다.
		int[] array = new int[3];
		
		Scanner scan = new Scanner(System.in);
		int sum=0;
		for(int i=0; i<3; ++i) {
			System.out.println("숫자입력:");
			array[i]=scan.nextInt();
			
		}
		for(int i=0; i<3; ++i) {
			sum += array[i];
		}
		System.out.println(sum/3);
		

	}

}
