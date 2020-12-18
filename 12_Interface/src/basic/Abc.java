package basic;

public class Abc {
	int a,b;
	static int count=0;
	Abc(int a, int b){
		this.a=a;
		this.b=b;
		++count;
		System.out.println(count+"객체가 생성되었습니다.");
	}
	
	int rem() {
		
		return a%b;
	}
	
	static int sum(int a, int b) {

		return a+b;		
	}
}
