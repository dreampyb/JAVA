package basic;

public enum SeasonDemo {
	Spring(1),Summer(2),Automn(3),Winter(4);
	
	final int value;
	
	SeasonDemo(int value){
		this.value = value;
	}
	int getValue() {
		return value;
	}
}
