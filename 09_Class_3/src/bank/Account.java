package bank;

public class Account {  
// 은행계좌 클래스
// 데이터: AccountNo, ownerName, balance
// 기능: debit, withdraw
	//final class 클래스는 상속금지,
	//abstract class(추상 클래스) 인스턴스화 금지, 즉 객체생성불가
	
   String accountNo;  // 선언과 초기화
   String ownerName;  // 선언과 초기화
   int balance;		  // 선언과 초기화
   
   Account(){ }
   
   Account(String accountNo, String ownerName, int balance){
      this.accountNo=accountNo;
      this.ownerName=ownerName;
      this.balance=balance;
   }
  
   void deposit(int amount) { 
        balance+=amount;
   }
   int withdraw(int amount) { //final method는 재정의(overriding)금지
      if(balance<amount) {
         System.out.println("잔액이 부족합니다");
         return 0;
      }else {
         balance -=amount;
         return amount;
      }
   }
}