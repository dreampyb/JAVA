package quiz;
public class Ex1 {

	int a,b;
	 Ex1(int a, int b) {
		 this.a=a;
		 this.b=b;
	}
	 int primeCount() {						// 1. 소수를 판단할 숫자를 하나씩 가져온다            
		                                                	// 2. 1부터 임의 수까지 나눠보고, 나머지가 0인게 두개면 소수
		int primeCount=0;              	//소수의 개수
		 for(int i=a;  i<=b;  i++) {    	// * a부터 b까지 의 수를 하나씩 가져오기 *
			 int count=0;                    	// for문밖에 선언하면 계속 누적됨으로 안에 선언
			 for(int j=1;  j<=i;  j++) {  	// 가져온수를 1부터 가져온 수까지 나누어서 나머지 확인                         			
				 if(i%j==0)						// 나머지가 0인 회수 저장
					 ++count;
			 }
			 if(count==2)               		 // 나머지가 0인 회수가 2번이면 소수 
				 ++primeCount;				// 즉,  1과 자기자신으로 나누어짐
		 	}
		 		 return primeCount;
	 }
}