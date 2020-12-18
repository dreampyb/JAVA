package quiz;

import java.util.Scanner;

public class Quiz1 {

   public static void main(String[] args) {
      // 밑변과 높이의 값을 받아서 삼각형의 넓이를 구하는 프로그램.
      // (밑변*높이)/2
      // 소수도 받을 수 있다.
      Scanner a = new Scanner(System.in);
      //a.nextDouble();
       double length;
      double height;
      double area;
      
      System.out.println("밑변 입력:");
      length=a.nextDouble();
      System.out.print("높이 입력:");
      height =a.nextDouble();
      
      System.out.println((length*height)/2);
      
   }

}