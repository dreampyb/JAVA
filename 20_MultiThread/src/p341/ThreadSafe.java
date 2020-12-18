package p341;

public class ThreadSafe {

	public static void main(String[] args) {
		IntHolder holder = new IntHolder();
		Thread th1 = new Thread(new IntIncrementer("thread-1", holder));
		Thread th2 = new Thread(new IntIncrementer("thread-2", holder));
		
		th1.start(); //  start는 Thread로 구현된 문의 run을 병렬로 수행시키는 method
		th2.start();
		
		try {
			th1.join();   // Thread가 끝날 때까지 기다린다.
			th2.join();
			int result = holder.getResult();
			
			System.out.println("result : "+result);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}