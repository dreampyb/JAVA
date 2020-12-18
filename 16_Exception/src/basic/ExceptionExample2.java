package basic;

public class ExceptionExample2 {

	public static void main(String[] args) {
		int[] b = {2,4,6,0};
		
		//발생예외 1.ArithmeticException
		//발생예외 2.ArrayIndexOutOfBoundsException
		int a=0;
		for(int i=0; i<10; i++) {
		
			try {	
				a = 100 /b[i];
			}catch(Exception e) {
				System.out.println("예외발생");
				e.printStackTrace();
				
			}
			/*
		try {
			for(int i=0; i<10; i++) {
				int a=100 / b[i];
				System.out.println(a);
			}
		}catch(ArithmeticException e){
			System.out.println("예외발생 0으로 나누려고 한거 같은데");
		}catch(IndexOutOfBoundsException e) {
			System.out.println("예외발생 배열 범위를 벗어난거 같은데");
		} 
			 */
			
				
			System.out.println(a);
		}//for


	}

}
