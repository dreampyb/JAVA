package reviewCircle;

public class Review1 {

   public static void main(String[] args) {
        
	  Circle c1 = new Circle(5);      //반지름의 값을 갖는 생성.
      Circle c2 = new Circle() ;       //반지름을 안넣어주면 반지름으로 기본값10을 가집.
      
      c1.area( );         // 원의 넓이를 요청하면 r*r*3.14 =78.5  출력: 원의 넓이는 78.5입니다.
      c2.area( );         // 반지름이 10인 원의 넓이 출력.
      
      

   }

}
