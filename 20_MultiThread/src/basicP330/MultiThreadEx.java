package basicP330;

public class MultiThreadEx {

	public static void main(String[] args) {

		//Thread 상속받은 클래스
		AlphabetThread thread1 = new AlphabetThread();
		thread1.start(); 
		
		//Runable을 구현한 클래스
		AlphabetThreadInter obj = new AlphabetThreadInter();
		Thread thread2 = new Thread(obj);
		thread2.start();
						
		for(int i=1; i<=50; i++) {
			System.out.print(i+" ");
		}
	}
}
// 출력 내용은 병렬실행된 것들이 섞여 보일 수 있다
// 이는 각 코어의 속도에 차이에서 발생하는 것이고
// 그 속도 차이는 중앙 프로세서에서 만들어내는 것으로 
// 인간이 섞이는 것을 조정하기는 힘들다 