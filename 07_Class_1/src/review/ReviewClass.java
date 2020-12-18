package review;

public class ReviewClass {
	// 두개의 정수형 필드를 가지고 있고
	int a;
	int b;
	
	
	//생성자 규칙: 리턴값없음 클래스이름 가지는 특수한 메소드 : 객체를 생성할때 사용하는 메소드
	//생성자를 생략하는
	//ReviewClass(){
	//	
	//}
//	ReviewClass(int d ,int e){ //생성자를 만들기 시작하면 기본생성자는 안만들어 준다.
//		a=d;
//		e=b;
//	}
	
	
    // 두개의 정수형 필드값을 곱해서 화면에 출력하는 메소드를 가지고 있어요 void printmul()
	void printmul() {
		System.out.println(a*b);
	}
	
}
