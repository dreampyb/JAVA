package quiz;

public class Quiz4 {
	  
	   void printstar(int j)  { // int j는 래퍼런스의 8행 인자
	      
		   for( int i=0; i<j; i++)   // 10을 넣지 않고 메소드변수를 넣은 이유?
			                                // => 래퍼런스의 메소드 인자를 사용하기 위하여 
	         System.out.print("*");  
		   
	   }

//	   int big(int a, int b, int c) {
//		if (a>b) {
//			if(a>c) {
//				return a;
//			}else{
//				return c;
//			}
//		}else {
//			if(b>c) {
//				return b;
//			}else {
//				return c;
//			}
//		}
//	}
	   
	   int big(int a, int b, int c) {
		   int bignum;
		if (a>b) {
			if(a>c) {
				bignum=a;
			}else{
				bignum=c;
			}
		}else {
			if(b>c) {
				bignum=b;
			}else {
				bignum=c;
			}
		}
		return bignum;
	}
}