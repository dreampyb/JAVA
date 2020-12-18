package quiz;

import java.util.Scanner;

public class Array5 {

	public static void main(String[] args) {
		// 1.사용자로 부터 10개의 숫자를 입력받아서 배열에 저장한다.
		// 2.입력된 숫자를 모두 출력합니다.
		// 3.입력된 숫자중 짝수의 개수 출력
		// 예> 입력주세요:1  ....
		// 1 4
		// 이중에 짝수의 개는 모두 6개 입니다.
		Scanner scan = new Scanner(System.in);
		int[] num = new int[10];
		for(int i=0; i<10; i++) {
			num[i]=scan.nextInt();	//10개배열 사용자입력
		}
		for(int i=0; i<10; i++) {
			System.out.println(num[i]);
		}
//		int count=0;
//		for(int i=0; i<10; i++) {
//			if(num[i] % 2 == 0) { //짝수
//				++count;
//			}
//		}
		int count=10;
		for(int i=0; i<10; i++) {
			count -= (num[i] % 2);
		}
		
		System.out.println("짝수의 개수"+count);
		scan.close();
	}

}
