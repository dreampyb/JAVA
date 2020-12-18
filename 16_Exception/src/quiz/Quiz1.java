package quiz;

import basic.Ex3;

public class Quiz1 {

	public static void main(String[] args) {
		Ex3 obj = new Ex3(4,0);
		
		try {
			System.out.println(obj.div());
		} catch (Exception e) {
			System.out.println("에러났습니다.`ㅈ");
		//	e.printStackTrace(); 
		// 에러 메세지의 발생 근원지를 찾아서 단계별로 에러를 출력한다.
		}
		System.out.println("계속실행");
	}

}
//에외발생시 "에러났습니다" 출력
//2