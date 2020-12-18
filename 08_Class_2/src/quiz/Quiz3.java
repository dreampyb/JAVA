package quiz;

public class Quiz3 {

	public static void main(String[] args) {             //String      String       int
		//생성자 공부!
		Student student1 = new Student("양현일","A",1);   //이름(name), 성적(grade), 번호(num)
		Student student2 = new Student("양현이","B",2); 
		Student student3 = new Student("양현삼",3);
		
		
		System.out.println(student3.grade); //출력: F
	}

}
