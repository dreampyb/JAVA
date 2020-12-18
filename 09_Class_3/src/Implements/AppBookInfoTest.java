package Implements;

public class AppBookInfoTest {

	public static void main(String[] args) {
		AppBookInfo app1 =new AppBookInfo();
		AppCDInfo app2 = new AppCDInfo();
		
		Lendable app3 = new AppBookInfo();
		Lendable app4 = new AppCDInfo();
		
		app1.checkIn();
		app2.checkIn();
		app3.checkIn();
		app4.checkIn();
	}

}
