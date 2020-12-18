package basic;

public class Conversion {

	public static void main(String[] args) {
		short snum=100;
		int inum = snum;
		double dnum = 3.0;
		
		snum = (short)inum;
		inum = (int)dnum;
		
		inum=snum*inum;   //ex> short 과 int의 연산결과는 int  / float double 의 연산과 double
		//float int의 연산결과 float
		//int double -> double
		
		//5/100.0 -> 0.05
		
	}

}
