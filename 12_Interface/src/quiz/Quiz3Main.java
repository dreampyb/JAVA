package quiz;

public class Quiz3Main {

	public static void main(String[] args) {
		Quiz3 quiz3 = new Quiz3();
		int sum = quiz3.sum(2,10);  // n~m까지 다더하기
		System.out.println(sum);     // 다더한 수 54

		Quiz4 quiz4 = new Quiz4(quiz3,2,10); // ()안에 값이 있으므로 Class의 생성자 만듬.
		sum = quiz4.num;       // num은 class 변수임.
		System.out.println(sum);   //54
		
		int sum1=quiz3.sum(9,10);
		quiz4.test(sum1);
		
		// quiz4.test(quiz4.sum(9,10));
	}

}
