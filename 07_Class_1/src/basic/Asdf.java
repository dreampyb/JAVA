package basic;

public class Asdf {

   public static void main(String[] args) {
      Calc abc = new Calc();
      Calc bbb = new Calc();
      Calc calc = new Calc();
      Calc test;   // 이건 객체 선언 .
      test= new Calc();
      test = abc;
      
      abc.num1=10;
      abc.num2=20;
      
      bbb.num1=1;
      bbb.num2=2;
      
      calc.num1=3;
      calc.num2=4;
      
      test.num1=1;
      test.num2=2;
      System.out.println(abc.add());
      System.out.println(bbb.add());
      System.out.println(calc.add());
   }
}