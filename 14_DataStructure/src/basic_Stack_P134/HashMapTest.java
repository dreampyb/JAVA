package basic_Stack_P134;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String,Integer> h = new HashMap<>();
		h.put("키1", 178);
		h.put("키2", 100);
		h.put("키3", 125);
		
		int num=h.get("키3");
		System.out.println(num);

	}

}
