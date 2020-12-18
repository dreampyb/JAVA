package basic_Stack_P134;


import java.util.LinkedList;

public class LinkedListTest {  // 삽입삭제 많은 경우

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("첫번째");
		list.add("두번째");
		list.add("세번째");
		list.set(0, "영번째");
		list.add(0, "삽입");
		list.remove(1);
	
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		for(String temp : list) {
			System.out.println(temp);
		}

	}

}
