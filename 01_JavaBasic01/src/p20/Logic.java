package p20;

public class Logic {
	public static void main(String[] args) {
		int a=3, b=4;
		boolean result;
		result=a>b;
		// == ,!= , >, <, >=, <=,
		System.out.println(result);
		
		if (a==3) {
			System.out.println("a가 3이다.");
		}else {
			System.out.println("a가 3이 아니다.");
		}
		
		if (a==3) {
			b=4;
		}else {
			b=5;
		}
		//삼항연산자로 표기
		b = (a==3) ? 4: 5;
	}
}





