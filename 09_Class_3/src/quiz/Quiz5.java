package quiz;

public class Quiz5 {
	int a,b,c;
	
	Quiz5(int a, int b, int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	 void min() {
		 int min;
		 if(a>b) {
			 if(b>c) 
				 min=c;
			 else 
				 min=b;
		}else{
			if (a>c) 
				min=c;
			else 
				min=a;
		 }
		System.out.println(min);
	}
}
