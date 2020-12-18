package quiz2;

public class Test3 {

	public static void main(String[] args) {
		//1. 정수가 들어가는 intarray라는 이름의 100개의 개수를 갖는 배열을 만들자
		// 2. 각 배열에 1부터 시작해서 1씩 증가하는  값으로 초기화 해준다.
		// 3. 배열의 모든 값을 더해서 출력하자
		
		int[] intarray = new int[100];
		for(int i=0; i<100; i++) {
			intarray[i]=i+1;
		}
		int sum=0;
		for(int i=0; i<100; i++) {   // 반복은 위하여 for문 꼭 실행
			sum +=intarray[i];
		}
		System.out.println(sum);
	}
	
}
