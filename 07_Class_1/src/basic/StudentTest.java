package basic;



	public class StudentTest {

		   public static void main(String[] args) {       // main Method
		      Student student1  = new Student();       // Student는 class, ()는 method
		      student1.name="철수";                            // student1은 객체
		      student1.age=15;
		      
		      Student student2 = new Student();
		      // student2.name="상희";
		      // student2.age=14;
		      
		      System.out.println(student1.name);
		      System.out.println(student1.age);
		      System.out.println(student2.name);
		      System.out.println(student2.age);
		      student1.study();
		      student1.rest();
		      
		      

		   }
	}
