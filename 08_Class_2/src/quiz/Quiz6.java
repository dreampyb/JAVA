package quiz;

public class Quiz6 {

   public static void main(String[] args) {
      IoTMath.sum(1,100);    // 1~100 다 더한 값 출력
      IoTMath.sum(5,20);      // 5~20

      int a= IoTMath.abs(-4);    // if else 를 이용하여 구동.
      int b=IoTMath.abs(4);
      System.out.println(a);    // 4
      System.out.println(b);    // 4
      
      // System.out.println(IoTMath.abs(-4));
      // System.out.println(IoTMath.abs(4));
      
      //System.out.println(IoTMath.primeCount(1,100));
      //1.입력한 첫번째 수에서 부터 마지막 수까지의 소수의 개수를 리턴해주는 메소드  (1은 소수가 아니다.)
      //테스트> 1,100 =>소수개수 25   /  9,12345 => 소수개수  1470
      
      //2.복습
   }

}
