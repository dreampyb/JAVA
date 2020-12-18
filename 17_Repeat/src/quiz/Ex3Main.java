package quiz;

public class Ex3Main {

	public static void main(String[] args) {
		Ex3 obj1 = new Ex3();
		Ex3 obj2 = new Ex3("김산수");
		
		obj1.setStr("이철수");
		
		String fn1 = obj1.firstName();
		String fn2 = obj2.firstName();
		System.out.println(fn1); //출력결과 이
		System.out.println(fn2); //출력결과 김

		System.out.println(obj1.lastName()); //출력결과 철수
		System.out.println(obj1.lastName()); //출력결과 산수
		
		Ex3 obj3 = new Ex3("강다니엘");
		System.out.println(obj3.lastName());
		
		System.out.println(obj3.nameLength()); //출력 4
		
		System.out.println(obj3.add()); //강다니엘님
		obj3.printName(); //출력   성은 강 
		                  //출력   이름은 다니엘 입니다.
	
	}

}




