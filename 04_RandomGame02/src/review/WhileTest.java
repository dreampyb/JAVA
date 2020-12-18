package review;

public class WhileTest {

	public static void main(String[] args) {
		// While만을 이용한 구구단 만들기
		// 당연히 중첩 while문을 사용해야지만 해결할수 있습니다.
		int i=2;
		int j=2;
		while(i<10) {
			j=2;
			while(j<10) {
				System.out.println(i+"*"+j+"="+(i*j));
				++j;
			}
			++i; //2단밖에 출력이 안되요.
		}
	}

}
