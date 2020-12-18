package quiz;

public class Quzi2Main {

	public static void main(String[] args) {
		Quiz2 obj = new Quiz2();
		Quiz2 obj1 = new Quiz2(1);
		Quiz2 obj2 = new Quiz2(1,7);
		
		System.out.println(obj.sum());   // 출력:0
		System.out.println(obj1.sum()); // 출력:1
		System.out.println(obj2.sum()); // 출력:8

	}

}
