package basic;

public class Method_Test {

	public static void main(String[] args) {
		int sum = add(3,4);
		System.out.println(sum);
		test1();
		int sum1=sum(1,2,3,4);
		System.out.println("다더하면"+sum1);
		int value1=sub(5,1);
		System.out.println("빼기수행한결과"+value1);
	}
	
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static void test1() {
		System.out.println("test1을 호출했습니다.");
	}

	public static int sum(int a, int b, int c, int d) {
		return a+b+c+d;
	}
	
	public static int sub(int a, int b) {
		return a-b;
	}
	
}
