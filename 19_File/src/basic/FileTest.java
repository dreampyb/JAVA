package basic;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		File file = new File("c:/work/sample1.txt");
		//경로구분자 유닉스(리눅스)/ , 윈도우 \ -> \\
		//리눅스 대소문자구분한다, 윈도우 대소문자 구분없다
		//결론 -> 유닉스처리용으로 하면 아무문제 없다.
		//경로: 절대경로(처음부터) , 상대경로(현재위치를 기준으로)
		
		System.out.println(file.exists());
		
		File dir = new File(".");
		for(String str:dir.list()) {
			System.out.println(str);
		}
		
	}

}
