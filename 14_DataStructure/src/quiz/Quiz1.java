package quiz;

import java.util.ArrayList;

public class Quiz1 {

	public static void main(String[] args) {
		// ArrayList를 이용해서
		// 1,2,3,4,5,6을 대입한 후에
		// 4를 삭제하고
		// 전체 list 내용을 출력한다. //1 2 3 5 6
		ArrayList<Integer> list = new ArrayList<>();
		// 숫자이고, 참조형으로 interger로 쓴다.
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.remove(3);
		
		//for(int i; i<7; i++) {
		//	list.add(i);
		//list.reove(new integer(4));
		for(int each : list) {
			System.out.println(each);
		}
	}

}
