package quiz;

public class Ex3Main_String {

	public static void main(String[] args) {
		Ex3 obj1 = new Ex3();
		Ex3 obj2 = new Ex3("김산수");
		
		obj1.setStr("이철수");
		
		String fn1 = obj1.firstName();
		String fn2 = obj2.firstName();
		
		System.out.println(fn1); // 결과 : 이름중 첫글자만 출력
		System.out.println(fn2); 
		
		System.out.println(obj1.lastName());
		System.out.println(obj1.lastName());
		
		Ex3 obj3 = new Ex3("강다니엘");
		System.out.println(obj3.lastName());
		
		System.out.println(obj3.nameLength()); // obj3의 이름갯수
	
		System.out.println(obj3.add()); // 이름+님
		
		obj3.printName();  // 출력: 성은 강
		              			  // 출력: 이름은  다니엘입니다.
	}

}
