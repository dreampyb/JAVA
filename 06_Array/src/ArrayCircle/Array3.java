package ArrayCircle;

import java.util.Random;

public class Array3 {

   public static void main(String[] args) {
      // 11~20까지의 값이 연속으로 들어있는 arr이라는 배열을 만들어 봅시다.
      // 1~100사이의 무작위값이 들어있는 50개의 개수를 가지는 arr이라는 배열을 만들어 보자
      
//      int[ ] arr = new int[10];       
//      for(int i=0; i<arr.length; i++ ) {
//         arr[i]=(i+11);
//      }
      
      int[ ] arr = new int[50];       
      
      Random ran =new Random();
      
         for(int i=0; i<50; i++){
           
            arr[i]=ran.nextInt(100)+1;
         }
         
//      for(int i=0; i<arr.length; i++ ) {
//         arr[i]=(int)(Math.random()*100)+1;   //그게 실행되었을 때 1~100사의의 값이 리턴되면
//      }
      
      
//      for(int temp:arr) {
//         System.out.println(temp);
//      }
   }
   
}