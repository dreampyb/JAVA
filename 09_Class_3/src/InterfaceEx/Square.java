package InterfaceEx;
public class Square implements InterArea {
	int a, b; //가로, 세로,implement는 구현하다
	Square(int a, int b){
		this.a=a;
		this.b=b;
	}
	@Override
	public int area() {
		return a*b;
	}}