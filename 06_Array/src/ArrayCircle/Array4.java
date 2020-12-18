package ArrayCircle;

public class Array4 {

	public static void main(String[] args) {
		// 문자열이 들이 들어있는 배열 크기3
		// arr[0] 출력결과 -> 안녕하세요
		// arr[1] 출력격과 -> 반갑습니다.
		// arr[2] 출력결과 -> 안녕히계세요

		String[] arr = new String[3];
		arr[0]="안녕하세요";
		arr[1]="반갑습니다.";
		arr[2]="안녕히계세요";
		
		//String[] arr = {"안녕하세요", "반갑습니다.", "안녕히계세요"};
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}

}
