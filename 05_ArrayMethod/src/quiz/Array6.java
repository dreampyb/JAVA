package quiz;

import java.util.Scanner;

public class Array6 {

	public static void main(String[] args) {
		// 사용자로부터 5개의 정수를 입력받는다.
		// 총합과 평균을 구해서 출력한다.
		Scanner scan = new Scanner(System.in);
		int[] num = new int[5];
		for(int i=0; i<5; i++) {
			num[i]=scan.nextInt();	//5개배열 사용자입력
		}
		int sum=0;
		for(int i=0; i<5; ++i) {
			sum += num[i];
		}
		System.out.println("총합" + sum + "평균" +sum/5);
	
	
	}

}
