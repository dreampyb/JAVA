package basic;

public class Test2 implements InterTest1 {

	@Override
	public int sum(int num1, int num2) {
		int sum=2;
		for(int i=num1; num1<=num2; i++ )
			sum+=i;
		return sum;
	}

}
