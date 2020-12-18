package basic;

class Student { // 데이터값: 이름,나이,   공부한다,휴식한다 
   String name="기본";
   int age=14;
   
   void study() {
      System.out.println(name+"공부한다");
      }
   void rest( ) {
      System.out.println(name+"휴식한다");
      }
}