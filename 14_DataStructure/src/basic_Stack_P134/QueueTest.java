package basic_Stack_P134;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		// 선입선출 First In Fist Out => FIFO
		LinkedList<String> q = new LinkedList<>();
		
		q.offer("첫번째");
		q.offer("두번째");
		q.offer("세번째");
		
		System.out.println(q.poll());
		

	}

}
