package ArrayCircle;

public class StringTest {

	public static void main(String[] args) {
		String s1 = new String("가");
		String s2 = new String("가");
		String s3 = s2;
		System.out.println(s1);
		System.out.println(s2);
		String str1 ="가";
		String str2 ="가";
		if(str1==str2) {
			System.out.println("이렇게 비교하면");
		}
		if(s1==str1) {
			System.out.println("이건?");
		}
		
		if(s1.equals(s2)) {
			System.out.println("문자 똑같네!");
		}
		if(s2==s3) {
			System.out.println("이건 똑같네");
		}
		if(s1.equals("가")) {
			System.out.println("문자 비교");
		}
		
		
		int b=1;
		int d=1;
		if(b==d) {
			System.out.println("똑같네!");
		}

	}

}
