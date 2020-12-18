package p20;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
//		--입력--
//		kor : 90 
//		eng : 70 
//		mat : 75
//		
//		--출력--
//		합계점수 : 235점
//		평균점수 :  78   <-- 정수만
		Scanner scan = new Scanner(System.in);
		System.out.println("이름:");
		String name=scan.next();
		System.out.print("kor:");
		int kor=scan.nextInt();
		System.out.print("eng:");
		int eng=scan.nextInt();
		System.out.print("mat:");
		int mat=scan.nextInt();
		
		System.out.println("이름은:"+name);
		System.out.println("합계점수:"+(kor+eng+mat));
		System.out.println("평균점수:"+((kor+eng+mat)/3));
		
	}

}
