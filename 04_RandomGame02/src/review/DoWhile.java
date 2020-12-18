package review;

public class DoWhile {

	public static void main(String[] args) {
		//do while 만을 이용해서 구구단을 작성하시오.
		int i=2;
		do {
			int j=2;
			do {
				System.out.println(i+" * "+j+" = "+(i*j));
				j++;
			}while(j<10);
			i++;
		}while(i<10);

	}

}
