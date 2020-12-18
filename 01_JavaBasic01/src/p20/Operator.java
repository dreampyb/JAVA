package p20;

public class Operator {

	public static void main(String[] args) {
		// -- , ++
		int a=1, b=2;
		++a; //a=a+1
		++b; //b=b+1
		System.out.println("++a는"+a); //2 = 1+1
		System.out.println("++b는"+b); //3 = 2+1
		a++; //a=a+1
		b++; //b=b+1
		System.out.println("++a는"+a); //3 = 2+1
		System.out.println("++b는"+b); //4 = 3+1
		//////////////////////////////////////////////////////
		System.out.println("++a는"+ (++a)); //4 = 3+1
		System.out.println("++b는"+ (++b)); //5 = 4+1
		
		System.out.println("++a는"+ (a++)); //4 중요
		System.out.println("++b는"+ (b++)); //5 중요
		
		System.out.println("++a는"+ a); //5 
		System.out.println("++b는"+ b); //6 
		b = ++a;
		
	}

}
