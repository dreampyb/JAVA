package basic;

public class InterMain {

	public static void main(String[] args) {
		Test1 test1 = new Test1();
		
		int sum=test1.sum(1,10);
		System.out.println(sum);   //그냥 다 더해서 55

		Test2 test2 = new Test2();
		int sum1=test2.sum(1,10);
		System.out.println(sum1);    //짝수만 더해서 출력 30
		//////////////////////////////////////////////////////////////////
		SumPrint obj1 = new SumPrint();
		obj1.print(test1);  // aa가 SumPrint 클래스의 test1이 된다.
	}
}