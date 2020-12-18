package InterfaceEx;

public class Test {

	public static void main(String[] args) {
		Square s1 = new Square(5, 10);
		Triangle t1 = new Triangle(5,10);
		
		System.out.println("넓이는" + s1.area());
		System.out.println("넓이는" + t1.area());

		area(s1);
		area(t1);
	}

	static void area(InterArea a) {
		System.out.println("넓이는" + a.area());
	}
}
