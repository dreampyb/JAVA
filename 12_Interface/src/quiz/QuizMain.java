package quiz;

public class QuizMain {

	public static void main(String[] args) {
		Quiz1 quiz1 = new Quiz1(1);
		int num = quiz1.num;      // num() 이거나 num
		System.out.println(num); //10(즉, 초기값의 10배)
		
		Quiz2 quiz2 = new Quiz2();
		int num1 = quiz2.add(quiz1);  //객체의 num의 또10 더하기
		System.out.println(num1);      // 100
	}

}
