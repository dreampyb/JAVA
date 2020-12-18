package review;

public class Percent {

	public static void main(String[] args) {
		// 1~10 까지의 수를 랜덤으로 뽑아낸다. 이를 98765번 수행한다.
		// 수행후 5가 나왔던 확률을 구해서 출력한다.
		// 예> 5가 10나왔다면 9812*100/98765
		int count5=0;
		//1.98765번 반복수행한다.
		for(int i=0; i<98765; ++i) {
			int num= (int)(Math.random()*10)+1;
			//2.반복수행중에 5번이 나온횟수를 저장한다.
			if(num==5)
				++count5;
		}
		
		//3.반복이 끝난후에 5번이 나온확률을 계산한다.
		System.out.println("5가 나온 확률은"+ ((count5*100)/98765));
		
	}

}
