package quiz2;

public class Test1 {

	public static void main(String[] args) {
		// 정수가 들어가는 intarray라는 이름의 10개의 개수를 갖는 배열을 만들자
		// 각 배열에 3부터 시작하는 3의 배수값으로 초기화 해준다
		// 배열의 값을 모두 더하여 출력한다.
		int[] intarray = new int[1000];
		
		for(int i=0; i<1000; i++) {
			intarray[i]=(i+1)*3;
		}
			int sum=0 ;        //  sum안에 뭐가 있는지 모르니 0으로 초기화
										// cf.전역변수는 0으로 초기화
			for(int i=0; i<1000; i++) {
				sum+=intarray[i];
			}
// or 	sum=0;                      for each문 이용
//			for(int temp: intarray) {
//				sum += temp;
//			}
			System.out.println(sum);
		}
	}