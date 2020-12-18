package reviewCircle;

public class Circle {
	int r;	
	final static double PI=3.141592; 
	//final 키워드를 통해 변경될수 없도록 한다. 
	// static을 통해 한번만 만들어지도록
		
	Circle(int r){
		this.r=r;
	}
	
	Circle(){
		r=10;
	}
	
	void area() {
	
		System.out.println("원의 넓이는 " + (r*r*PI));
	}
}
