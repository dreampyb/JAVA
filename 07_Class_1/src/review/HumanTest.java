package review;

public class HumanTest {

   public static void main(String[] args) {
		   
	  // 2명의 아기를 만들고 태어나고 => 이름지어주자.
      Human baby1 = new Human("남");
      baby1.name="일남이";
     
      Human baby2 = new Human("여");
            baby2.name="일순이";
      
      // 입양
      Human boy1 = new Human("김철이",5,"남");
      
         baby1.잠을잔다();
         boy1.밥을먹는다();
         baby1.age=baby1.age+1; // 1살을 더 먹습니다.
   }
      
}
