package basic;
public class Test1 implements InterTest1 {
	@Override
	public int sum(int num1, int num2) { //짝수를 다 더해서 리턴
		int sum=0;
		for(int i=num1; i<=num2; i++) {
			if(i%2==0) {
			sum+=i;}
		}
		return sum;
	}
}