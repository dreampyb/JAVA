package basic;

public class ClassTest {

	public static void main(String[] args) {
		Abc obj1 = new Abc(5,4);  // 출력: 1번째 객체가 생성 되었습니다.
		Abc obj2 = new Abc(8,2);  // 출력: 2번째 객체가 생성 되었습니다.
		
		int a = obj1.rem();
		int b = obj2.rem();
		
		System.out.println("나머지값은"+a); //나머지 값은 1  (나머지값 %)
		System.out.println("나머지값은"+b); //나머지값은 0  
		
		int c=Abc.sum(1,4);  //hint:static method 구현
		System.out.println("더한값은"+c);  //더한 값은 5

	}

}
