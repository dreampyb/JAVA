package basic;

public class MethodTest2 {

	public static void main(String[] args) {
		int test = check(5,4);  //check 메소드는 둘중에 큰수를 돌려(return)줍니다.
		System.out.println(test);
		//printStar메소드를 사용해서 별* 10개찍기
		printStar(100);
		// *
		// **
		// ***
		// ****
		// *****
		//for문과 printSart을 한번써서 구현해보자
//		printStar(1);
//		System.out.println();
//		printStar(2);
//		System.out.println();
//		printStar(3);
//		System.out.println();
//		printStar(4);
//		System.out.println();
//		printStar(5);
		for(int i=1; i<6; i++) {
			printStar(i);
			System.out.println();
		}
		
	}

	public static int check(int a, int b) {
		int result;
		if(a>b)
			result=a;
		else
			result=b;
		
		return result;
	}
	
	//return 없음 void / 파라미터로는 정수값을 받는다/ 정수값만큼 *을 찍는 프로그램 / 메소드 이름 printStar
	public static void printStar(int a) {
		for(int i=0; i<a ; i++) {
			System.out.print("*");
		}
		
	}
}
