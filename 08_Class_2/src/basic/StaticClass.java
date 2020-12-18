package basic;

public class StaticClass {

   int a=3;
   
   static void printstar(int num)  { // num은 변수로서 main의 print ()을 실행한다 num=100
      
      //a=4;
      for(int i=0; i<num; i++){ //100번 반복
         System.out.print("*");  //100일 찍자
      }

   }
    void printdollar(int num) {
      a=4;
      for(int i=0; i<num; i++) {
         System.out.print("$");
      }
   }
   
}
