package bank;

public class BankTest {

	public static void main(String[] args) {
		//-----------초기화----------
		//직불계좌를 만들자
		//계좌번호:027-19-48567
		//예금주이름:John,Park
		// 체크카드번호 :4444-666666-55555
		// 입금금액: 1,000,000 (백만원)
		Account money= new Account("027-19-48567","Johnpark",1000000);
		CheckingAccount card = new CheckingAccount("027-19-48567",
							"JohnPark",1000000,"4444-666666-55555");
							 // CheckingAccount 10행 클래스변수 순에 따라 
		// < 행위 >
		// 47,000 직불카드로 지불했습니다.  
		// 출력_지불액:   47000
		// 출력_계좌잔액: 953000
		System.out.println("Withdraw: "+card.pay("4444-666666-55555",47000));
			// 출력 : CheckingAccount 18행을 따라 진행.
		System.out.println("Balance: " + money.balance);			
		/////////////////////////////////////////////////////////////
		
		//마이너스계좌를 만들자
		//계좌번호:970-15-19720308
		//예금주이름 JohnPark
		//마이너스한도: 1,000,,000
		//입금금액: 100,000 
		//출금:1,100,000 
		//객체이름 minus
		CreditLineAccount minus = new CreditLineAccount("970-15-19720308", 
					                  "JohnPark", 1000, 10000);
		System.out.println("Withdraw: " +minus.withdraw(11000));
		System.out.println("Balance: " +minus.balance);
		////////////////////////////////////////////////////////////////////
		
		//보너스계좌를 만들자
		//계좌번호:3111-22-3333
		//예금주이름:YB_Park
		//입금금액: 5,000,000 
		//객체이름 bonus
		BonusPointAccount bonus = new BonusPointAccount("3111-22-3333", 
				                     "YB_Park", 5000000);
				  
		System.out.println("입금전 잔액: "+bonus.balance);
		bonus.deposit(100000);
		System.out.println("입금후 잔액: "+bonus.balance);	      
			}
		}