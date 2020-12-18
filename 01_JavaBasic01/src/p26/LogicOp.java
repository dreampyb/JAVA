package p26;

public class LogicOp {

	public static void main(String[] args) {
		/***********************************
		 * and &&  둘다 참일때만 참
		 * or ||   둘중에 하나만 참이면 참
		 * not !   반대로 (참->거짓) (거짓->참)
		 **************************************/
		int num1=1,num2=2,num3=3;
		if((num1>num2) || (num3>num2)) {
			System.out.println("둘중에 하나만 참이면 실행");
		}
		if((num1>num2) && (num3>num2)) {
			System.out.println("둘다 참이어야지만 실행");
		}
		if(!(num2>num2)) { 
			System.out.println("num1이 num2보다 작거나 같을때");
		}
		if(((num1>num2) || (num3>num2)) && (num3<num1)) {}
		//주의 && -> & 비트연산자 and
		//주의 || -> | 비트연산자 or
	}
}



