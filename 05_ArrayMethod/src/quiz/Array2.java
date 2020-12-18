package quiz;

public class Array2 {

	public static void main(String[] args) {
		// 1. 정수가 들어가는 500개의 배열을 만든다.
		// 2. 그배열에 2부터 짝수의 값을 연속으로 넣어준다. 0->2 / 1->4 
		// 3. 그배열의 값을 다 더해서 출력한다.

		int[] array = new int[500];
		for(int i=1; i<=500; ++i) {
			array[i-1]=2*(i);
		}
		int sum=0;
		for(int i=0; i<500; ++i) {
			sum = sum + array[i];
		}
		System.out.println(sum);
		
	}

}
