package quiz;

public class Ex3 {
	String str;
	Ex3(){
		
	}
	Ex3(String str){
		this.str=str;
	}
	void setStr(String str) {
		this.str=str;
	}
	String firstName() {
		
		return str.substring(0, 1);
	}
	String lastName() {
		return str.substring(1);
	}
	int nameLength() {
		return str.length();
		
	}
	String add() {
		return str+"님";
	}
	void printName() {
		System.out.println("성은 " + firstName());
		System.out.println("이름은 " + lastName());
		
	}
	
}
