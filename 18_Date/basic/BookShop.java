package basic;

public class BookShop {
	private String bname;
	private String author;
	private int price;
	
	public void setBook(String bname,  String author, int price) {
		this.bname=bname;
		this.author=author;
		this.price=price;
	}
	
	void viewBook() {
		System.out.println("책이름 : " +bname);
		System.out.println("저  자 : " +author);
		System.out.println("가  격 : " +price+"원");
	}

	public String getBname() {
		System.out.println("책이름 : " +bname);
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getAuthor() {
		System.out.println("저  자 : " +author);
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		System.out.println("가  격 : " +price+"원");
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
