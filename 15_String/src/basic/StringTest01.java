package basic;

public class StringTest01 {  // String 클래스 연습

	public static void main(String[] args) {
		char a = 'A'; // 아스키 코드표 참고 : 65의 뜻, 작은 따옴표 사용.
		String b = "두통엔 "; //객체
		String c = "게보린";
		System.out.println(a);
		
		System.out.println(b.toLowerCase()); // 모두 소문자로 바꾸기
		System.out.println(c.toUpperCase()); // 모두 대문자로 바꾸기
		
		String d=b+c;          //+를 이용한 문자결합
		System.out.println("+를 이용한 문자결합: "+ d );
		String e=b.concat(c);  // concat메서드이용하기
		System.out.println("concat메서드이용하기: "+ e );
		
		// 1. StringBuilder
		long start = System.currentTimeMillis();
		int LOOP_COUNT=100000;  //  10만번
		StringBuilder builder = new StringBuilder();
		for( int i=0; i<LOOP_COUNT; i++) {
			builder.append("a");
		}
		long end=System.currentTimeMillis();
		System.out.println("실행시간: "+(end-start)/1000.0);
		
		// 2. 연산자 이용
		String str="";
		for(int i=0; i<LOOP_COUNT; i++) {
			str="a";
		}
		end=System.currentTimeMillis();
		System.out.println("실행시간: "+(end-start)/1000.0);
		
		// 3. concat메소드 이용
		String str1="";
		for(int i=0; i<LOOP_COUNT; i++) {
			str1=str1.concat("a");
		}
		end=System.currentTimeMillis();
		System.out.println("실행시간: "+(end-start)/1000.0);
		
	}

}
