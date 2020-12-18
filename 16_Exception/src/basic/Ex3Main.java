package basic;

public class Ex3Main {

	public static void main(String[] args)   {
		Ex3 obj = new Ex3(4,0);
		
		int a=0;
			
		try {
			a = obj.div();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(a);

	}

}
