package quiz1;

public class Quzi4 {

	public static void main(String[] args) {
		// 정수가 들어가는 bbb라는 이름의 배열을 만들자(배열의 개수는 10개)
		// 배열의 짝수번째 값은 0으로 홀수번째의 값은 1로 초기화한다
		// 배열의 값을 모두 출력한다 : for each문
		int [] bbb = new int[10];
		
		//1번째 방법
		for(int i=0; i<10;  i+=2) {
			bbb[i]=1;        
		}
		for(int i=1;  i<10;  i+=2) {
				bbb[i]=0; 
		} //  초기화되지 않은 값은 0으로 나오므로 2번째 구문은 안써도 값은 나온다
		  //  단, 1과 0을 
		
		//2번째 방법
		for(int i=0; i<10;  i+=2) {
			if(i%2==0)
				bbb[i]=1;
			else
				bbb[i]=0;
		}
		
		//3번째 방법
		for(int i=0; i<10;  i++) {
			bbb[i]=(i+1)%2;    // 1,0,1,0......
//			bbb[i]=(i%2)+1;    // 1,2,1,2,1,2.........
		}
		
		for(int temp: bbb) {
			System.out.println(temp);
		}
	}
}