package quiz;

public class Quzi3Main {

	public static void main(String[] args) {
		Quiz3 obj1 = new Quiz3(0);
		Quiz3 obj2 = new Quiz3(5);
		
		obj1.run1();  // 출력: 1명이 뛰어갑니다. => argument+1의 의미라는 것을 catch
		obj2.run1();  // 출력: 6명이 뛰어갑니다. => argument+1의 의미라는 것을 catch
	}

}
