package quiz2;

public class Test8Util {
	int a,b;

	static int sum(int a, int b) {
		return a+b;
	}
	  
	  static int mul(int a, int b) {
		return a*b;
	}

	static int max(int a, int b) {
//		if(i>j) 
//		return i;
//	    else 
//		return j;
	
	return (a>b) ? a: b;                 //삼항연산자
	}

	 static int min(int a, int b) {
			if(a<b) 
				return a;
			else 
				return b;
	}

	 static int allsum(int a, int b) {
		int sum=0;      // 밖에 선언하면 전역 변수가 됨으로 55가 생성된 후 
		// 재 연산 됨으로 마지막 문제에서 55+55 즉 110이 나온다.
		 for(int i=0; i<=10; i++) {
			 sum+=i;
		 }
			return sum ;
	}

	 static int allsumdiv(int a, int b) {
		 
		 return  allsum(a,b)/4;  // 이미 값이 나온 allsum을 이용하여 
		                                          // return값을 불러온다.
	}
}