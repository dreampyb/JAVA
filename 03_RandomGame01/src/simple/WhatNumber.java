package simple;

import java.util.Scanner;

public class WhatNumber {

	public static void main(String[] args) {
		// 숫자 맞추기 게임
		// 1.숫자 정해놓고 맞추기
		// 2.추가>입력한 숫자가 높은지 낮은지 알려주기
		// 3.추가> 컴퓨터 숫자정하기(랜덤)
		// 4.추가> 횟수 안에 맞추기(5번) -몇번째 횟수인지 출력
		// 5.추가> 마지막5차는 높은지 낮은지 안알려주고 처리
		Scanner scan = new Scanner(System.in);
		int com=(int)(Math.random()*100)+1;	//컴퓨터가 정한수(1~100)
		System.out.println("랜덤값"+com);
		int user,count=0;
		do{
			++count; //루프문 반복횟수 의미
			if(count==6) break;
			System.out.println(count+"차 입니다. 맞출 수를 입력해주세요: ");
			user=scan.nextInt(); //사용자가 입력한수 입력한 수
			if(user>com && count<5) 
				System.out.println("입력한 수가 큽니다");
			else if(user<com  && count<5)  
				System.out.println("입력한 수가 작습니다.");
		}while(com != user);
		if(count==6) {
			System.out.println("실패!!!");
		}else {
			System.out.println("정답입니다.");
		}

	
		
	}

}
