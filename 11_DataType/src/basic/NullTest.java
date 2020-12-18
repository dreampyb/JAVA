package basic;

public class NullTest {

   public static void main(String[] args) {
      // String이라는 클래스를 만들어 주세요
      //이 클래스는 문자열 변수 3개를 가지고 있으며, 필드 a,b,c
      //각 각 안녕, 바이, 끝 이라는 초기값을 가지고 있다.
      String1 str =new String1();
      System.out.println(str.a + str.b + str.c);
      
      String str1="안녕";
      str1=null;
      
      if(str.a!=null)
         System.out.println(str.a.length());
      if(str.b!=null)
         System.out.println(str.b.length());
      if(str.c!=null)
         System.out.println(str.c.length());
      // str.a가 안녕인지 확인해서 안녕이면 나도 안녕.
      //아니면 너만 안녕 출력.
      if(str.a.equals("안녕"))    //주의!!!  if(str.a == "안녕") 아님!!!
    	  System.out.println("나도안녕");
      else 
    	  System.out.println("너만안녕");
      
   }

}