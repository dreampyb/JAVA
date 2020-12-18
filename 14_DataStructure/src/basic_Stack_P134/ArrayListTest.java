package basic_Stack_P134;

import java.util.ArrayList;

public class ArrayListTest {
	//List 순번(index)이 있는 데이터
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("첫번째");
		list.add("두번째");
		list.add("세번째");
		list.set(0, "영번째"); // 0번째 index에 있는것을 바꾼다.
		list.add(0, "삽입"); // 0번째 index앞에 삽입한다.
		list.remove(1); // 1번째 index를 삭제한다.
		
	
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		for(String temp : list) {
			System.out.println(temp);
		}
		
	}

}
