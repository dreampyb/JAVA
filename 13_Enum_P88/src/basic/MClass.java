package basic;

public class MClass {
	private int a,b;  // private은 필드, 생성자,메소드에 다 쓸 수 있다. Class는 안됨.
	
	void print() {
		System.out.println(sum());
	}
	
	private int sum() { // 자체 클래스에서만 적용
		return a+b;}
	}
