package basic;

public class Bbb {

	int a=1;
	int b=2;
	
	public static void main(String[] args) {
		
		Bbb bb = new Bbb();
		bb.a=3;
		System.out.println(bb.a);
		
		Ccc c1 = new Ccc();
		Ccc c2 = new Ccc();
		System.out.println(c1.sum(c2));
		Ddd d = new Ddd();

	}

}
