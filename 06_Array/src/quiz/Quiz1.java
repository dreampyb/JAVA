package quiz;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		// 사용자로 부터 9번의 정수 숫자를 입력받습니다.
		// 입력완료후 순서대로 출력됩니다.
		// 출력예> 1번째 숫자입력: 1
		//         ... 9번째 숫자입력:  78
		// 입력하신숫자는  1  2  7  9 .....   78
		// 단 배열을 사용하시요. 
	      Scanner scan = new Scanner(System.in);
	     
	      int[] num = new int[9];
	      
	      for(int i=0; i<9; i++) {
	    	  System.out.println((i+1)+"번째 숫자입력: ");
	    	  num[i]=scan.nextInt();
	      }
	      
	      for(int temp :num) {
	    	  System.out.println(temp);
	      }
	      
	      scan.close();
		
	}

}
