package game;

import java.util.Scanner;

public class RPSMain {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 
        while(true) {
            System.out.println("경기 시작 : 1, 종료 : 2");
            
            if(scan.nextInt() > 1) break;
 
            int win =0;    //이긴 수
            int compare = 0; //비긴 수
            int lose = 0; //패배 수
            
            int com = 0; //컴퓨터가 낸 값
            int human = 0; //유저가 낸 값
 
            for(int i=0; i < 10; i++) {
                int rps = 0; //가위바위보 결과 
                
                //컴퓨터 가위/바위/보 중에 랜덤으로 생성
                //Math.random은 double형으로 random값을 생성하므로 10을 곱한뒤 3으로 나눈값에서 1을 더해준다.(1,2,3)
                com = (int) (Math.random() * 10) % 3 + 1;
                
                System.out.println("가위 바위 보중에 한가지를 선택하세요. (가위 : 1, 바위 : 2, 보 : 3)");
                //유저각 낸 값 저장
                human = scan.nextInt();
                
                //가위바위보 결과를 저장한다.
                rps = result(human, com);
 
                if(rps == 0) {
                    win++;
                }else if(rps == 1) {
                    lose++;
                }else if(rps == 2) {
                    compare++;
                }
            }
            System.out.println("총 "+win+"승,"+lose+"패,"+compare+"비김");
        }
    }
	private static int result(int human, int com) {
		return com ;
	}
}