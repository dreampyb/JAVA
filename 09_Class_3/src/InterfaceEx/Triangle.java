package InterfaceEx;

public class Triangle implements InterArea {
	int a, b; // 밑변, 높이
	
	Triangle(int a,int b){
		this.a=a;
		this.b=b;
	}
	
	@Override
	public int area() {
		return a*b/2;
	}

}
