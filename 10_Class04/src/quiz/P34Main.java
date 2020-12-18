package quiz;

public class P34Main {

	public static void main(String[] args) {
		P34 obj = new P34();       // 0으로 초기화 (P34의 필드 명칭은 num)
		P34 obj1 = new P34(1);   // 1로 초기화
		
		int num1=obj.add(5);      // 5를 더해서 리턴
		int num2=obj1.add(10);  // 10을 더해서 리턴
		
		System.out.println(num1);  //5
		System.out.println(num2);  //11
		
		System.out.println(obj.num);    //  0
		System.out.println(obj1.num);  //  1
		

	}
}
