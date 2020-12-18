package basic;

public class Single {
	 static int num; //static 공유변수 
	
	 static void add(int add) {
		num = num+add;
		System.out.println("현재값 출력"+num);
	}
	
}
