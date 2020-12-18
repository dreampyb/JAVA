package ArrayCircle;

public class Array2 {

	public static void main(String[] args) {
		//Circle type 이 10개 들어가는 array 라는 이름의 배열 만든다. 
		Circle[] array = new Circle[10];
		
		for(int i=0; i<array.length; i++) {
			array[i] = new Circle(i+10);
		}
		
		for(Circle a :array) {
			System.out.println(a.r);
		}
		
//		int[] array2 = new int[10];
//		for(int i=0; i<array2.length; i++) {
//			array2[i] = i+1;
//		}
//		for(int temp :array2) {
//			System.out.println(temp);
//		}
		
		
	}

}
