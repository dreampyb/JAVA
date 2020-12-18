package quiz;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

	public static void main(String[] args) {
		//현재 디렉토리의 set.ini 파일에 셋팅값이 존재합니다.
		//텍스트 편집을 통해 변경할수 있습니다.
		//set.ini 파일의 내부내용은 단한줄의 하나의 숫자값으로 이루어져 있습니다. (ex>123)
		//프로그램 실행시 셋팅값에 저장되어있는 횟수대로 
		//'(횟수) 오늘은 여기까지'를 반복 출력하시오.
		//출력예> 반복횟수가 3회라면
		// (1) 오늘은 여기까지
		// (2) 오늘은 여기까지
		// (3) 오늘은 여기까지
		
		//1.파일의 내용읽기
		File file = new File("./set.ini"); //경로지정
		File file2 = new File("./");
		System.out.println(file2.toURI()); //uri 형태로 보기
		BufferedReader reader=null;
		String str=null;
		try {
			reader = new BufferedReader(new InputStreamReader(new FileInputStream(file),"UTF-8"));
			str=reader.readLine(); //첫줄내용 읽기
			System.out.println(str);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(reader!=null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		//2.읽은 내용(문자)을 숫자값으로 변경
		int count=Integer.parseInt(str);
		//3.숫자값만큼 반복
		for(int i=0; i<count; i++) {
			System.out.println("(" +(i+1) +")" + " 오늘은 여기까지");
		}
	}
}