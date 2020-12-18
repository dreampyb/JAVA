package quiz;

public class Ex4 extends Ex2 implements Ex3 {
		Ex4(int a,int b){
			super(a, b);
		}
		int primeCount(int num1, int num2) {		
			this.a=num1;
			this.b=num2;
			return primeCount();
			//Ex2 ex2 = new Ex2(num1,num2)
			//return ex2.primeCount();
		}
	@Override
	public void endPrint() {
		System.out.println("종료");
	}
}