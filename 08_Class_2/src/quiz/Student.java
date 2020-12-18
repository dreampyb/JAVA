package quiz;

public class Student {

   String name="";
   String grade="F입니다";
   int num;
   
   Student(String name, String grade, int num) {
         this.name=name;
          this.grade=grade;
          this.num=num;

   }

   Student(String name, int num) {
      this.name=name;
      this.num=num;
   }
   
}