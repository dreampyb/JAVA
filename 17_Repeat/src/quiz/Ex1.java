package quiz;

public class Ex1 {
	String str;
	
	Ex1(String str){
		this.str=str;
	}
	void repeat(int a) {
		for(int i=0; i<a; ++i) {
			System.out.println(str + (i+1));
		}
	}
}
