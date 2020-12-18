package basic;

public class ExceptionEx1 {

	public static void main(String[] args) {
		int a=3;
		try {
		if(a < 5) {
			throw new Exception("예외발생");// 
			}
		}catch(Exception e) {
			System.out.println("에러잡음");
		}
	}

}
