package basic;

public class Product {
	
	
	int code;	//상품코드
	int amount;    //재고수량      
	
	Product(int a, int b){     //생성자- 객체를 생성할때 사용하는 메소드
		code=a;
		amount=b;
		System.out.println("제품 객체 생성");
	}
	
	Product(int a){
		code=a;
		System.out.println("하나의 값만 설정하는 생성자");
	}

	Product(){	//기본생성자 - 생성자를 하나도 만들지 않으면 자동으로 내부적으로 만들어지는 생성자
		
	}
	
	//재고수량 원하는 만큼 증가
	void addPro(int a) {
		amount += a; //amount = amount +a
	}
	
	//재고수량 원하는 만큼 감소
	void subPro(int a) {
		amount =-a;
	}
	
	void subPro(int a, int b) {
		amount =-a;
	}
}
