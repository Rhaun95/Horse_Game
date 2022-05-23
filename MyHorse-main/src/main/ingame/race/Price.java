package main.ingame.race;


import java.util.Scanner;
import main.ingame.horse.RaceHorse;
/*게임 보상	
 * 상금받기(말주인)	
 * 배팅금 받기(배팅자 수)	
 * 말에게 경험치 부여		
*/

public class Price{
	
	RaceHorse r = new RaceHorse();
	Scanner sc = new Scanner(System.in);

	//1등 상금받기(말주인)
	public void victoryPrice(RaceHorse rh) {
		if(rh.getRank()==1) {
			System.out.println(rh.getLine()+" " + rh.getName() + ": 상금 1000$를 획득하셨습니다.");
		}else
			System.out.println(rh.getLine()+" " + rh.getName() + ": 다음 기회를 노려보세요.");
	}
	

	//말에게 경험치 주기
	//1-3등까지만 경험치 추가
	public void afterGameExp(RaceHorse rh) {
		
		switch(rh.getRank()) {
			case 1:
				rh.addExp(30);
				break;
			case 2:
				rh.addExp(20);
				break;
			case 3:
				rh.addExp(10);
				break;
			default:
				if(rh.getExp()>10)
				rh.addExp(-10);
				break;
		}
	}

	
}
