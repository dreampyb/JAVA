package quiz;

public class Ex2Main {

	public static void main(String[] args) {
		Ex2 ex2 = new Ex2();
		
		ex2.set(3,5);
		System.out.println(ex2.sum()); //출력결과 8
	
		int sum=Ex2.sum(1,10);
		System.out.println(sum); //55

	}

}
