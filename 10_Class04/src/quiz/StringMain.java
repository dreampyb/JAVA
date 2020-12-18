package quiz;

public class StringMain {

	public static void main(String[] args) {
		StrClass obj = new StrClass();
		StrClass obj1 = new StrClass("안녕하세요");
		
		String str1 = obj.str;
		String str2 = obj1.str;
		
		System.out.println(str1);  //기본값입니다.
		System.out.println(str2);  //안녕하세요
		
		str1=obj.str();
		str2=obj1.str();
		System.out.println(str1);  //기본값입니다.
		System.out.println(str2);  //안녕하세요

	}

}
