package quiz2;

public class Test5 {

	public static void main(String[] args) {
		// 클래스 만들기
		//다음의 프로그램이 동작하도록 클래스를 작성하시오
		Test5Class ts = new Test5Class(3,4,5);
		
		int num = ts.mul();
		System.out.println(num); //출력값은 3*4*5의 값인 60
		
	}

}
