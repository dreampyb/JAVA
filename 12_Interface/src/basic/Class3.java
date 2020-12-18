package basic;

public class Class3 {
	int run(Class2 aa) {
		int sum=aa.sum();
		for(int i=0; i<sum; i++) {
			System.out.println("*");
		}
		return sum;
	}
}
