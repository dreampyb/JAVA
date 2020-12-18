package basic;

public class ProductTest {
	public static void main(String[] args) {
		Product pro1 = new Product(5,6);
		Product pro2 = new Product(200,45);
		Product pro3 = new Product(25,6);
		Product pro4 = new Product(4);
		Product pro5 = new Product();
		
		pro1.code=11;
		pro2.code=22;
		pro3.code=33;
		
		pro2.addPro(500); 	//pro2 객체의 재고량 500증가
		pro1.addPro(100);   //pro1 객체의 재고량 100증가
		pro2.addPro(200);   //pro2 객체의 재고량 200증가
		
		System.out.println(pro2.amount); //pro2객체의 현재수량
	}
}
