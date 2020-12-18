package p20;

public class Quiz4 {

	public static void main(String[] args) {

//	 조건1) 기본급이 1,500,000원,수당이 55,000원,세금은 기본급의 10%
//	 조건2) 실수령액 = 기본급 + 시간수당 - 세금
//   --입력--
//	 기본급: 1500000
//	 수당: 55000
	
//	 --출력--
//    실수령액 : 1405000원

	int a=1500000;
	int b=55000;
	System.out.println("실수령액:"+(a+b-(a*0.1)));
		


	}

}
