package Implements;

public interface Lendable {
   //필드값을 가질수 없다. 단, 상수는 가질수 있다.
	final static int i=35;
	
   //추상메소드만 갖는다.(그렇기 때문에 abstract 는 생략가능)
   void checkout(String aborrower, String date);
   void checkIn();
}
