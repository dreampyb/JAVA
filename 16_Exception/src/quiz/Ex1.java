package quiz;

public class Ex1 {
	String mal;
	Ex1(String mal) {
	    this.mal=mal;
	}

	void repeat(int a) {   // int a 다시 생각!!
		for(int i1=1; i1<10; i1++) {
		System.out.println(mal+(i1+1));
		}
	}
}
