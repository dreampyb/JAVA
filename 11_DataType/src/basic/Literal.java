package basic;

public class Literal {

	public static void main(String[] args) {
		int num1=123;  //10진수 정수
		System.out.println(num1);
		
		int num2=010; //맨앞에 0이 8진수를 의미
		System.out.println(num2);
		
		int num3=0xa; //맨앞에 0x가 붙어있으면 16진수를 의미
		System.out.println(num3);
		
		int num4=0b11; //맨앞에 0b가 붙어있으면 2진수 
		System.out.println(num4);
		
		long num5=1L;	//맨끝에 L이 붙으면 long 타입리터럴
		System.out.println(num5);
		
		float num6 = 3.14f; //맨끝에 f를 붙이면 float
		System.out.println(num6);
		
		double num7= 3.15; //기본값이 double
		System.out.println(num7);
		
		double num8 = 3d; //맨뒤에 d가 있기 때문에 double
		double num9 = 3.0;
		
		boolean bool = true;
		
		char c = 'A';
		
	}

}
