package p29;

import java.util.Scanner;

public class GuGuDan {

	public static void main(String[] args) {
		// 2*2=4
		// 2*3=6
		// 3*2=6
		for(int j=2; j<20; j=j+2) {
				for(int i=2; i<20; ++i ) {
					System.out.println( j+ "*"+ i + "="+ (j*i));
			}
		}
		//사용자로부터 원하는 단수를 입력받아 출력하는 프로그램
		//출력예> 추가로 출력할 단수를 입력해주세요: 27
		//           27*2=54
		//        	 ....
		//           27*27=?  
		Scanner scan = new Scanner(System.in);
		System.out.print("추가로 출력할 단수를 입력해주세요:");
		int num=scan.nextInt();
		for(int i=2; i<=num; i++) {
			System.out.println(num + "*" + i + "=" + (num*i) );
		}
		
		
		
		
		
	}

}











