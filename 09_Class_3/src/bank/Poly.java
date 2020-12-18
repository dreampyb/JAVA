package bank;

public class Poly {

	public static void main(String[] args) {
		// Account bonus, card, obj3;
		
		BonusPointAccount bonus = new BonusPointAccount("11","aa",10);// 다형성 
		CheckingAccount card = new CheckingAccount("22","bb",500,"ABC");
		CreditLineAccount minus = new CreditLineAccount("33", "cc",300,900);
		
		printAccount(bonus);
		printAccount(card);
		printAccount(minus);
	}
	//다형성을 활용하면 여러종류의 격체들을 똑같은 로직을 이용하여 처리할 수 있다,
	static void printAccount(BonusPointAccount bonus) {
		System.out.println("계좌번호:"+bonus.accountNo);
		System.out.println("소유자"+bonus.ownerName);
		System.out.println("잔액:"+bonus.balance);
		
	}
	static void printAccount(CheckingAccount card) {
		System.out.println("계좌번호:"+card.accountNo);
		System.out.println("소유자"+card.ownerName);
		System.out.println("잔액:"+card.balance);
	}
	static void printAccount(CreditLineAccount minus) {
		System.out.println("계좌번호:"+minus.accountNo);
		System.out.println("소유자"+minus.ownerName);
		System.out.println("잔액:"+minus.balance);
	}


}
