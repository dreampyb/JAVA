package basic;

public class MethodTest4 {
		
	public static void main(String[] args) {
		//프로그램
		int result=sum(500); //1에서 부터 입력값 까지 더해주는 메소드
		System.out.println(result);
//		int a=200;
//		int sum=0;
//		for(int i=1; i<=a; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
		
	}	   
	
	public static int sum(int a) {
		//a=500
		int sum=0;
		for(int i=1; i<a; i++) {
			sum=sum + i;
		}
		return sum;
	}

}
