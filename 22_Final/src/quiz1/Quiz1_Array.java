package quiz1;

public class Quiz1_Array {

	public static void main(String[] args) {
// <목표: 배열복습 & for문 복습 & for-each구문 복습>
// 정수가 들어가는 intarray 라는 이름의 배열을 만들자
// 배열의 개수는, 10개이고 각각 9부터 시작하는 값으로 초기화한다
// -for문 이용(9,10,11,12.......18)
// 배열의 값을 모두 출력한다 - for each이용.
		int [] array1 = new int[10];
	
		for(int i=0; i<array1.length; i++) {  //	for(int i=0; i<=10; i++) {   와 같음
			 //  배열의 개수는 10개이므로 일단 for문을 이용하여 1~10까지 만들고
					array1[i]=i+9;                          // 9부터 시작하는 값이므로
				}
		for(int temp: array1)  {        // for each문
			// 정수값인 array1의 값을 하나씩 가져와서 계산을 하기 위한 문법
			System.out.println(temp);
		}
	}
}