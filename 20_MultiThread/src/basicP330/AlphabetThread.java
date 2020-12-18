package basicP330;

public class AlphabetThread extends Thread {
//쓰레드를 구현하기 위해서는 Thread 클래스를 상속받아서 구현해야한다.
//또는 Runable 이라는 인터페이스를 구현해서도 만들수 있다.
	
	public void run() { //run() 메소드는 정해져 있음. 그리고 public으로

		for(char ch='A'; ch<='Z'; ch++) {
			System.out.print(ch + " ");
		}
	}
}