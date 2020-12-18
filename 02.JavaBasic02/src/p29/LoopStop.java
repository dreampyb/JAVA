package p29;

public class LoopStop {

	public static void main(String[] args) {
		for(int i=1;i<101;++i) {
			System.out.println(i);
			if(i==2) 
				break;	//반복문 탈출
		}
		
		for(int i=1; i<101; ++i) {
			if(i%2==0)
				continue;  //반복문 내용 점프
			System.out.println(i);
		}

	}

}
