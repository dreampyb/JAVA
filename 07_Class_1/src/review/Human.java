package review;

public class Human {
	//String 문자열   "   "
	//int 정수
	//double 소수 (.)
	String name;  //이름
	int age;
	String sex;
	
	Human(String sex){     //아기용 new Human("남")  
		age=1;
		this.sex=sex;
	}
	Human(String name, int age, String sex){  //입양용
		this.name=name;
		this.age=age;
		this.sex=sex;
	}

	void 밥을먹는다() {
		System.out.println(name + "밥을 먹는다.");
	}
	void 잠을잔다() {
		System.out.println(name + "잠을 잔다.");
	}
	void 일은한다() {
		System.out.println(name + "일을 한다.");
	}
}
