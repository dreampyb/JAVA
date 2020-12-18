package p29;

public class While_Test {

	public static void main(String[] args) {
		int i=1;
		while(i<11) {	//1~10
			System.out.println(i);
			i++;
		}
		//2단만 for문과 while문을 이용해서 출력하세요.
		for(int j=2; j<10; j++) {	//for문 이용시
			System.out.println("2*"+j+"="+(2*j));
		}
		i=2;
		while(i<10) {				//while문 이용시
			System.out.println("2*"+i+"="+(2*i));
			++i;
		}
		
	}
	

}
