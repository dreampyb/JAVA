package basic;

public class Ex3 {
	int a,b;
	
	public Ex3(int a, int b){
		this.a=b;
		this.b=b;
	}
	
	public int div() throws Exception {
		if(b==0) {
			throw new Exception("0으로 나눌려고 하네");
		}
		return a/b;
	}
	
}
