package basicP330;

public class SingleThread {

	public static void main(String[] args) {
		for( int i=1;  i<=50;  i++)  {
			System.out.print(i+"  ");
		}
		
		for(char ch='A'; ch<='Z'; ch++) {
			System.out.print(ch+"  ");
		}
	}
}