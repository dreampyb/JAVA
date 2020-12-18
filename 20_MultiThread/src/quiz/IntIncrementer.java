package quiz;
public class IntIncrementer implements Runnable {
	private String name;
	private IntHolder holder;
	
	public IntIncrementer(String name, IntHolder holder) {
		this.name = name;
		this.holder = holder;
	}

	@Override
	public void run() {
		System.out.println("[" + name + "] started.");
		
		synchronized(holder) {  // lock 걸기
		for (int i=0; i<1000; ++i) {
			holder.increment();
		}
			System.out.print(holder.intNum + " ");
		}
		System.out.println("[" + name + "] finished.");
		
	}

}
