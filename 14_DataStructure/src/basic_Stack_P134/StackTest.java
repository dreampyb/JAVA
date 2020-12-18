package basic_Stack_P134;

import java.util.Stack;

public class StackTest { // 실예> Ctrl+Z같은것.

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();  //p92 , <>안에는 반드시 참조형만 써준다.
		// ex> Integer,String.  cf. Int 안됨.
		
		stack.push("첫번째");
		stack.push("두번째");// Last In First Out (LIFO): 맨나중 들어간것이 첫번째로 나온다.
		
		String aa=stack.pop();
		System.out.println(aa);
	}
}
