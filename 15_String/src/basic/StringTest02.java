package basic;

public class StringTest02 {

	public static void main(String[] args) {
		String str = "This is a pen";
		String[] words = str.split("\\ ");
		
		System.out.println("안녕\\ 하세요");
		
		for(String a:words) {
			System.out.println(a);
		}
		String str1=" AB C";
		String str2="DEF";
		System.out.println(str1+str2);
		System.out.println((str1.trim()+str2));
		System.out.println(str.indexOf('i'));
		// trim은 앞뒤공간을 전부 없애는 기능
	}

}
