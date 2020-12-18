package quiz;

public class Ex2 {

    int a,b;
	void set(int a, int b) {
		this.a=a;
		this.b=b;
	}

	 int sum () {
		int c;
		c=a+b;
		return  c;
	}

	static int sum(int a, int b) {
		int sum=0;
		for(int i=a; i<=b; i++) {
			sum+=i;
		}
		return sum;
	}
}
