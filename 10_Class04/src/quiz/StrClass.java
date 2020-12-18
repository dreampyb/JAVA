package quiz;

public class StrClass {
	
	String str="기본값입니다";
	 
	 StrClass( ){
		 str="기본값입니다.";
	 }
	 
	StrClass(String str) {
		this.str=str;	
	}

	String str() {
		
		return str;
	}
}
