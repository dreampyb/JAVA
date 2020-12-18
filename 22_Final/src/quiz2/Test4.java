package quiz2;

public class Test4 {

	public static void main(String[] args) {
		// 1. 정수가 들어가는 intarray라는 이름의 119개의 개수를 갖는 배열을 만들자
		// 2. 각 배열에는 1,2,3을 반복해 넣어준다(ex.1,2,3,1,2,3....)
		// 3. 배열의 값중 짝수번째(즉 인덱스로 홀수)값을 모두 더해서 출력한다
		
		int[] intarray = new int[119];
		
		for(int i=0; i<intarray.length; i+=3){  // 배열의 index가 1번째부터 마지막 수까지
				intarray[i]=1  ;
		}
		for(int i=1; i<intarray.length; i+=3){// 배열의 index가 1번째부터 마지막 수까지
				intarray[i]=2;
		}
		for(int i=2; i<intarray.length; i+=3){// 배열의 index가 1번째부터 마지막 수까지
				intarray[i]=3;
		}
		int sum=0;
		for(int i=0; i<intarray.length; i++){
			if(i%2==1) {
				sum +=intarray[i];
			}
		}
		   System.out.println(sum);
	  }
}