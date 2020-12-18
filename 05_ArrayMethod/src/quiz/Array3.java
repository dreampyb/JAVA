package quiz;

public class Array3 {

	public static void main(String[] args) {
		//주사위를 50000만 던져서 나온횟수를 배열에 저장하고
		//출력하는 프로그램
		int[] dice = new int[6]; //각각의 눈금 저장용 dice[0]은 1번눈금... dice[5]는 6번눈금
		
		for(int i=0; i<50000; ++i) {
			int num=(int)(Math.random()*6)+1;
			dice[num-1] += +1;
		}
		for(int i=0; i<6; i++) {
			System.out.println((i+1)+"번째 눈금의 횟수는"+ dice[i]);
		}

	}

}
