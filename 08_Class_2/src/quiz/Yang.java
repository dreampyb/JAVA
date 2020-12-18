package quiz;

public class Yang {

	public static void main(String[] args) {
		int num1=9;	//시작숫자
		int num2=12345; //끝숫자
		int primecount=0;
		boolean isPrimeNumber;
		
		if(num1==1) {	//1은 소수가 아님으로 2부터 시작
			num1=2;
		}
		
		for(int i=num1; i<=num2; i++) {
			isPrimeNumber=true;    //각 수의 처음실행시 소수라고 셋팅 why? 소수가 아닐때만 소수가 아니다라고 표시함으로
			for(int j=2; j<i; j++) {   //2부터 자기자신 전까지(-1) 한 값까지 나눠보기
				if(i%j==0) {
					isPrimeNumber=false;  //그때 나눠지는게 있으면 소수가 아님으로 
					break;                //더이상 해볼 이유가 없음으로 멈춰! 
				}
			}
			if(isPrimeNumber) {    //소수가 이면
				++primecount;      //소수 카운트 증가
			}
		}
		//다 끝나고 나면 소수개수 출력
		System.out.println("소수의 개수는" + primecount);
	}

}
