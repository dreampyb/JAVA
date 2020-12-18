package bank;

public class CheckingAccount extends Account { // extends는 상속의 의미
   // 은행계좌 클래스
   // 데이터: AccountNo, ownerName, balance, +직불카드번호(cardNo)
   // 기능: debit, withdraw, + 직불카드사용액 지불(pay)
   
   String cardNo;
      
   CheckingAccount(String accountNo, String ownerName, int balance, String cardNo){
	   	// 오버라이딩으로 카드번호 추가
      super(accountNo,ownerName, balance);
      //슈퍼클래스의 기본생성자를 이용해서 super class 생성
      this.cardNo=cardNo;// super class에 없던 새로운 클래스 변수로 메소드 변수 선언.

   }

int pay(String cardNo, int amount) { //리턴값을 얻기 위해 int 타입을 씀.
      if(!cardNo.equals(this.cardNo) || balance<amount) { 
         //메서드 변수 cardNo가 클래스변수 cardNo와 같지않을경우나 
    	 // 잔액이 요구금액 총액보다 적을  경우 
         System.out.println("지불 불능.");
         return 0;  //
      }else {
         return withdraw(amount);
      }
   }
}