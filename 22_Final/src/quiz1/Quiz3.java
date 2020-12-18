package quiz1;

public class Quiz3 {

	public static void main(String[] args) {
// 정수가 들어가는 bbb라는 이름의 배열을 만들자
// 배열의 개수는 10개이고 각각 10부터 1씩 줄어드는 초기화 한다 :for문
// 배열의 값을 모두 출력한다 : for each문
		int [] bbb = new int[10];
		for(int i=9;  i>=0;  i--) {   // i>=1이 아니고 0
			bbb[i]=10-i;                   // 10에 i를 뺀다!!!!! 10,10,10,10,10,10 생각하자!!!!
		}
		for(int temp: bbb) {
			System.out.println(temp);
		}
	}
}