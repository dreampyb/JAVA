package quiz;

public class ThreadSafe {

	public static void main(String[] args) {
		IntHolder holder = new IntHolder();	// 하나의 IntHolder 인스턴스
		// 두 개의 IntIncrementer 인스턴스; 각각 100만번씩 증가 처리 -> 결과: 200만번?
		Thread th1 = new Thread( new IntIncrementer("스레드-1", holder)) ;	
		Thread th2 = new Thread( new IntIncrementer("스레드-2", holder)) ;

		th1.run();
		th2.run();
		
		try {
			th1.join();
			th2.join();
			int result = holder.getResult();
			
			System.out.println("Result: " + result);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
	}
}