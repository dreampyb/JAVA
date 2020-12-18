package message;

public class EmailSender extends MessageSender {
	//email 클래스
	//필드: + 보내는 메일주소, 이메일내용
		
	String senderAddr;
	String emailBody;
	
	EmailSender(String title, String senderName, String senderAddr, String emailBody) {
		super(emailBody, senderAddr);
		this.senderAddr=senderAddr;
		this.emailBody=emailBody;
	}
	
	@Override
	void sendMessage(String recipient) {
		System.out.println("-----------------------");
		System.out.println("제목:"+title);
		System.out.println("보내는 사람" + senderName + " " + senderAddr);
		System.out.println("받는사람:" + recipient );
		System.out.println("내용" + emailBody);
	}

}
