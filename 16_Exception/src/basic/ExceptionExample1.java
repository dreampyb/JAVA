package basic;

public class ExceptionExample1 {

	public static void main(String[] args) {
		int a=2, b=0;
		//try catch
		try {
			int c=a/b;
			System.out.println(c);
		}catch(ArithmeticException e){
			e.printStackTrace();
			System.out.println("오류발생");
		}finally {
			System.out.println("끝");
		}
		
		

	}

}
