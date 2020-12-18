package quiz;

public class Array1 {

	public static void main(String[] args) {
		// 1.9개의 크기의 배열을 만든후 
		// 2.for문을 이용해서 9단의 결과값을 넣어준다
		// 3.배열의 내용을 모두 출력한다. (for문을 이용해 출력)
		int[] abc = new int[9];
		
		for(int i=0; i<9; ++i) {
			abc[i]= 9* (i+1);
		}
		for(int i=0; i<9; ++i) {
			System.out.println(abc[i]);
		}
		
		//배열의 값을 모두 더한다. 
		int sum=0;
		for(int i=0; i<9; ++i) {
			sum =  sum + abc[i];
		}
	}

}
