package basic;

public class EnumTest1 {
	public static final String COLOR_BLUE = "blue";
	public static final String COLOR_YELLOW = "yellow";
	public static final String COLOR_RED = "red";
	
	public static void main(String[] args) {
		processColor(ColorDemo.COLOR_BLUE);  // ()안에 넣는 문자열이 출력
		SeasonDemo a= SeasonDemo.Automn;

	}
	
	public static void processColor(ColorDemo Color) { 
		// ColorDemo 라는 이넘타입으로 제약.
		System.out.println("선택한 컬러는"+Color);
	}
	
}
