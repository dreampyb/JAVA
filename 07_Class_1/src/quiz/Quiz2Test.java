package quiz;

public class Quiz2Test {

   public static void main(String[] args) {
      // 1.일남이 계좌개설 계좌번호: 101010, 500000 입금  -> 객체생성, 초기화
      // 1.일순이 계좌개설 계좌번호: 101011, 1000000 입금  -> 객체생성, 초기화
      
      Quiz2 baby1 = new Quiz2();
      Quiz2 baby2 = new Quiz2();
      
      baby1.고객이름="일남이";
      baby1.고객계좌번호=101010;
      baby1.계좌잔액=500000;
      baby2.고객이름="일순이";
      baby2.고객계좌번호=101011;
      baby2.계좌잔액=1000000;
      
      // 3. 일순이가 50만원을 출금해서 
      // 4. 일남이한테 입금했어요 (일남이가 입금)
      // 5. 일남이가 백만원 인출
      
   
      baby1.입금(baby2.출금(500000));
      baby1.출금(1000000);
      
      

   }

}