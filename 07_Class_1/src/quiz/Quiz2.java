package quiz;

public class Quiz2 {
   //데이타(필드or멤버변수): 고객이름(String), 고객계좌번호(int), 계좌잔액(int)
   
   //행위: 메소드
   //입금(입금금액과 계좌잔액 업데이트, 현재계좌잔액 출력)
   //출금(출금금액과 계좌잔액 업데이트, 현재계좌잔액 출력)
   
   String 고객이름;
   int 고객계좌번호;
   int 계좌잔액;
   
   int 입금(int 돈) {
      System.out.println(고객이름+" 입금금액 : "+돈);
      계좌잔액= 계좌잔액+돈;
      System.out.println(고객이름+" 현재계좌잔액 : " +(계좌잔액));
      return 돈;
   }
   int 출금(int 돈) {
      System.out.println(고객이름+" 출금금액 : "+돈);
      계좌잔액= 계좌잔액-돈;
      System.out.println(고객이름+" 현재계좌잔액 : " +(계좌잔액));   
      return 돈;
   }
   
}