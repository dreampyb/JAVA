package quiz;

public class QuizMain {

	public static void main(String[] args) {
		
		Quiz quiz = new Quiz(1,3);
		
		
		System.out.println(quiz.max());  //출력:3 (둘중의 큰수를 나오게 하라)

	}

}
