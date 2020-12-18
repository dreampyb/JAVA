package quiz;

public class Ex3 {
	String name;
	Ex3() {
	  }
	
	Ex3(String name){
		this.name=name;
	}

	 void setStr(String name) {
		this.name=name;
	}

	 String firstName() {
		 return name.substring(0,1);  // (시작index, 마지막index)
	}
    //  2가지 추출 방법( 1. start / 2.start,last)
	String lastName() {
		return name.substring(1);  // (시작index부터 마지막까지 모두)
	}

	int nameLength() {
		return name.length();
	}

	String add() {
		return name+"님";  // 그냥!!!  변수+더할 문자열!!!
	}

	void printName() {
		System.out.println("성은"+firstName());
		System.out.println("이름은"+lastName()+"입니다.");
	}
		
}
