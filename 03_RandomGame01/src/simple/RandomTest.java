package simple;

public class RandomTest {

	public static void main(String[] args) {
		for(int i=0; i<100; i++) {
			System.out.println(Math.random());
			//Math.random() -> 0~1미만의 부동소수점 값을 리턴
			// 0 ~ 0.9999999999999
			// (int)0.345 ->0
			// (int)(Math.random()*100)+1;
			// ex> 0~10 -> (int)(Math.random()*11)
			// ex> 11+21 -> (int)(Math.random()*11)+11
			// ex> 11~20 -> (int)(Math.random()*10)+11
			//  -> 11이숫자는 시작수, 10은 끝수-시작수+1
			
		}

	}

}
