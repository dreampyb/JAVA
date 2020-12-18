package message;

public class SMSSender extends MessageSender {
	// 필드: +폰번호, 메시지
	String returnPhoneNo;
	String message;
	
	SMSSender(String title, String senderName, String returnString, String message){
		super(title, senderName);
		this.returnPhoneNo=returnString;
		this.message=message;
	}
	
	@Override //어노테이션(annotation) @붙은거 /소스코드안의 요소(클래스,메소드)에 대한 정보
	          // (메타 데이터)를 설명하는 메카니즘
	void sendMessage(String recipient) {
		System.out.println("-----------------------");
		System.out.println("제목:"+title);
		System.out.println("보내는 사람" + senderName + " " + returnPhoneNo);
		System.out.println("받는사람:" + recipient );
		System.out.println("내용" + message);

	}

}
