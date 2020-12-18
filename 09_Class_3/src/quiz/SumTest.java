package quiz;

public class SumTest {
		
	public static void main(String[] args) {
		// Sum클래스를 가지고 obj1, obj2라는 이름의 2개의 객체를 생성한다/
		// 이때 각각 초기값으로 obj1은 1,10을 obj2는 5,50의 값을 갖도록 만든다.
		// 
		//
		
		Sum obj1 = new Sum(1,10);
		Sum obj2 = new Sum(5,50);
		
		Sum obj3 = new Sum();  // 이때는 num1과 num2값이 각각 1,100으로 초기화 되도록
		
		// obj1의 메소드를 이용해서 더한 값을 출력.
		int add1=obj1.result();   // Sum Class dml 22행의 기능을 가져온다.
		System.out.println(add1);
		// obj2의 메소드를 이용해서 더한 값을 출력.
		obj2.result(); // Sum Class dml 22행의 기능을 가져온다.
		System.out.println();
		
			
		
	}

}
