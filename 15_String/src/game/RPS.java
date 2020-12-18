package game;

import java.util.Scanner;

public class RPS {
	
    private static int rps,가위,바위,보;

	public static int result(int human, int com) {
        int ret = 0;
        /* param user 사용자가 낸 값
           param computer 컴퓨터가 낸 값
           return int 유저가 이겼는지(0. 승리, 1. 패배, 2. 비김)
                      비겼을 경우를 최우선으로 비교한다*/
        if(human == com ) {
            System.out.println("비겼습니다.");
            rps = 2;
            return rps; 
        }
        
        //유저가 가위를 냈다면
        //컴퓨터가 낸 값이 바위와 보 둘중에 하나이므로 비교하여 승리, 패배결정
        if(human == 가위) {
                System.out.print("유저 : 가위 ,");
            if(com == 바위) { 
                System.out.println("컴퓨터 : 바위 >>> 결과 : 패배");
                rps = 1;
            }else {
                System.out.println("컴퓨터 : 보 >>> 결과 : 승리");
                rps = 0;
            }
        }
        
        //유저가 바위를 냈다면
        //컴퓨터가 낸 값이 가위와 보 둘중에 하나이므로 비교하여 승리, 패배결정
        if(human == 바위) {
                System.out.print("유저 : 바위 ,");
            if(com == 보) { 
                System.out.println("컴퓨터 : 보 >>> 결과 : 패배");
                rps = 1;
            }else {
                System.out.println("컴퓨터 : 가위 >>> 결과 : 승리");
                rps = 0;
            }
        }
        
        //유저가 보를 냈다면
        //컴퓨터가 낸 값이 가위와 바위 둘중에 하나이므로 비교하여 승리, 패배결정
        if(human == 보) {
                System.out.print("유저 : 보, ");
            if(com == 가위) { 
                System.out.println("컴퓨터 : 가위 >>> 결과 : 패배");
                rps = 1;
            }else {
                System.out.println("컴퓨터 : 바위 >>> 결과 : 승리");
                rps = 0;
            }
        }
        
        //결과 리턴
        return rps;
    }
}
