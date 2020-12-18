package bank;

public class CreditLineAccount extends Account { 
	int creditLine; // creditLine이란, 마이너스 한도
	
	CreditLineAccount(String accountNo,String ownerName,int balance,int creditLine) 
	{// 마이너스 계좌의 필드명은   계좌번호,   계좌명,            계좌잔액,     마이너스 한도 
		super(accountNo,ownerName,balance); // 부모클래스의 필드 상속
		this.creditLine=creditLine; // 이 클래스의 
	}
	
	// method overriding 재정의     
	// cf> overloading
	int withdraw(int amount) {
		if(balance+creditLine<amount) {
			System.out.println("잔액이 부족합니다");
		    return 0;
		 }else {
		    balance -=amount;
		    return amount;
		 }
	}
}
