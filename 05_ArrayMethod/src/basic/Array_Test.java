package basic;

public class Array_Test {

	public static void main(String[] args) {
		int[] array = new int[10];
		
		array[0]=1;
		array[1]=2;
		array[2]=3;
		array[3]=4;
		int a=1;
		
		for(int i=0; i<4; ++i) {
			array[i]=a;
			++a;
		}
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		
		for(int i=0; i<4; ++i) {
			System.out.println(array[i]);
		}

	}

}
