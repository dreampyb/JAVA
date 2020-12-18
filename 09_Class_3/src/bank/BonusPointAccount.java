package bank;

public class BonusPointAccount extends Account{
      // 입금액 1/1000만큼 추가로 입금해주는 계좌
      // 단, 1/1000 계산시 소수이하단위는 내림 1.93 -> 1 1.0->1
   BonusPointAccount(String accountNo, String ownerName, int balance) {
      super(accountNo, ownerName, balance);
   }
      
      void deposit(int amount) { // 행위
                                 //balance+=amount+(int)(amount*0.001);
    	  super.deposit(amount+(int)(amount*0.001));
      }


   
   
}