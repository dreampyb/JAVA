package ArrayCircle;

public class Array1 {

   public static void main(String[] args) {
      int[] a= new int[20]; // int[]은 배열의 뜻,배열의 이름은 a, 갯수는 10
                                      //  a란 이름을 가지는 10개의 배열을 만들기.
      int[] b = {1,2,3,4};    //배열의 초기화+만들기 형태
      // int[]c =new int[] {1,2,3,4] - 표현 중복되어 이렇게는 안씀.
      
      for(int index=0; index<a.length; index++) {
         a[index] = (index+1);
      }
      for(int index=0; index<a.length; index++) {
           System.out.println(a[index]);
           
      }
      
       // 향상된 for문 => for-each문
      for(int value : a) {  // each문의 문법 => 외워라!
         System.out.println(value);
      }

      
      
      
   }

}