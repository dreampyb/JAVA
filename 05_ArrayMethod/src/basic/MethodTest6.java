package basic;

public class MethodTest6 {
	
	static int a=3;
	

	public static void main(String[] args) {
		a=4;
		int num = mul(5); // 입력한수를 5곱해서 돌려주는 메소드
		System.out.println(num); //25출력
		System.out.println(a);
	}
	
	public static int mul(int num) {
		a=5;
		return num *5;
	}

}
