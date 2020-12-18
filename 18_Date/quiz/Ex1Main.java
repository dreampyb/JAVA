package quiz;

public class Ex1Main {

	public static void main(String[] args) {
	/* 1단계: Ex1 클래스를 구현하시오. 생성시 두개의 숫자를 넣어서만 생성되고
	 * primeCount() 메소드를 통해 입력된 두 숫자사이에 존재하는 소수의 개수를 
	 * 구해서 리턴해주는 메소드
	 * 소수란? 1과 자신자신으로만 나누어지는 수(단 1은 소수 아님)
	 * 소수판별법: 해당숫자를 2부터 해당숫자-1까지 나누었을때 나머지가 있으면
	 * 그수는 소수다.
	 * 2단계: Ex1 클래스를 상속받은 Ex2 클래스를 구현하시오.
	 * 3단계: Ex2 클래스를 상속받고 Ex3 인터페이스를 구현한 Ex4클래스를 구현
	 * 하시오(Ex3 인터페이스도 구현해야 합니다.) 
	 * 4단계: Ex4를 상속받은 Ex5를 구현하시오.
	 * 5단계: Ex6 클래스를 구현하시오.
	*/	
		Ex1 ex1 = new Ex1(1,100);
		int primeCount=ex1.primeCount();  
		System.out.println("소수의 개수는" + primeCount); //25
		
		Ex2 ex2 = new Ex2(1,100);
		int count=ex2.count(3);
		System.out.println("현재 요청하는 개수는 : "+count);  //25*3 = 75
		
		Ex4 ex4 = new Ex4(1,100);
		int num=ex4.primeCount(1,10);
		System.out.println(num); //4 (1~10 소수개수-위에서 넣어준값)
		ex4.endPrint(); //출력결과 : 종료
        //endPrint() 메소드는 Ex3 인터페이스의 추상메소드	
		
		Ex5 ex5 = new Ex5(1,100);
		ex5.primeCount();	//출력결과: 이제진짜 끝
		
		System.out.println(Ex6.sum(1,2)); //출력결과 3
		
		//Ex7을 클래스를 만들어 봅시다.
		Ex7.aa.primeCount();	//출력결과: 이젠진짜 끝
		//즉 aa는 Ex5 클래스를 의미
	
		//Ex8을 클래스를 만들어 봅시다.
		Ex8 ex8 = new Ex8(new Ex1(1,10));
		System.out.println("값"+ex8.ex1.primeCount()); //25
		
		//Ex9 클래스 만들기 보너스 기준
		Ex9 obj1 = new Ex9();
		Ex9 obj2 = new Ex9();
		Ex9 obj3 = new Ex9();
		obj3.add(7);
		obj1.add(4);
		obj2.add(5);
		obj1.print(); //출력결과 16
		obj2.print(); //출력격과 16
	}
}