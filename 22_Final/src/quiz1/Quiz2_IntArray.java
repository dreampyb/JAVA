package quiz1;

public class Quiz2_IntArray {

	public static void main(String[] args) {
// aaa라는 이름을 가지는 정수배열을 선언합니다. 배열의 개수는 20개입니다.
// 모든 배열의 원소값은 모두 20을 나타냅니다. 단, for문을 이용해서 작성
		//배열중 10번째 배열부터 20번째 배열까지 출력하시오.
		int[]aaa=new int[20];
		
		for(int i=0; i<aaa.length; i++) {
			aaa[i]=20;                                  // 모든 값이 20이 나와야 하므로 20을 넣는다.
		}
		for(int j=9; j<20; j++) {   // 0부터 시작하므로 20은 범위에 들어가지 못하므로
			System.out.println(aaa[j]);   // ()안의 값은 배열로 
		}
	}
}