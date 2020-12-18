package basic;

public class MethodTest3 {

	public static void main(String[] args) {
		//4칙연산하는 메소드4개 그리고 나머지값 구하는 % 1개 -> 총 5개의 메소드를 만들자
		//사용자로 부터 두개의 숫자를 입력받아서 메소드를 통해서 처리하고 출력하는 프로그램
		int a=5;
		int b=7;
		int num1=add(a,b);
		System.out.println( num1 );
		System.out.println( add( a , b) );
		System.out.println( sub(a,b) );
		System.out.println( mul(a,b) );
		System.out.println( div(a,b) );
		System.out.println( rem(a,b) );
		
	}
	
	public static int add(int a, int b) {
		
		return a+b;
	}
	
	public static int sub(int a, int b) {
		
		return a-b;
	}
	public static int mul(int a, int b) {
		
		return a*b;
	}
	public static int div(int a, int b) {
		
		return a/b;
	}
	public static int rem(int a, int b) {
		
		return a%b;
	}

}

