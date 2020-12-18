package ArrayCircle;

public class Array0 {

	public static void main(String[] args) {
		//배열(array)
		int[] array = new int[10];
		int[] array2 = {1,2,3,4,5,6,7,8,9,10};
		
		for(int index=0; index<array2.length; index++) {
			array2[index]= index*2;
		}
		
		for(int index=0; index<array2.length; index++) {
			System.out.println(array2[index]);
		}
		//for-each
		for(int temp : array2 ) {
			System.out.println(temp);
		}
		
		
		
	}

}
