package quiz;

public class Ex2Main {

	public static void main(String[] args) {
		Ex2 ex2 =new Ex2();
		
		ex2.set(3,5);  // set라는 메서드
		System.out.println(ex2.sum()); // sum 이라는 메서드, 출력 8
		
		int sum=Ex2.sum(1,10);
		System.out.println(sum);  //55
	}

}
