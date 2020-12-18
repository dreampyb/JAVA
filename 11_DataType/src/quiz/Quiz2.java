package quiz;

import java.util.Scanner;

public class Quiz2 {
   public static void main(String[] args) {
      // 사용자로 무한 으로 입력받습니다.
      //숫자를 입력받으면 해당숫자 곱하기 100을 출력하고 
      // '그만'을 입력받으면 종료됩니다.
      // 출력 예> 입력: 3
      //              300
      //              입력: 27
      //              2700
      //              입력:그만
      //              끝
     Scanner scan = new Scanner(System.in);
     boolean flag=true;
     do{
         System.out.print("입력");
         String input=scan.next();
         if(input.equals("그만")){
            System.out.println("끝");
            flag=false;
         }else{
            System.out.println(Integer.parseInt(input)*100);
         }
     }while(flag);
         
         /*1. 사용자로부터 입력받는다.
          * 2. 입력받은 글자가 그만이면 종료한다.
          * 3.만일 입력받은 글자가 그만이 아니라면 숫자임으로 숫자로 변환
          * 4. 변환된 숫자에 100을 곱해 출력한다.
          * 5. 다시 1로 돌아간다.
          */
   }

}






