package game;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//집행검 강화 - 아니오로 넘길 수 있는거
	      Scanner scan = new Scanner(System.in);
	      
	      int u=0;
	      for(;;) {
	         int com=(int)(Math.random()*2)+2;
	         System.out.println("집행검 강화를 시작하시겠습니까? (현재상태:"+u+")");
	         String a=scan.next();
	         if(a.equals("그만")) {
	            System.out.println("종료합니다 (최종상태:"+u+")"); break;
	         }else if(a.equals("아니오")) {
	            
	         }else if(a.equals("네")) {
	            System.out.println("강화를 시작합니다.");
	            if(com%2==0) {
	               ++u;
	               System.out.println("성공 (현재상태:"+u+")");
	            }else {
	               u=0;
	               System.out.println("실패 (현재상태:"+u+")"); break;
	            }
	         }
	      }

	   }
	}