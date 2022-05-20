package main.ingame.race;

import java.util.ArrayList;
import java.util.Scanner;

import main.ingame.horse.MyHorse;
import main.ingame.horse.RaceHorse;
/*게임 보상	
 * 상금받기(말주인)	
 * 배팅금 받기(배팅자 수)	
 * 말에게 경험치 부여		
*/
interface Get{
	
	void victoryPrice(RaceHorse rh);
	void afterGameMoney(int n);
	void afterGameExp(RaceHorse rh);
	
}

public class Price implements Get{
	ArrayList<RaceHorse> raceHorces = new ArrayList<RaceHorse>();
	RaceHorse r = new RaceHorse();
	
	Scanner sc = new Scanner(System.in);

	int betPersons=7;
	int betTotal = 7000;
	

	//1등 상금받기(말주인)
	public void victoryPrice(RaceHorse rh) {
		if(rh.getHorseRank()==1) {
			System.out.println(rh.getLine()+" " + rh.getName() + ": 상금 1000$를 획득하셨습니다.");
		}else
			System.out.println(rh.getLine()+" " + rh.getName() + ": 다음 기회를 노려보세요.");
	}
	
	//배팅금 받기(배팅자)
	public void afterGameMoney(int n) {//n = 배팅한 총 사람 수
		System.out.println("배팅금 total/n을 획득하셧습니다.");
	
	}

	//말에게 경험치 주기
	//1-3등까지만 경험치 추가
	public void afterGameExp(RaceHorse rh) {
		
		switch(rh.getHorseRank()) {
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
		System.out.println();
	}

	
}
