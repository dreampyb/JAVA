package review;

public class Car {
   // 필드로 (멤버변수) 세개의 정수 변수를 갖습니다.
   // 메서드는 모두 더해서 출력하는 기능을 가집니다. void pSeed
   // 세걔의 정수변수는 각각 초기값으로 2,4,6을 갖습니다.
   // 메서드 변경사항 -출력도 하면서 닫았추가로 더한 값을 리턴에 주는 메소드로 변경
   // 메서드 실행시(추가속도)를 넣어줘서 속도 추가 pSpeed(40)
   // method 추가 void stop() 이 메소드의 기능은 필드변수 전체를 0으로 변경합니다.
   
   int a=2, b=4, c=6;
   
   Car() {
	 
   }
   Car(int d){ //오버로딩  overloading
   }
   
   int pSpeed(int d ) {
      int num=a+b+c+d;
      
      System.out.println(num);
      return num;
   
   }
    
   void stop() { 
	   a=0;
	   b=0;
       c=0;
       
   }
 }
