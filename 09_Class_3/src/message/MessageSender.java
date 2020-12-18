package message;
 
public abstract class MessageSender{ //추상클래스 -> 객체생성불가
	//메시지를 보내는 클래스
	//필드: 제목(title), 보낸사람(senderName);
	//기능: 메시지보내기
	String title;
	String senderName;
	
	MessageSender(String title, String senderName) { //생성자
		this.title=title;
		this.senderName=senderName;
	}
	
	abstract void sendMessage(String recipient);   
	//추상메소드 -추상클래스만 추상메소드를 포함할수 있다.
		

	
	
}
