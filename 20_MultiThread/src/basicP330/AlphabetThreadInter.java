package basicP330;

public class AlphabetThreadInter implements Runnable {

	@Override
	public void run() {
		for(char ch='a'; ch<='z'; ch++) {
			System.out.print(ch + " ");
		}
	}
}