package quiz;

public class Quiz4Main {
	
	public static void main(String[] args) {
		Quiz4 quiz4 =new Quiz4();
		
		quiz4.printstar(9);  // 출력결과 : **********
		int max=quiz4.big(1,2,3); // 3개의 숫자중 가장 큰 값을 출력
		System.out.println("가장큰값"+max);
	}
}
