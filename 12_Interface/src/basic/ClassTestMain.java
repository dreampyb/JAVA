package basic;

public class ClassTestMain {

	public static void main(String[] args) {
		Class2 obj1 = new Class2(1,3);
		
		int sum = obj1.sum();   // 1+3 더한 리턴값
		System.out.println(sum);  //4
		
		Class3 obj2 = new Class3();
		sum = obj2.run(obj1);
		
		System.out.println(sum);
	}
}
