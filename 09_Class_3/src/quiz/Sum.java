package quiz;

public class Sum {
	//1.필드값으로 num1:int, num2:int가지고 있다.
	//2.num1부터 num2까지 연속된 수를 다더해서 출력하고
	// 더한 값을 리턴해주는 result메서드를 가지고 있다.
	//화면에 출력형태: 1부터10까지 더한 값은 5050입니다.
	//3. Sum을 통한 객체 생성시 무조건 num1과 num2값을 초기화 해줘야지만 생성할 수 있다.
	int num1;
	int num2;
	
	Sum(int num1, int num2) {
		 this.num1=num1;
		 this.num2=num2;
	}
	
	public Sum() {
		int num1=1;
		int num2=100;
	}

	int result() {    //을 붙히면 끝나므로 중괄호릏써서 그 값을 계산한다
		int sum=0;
		for(int i=num1; i<=num2; i++) { // num2까지이므로 '='을 함께 써준다.
			sum = sum+i;
		}
		System.out.println(num1+"부터 "+num2 +"까지 더한 값은 " +sum+"이다");
		return sum;
	}
}