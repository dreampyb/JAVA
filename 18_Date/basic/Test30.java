package basic;

public class Test30 {

	public static void main(String[] args) {
		BookShop ob = new BookShop();
		
		ob.setBook("자바완성","황완성",25000);
		ob.viewBook(); //출력
		
		ob.setBname("JSP잡기");
		ob.setAuthor("송JP");
		ob.setPrice(3500);
		System.out.println();
		ob.getBname();
		ob.getAuthor();
		ob.getPrice();

	}

}
