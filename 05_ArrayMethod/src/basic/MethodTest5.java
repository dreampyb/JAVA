package basic;

public class MethodTest5 {

	public static void main(String[] args) {
		int a = add(4);
		System.out.println(a);
		int b = sub(10);
		System.out.println(b); //1이 감소되서 출력
		int big = com(6,5); //둘중이 큰값을 찾아내는 메소드
		System.out.println(big);
	}
	
	public static int add(int num) {	//값을 1증가시키는 메소드
		return ++num;
	}
	
	public static int sub(int num) {
		return --num;
	}
	
	public static int com(int a, int b) {
		int num;
		if(a>b) {
			num=a;
		}else {
			num=b;
		}
		return num;
	}
}
