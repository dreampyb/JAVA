package quiz2;

public class Test2 {

	public static void main(String[] args) {
		//1.정수가 들어가는 intarray라는 이름의 987개수를 갖는 배열을 만들자
		// 2.각 배열에 2부터 시작하여 1씩 증가하는 값으로 초기화 해준다
		// 3.배열의 값중애 200번째부터는 (인텍스199) 300번째(인텍스299)까지 를 모두 더하여 출력한다.
		int[]intarray=new int [987];
		
		for(int i=0;  i<987;  i++) {
			intarray[i]=i+2;
		}
		int sum=0;
		for(int i=199; i<=299; i++) {   // for문의 개념 다시 정립
																// 199가 초기값, 299가 한계값
			sum+= intarray[i];
		}
		System.out.println(sum);
	}
}