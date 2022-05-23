package main.ingame.race;

import java.util.Random;

public class Game {

	main.ingame.horse.RaceHorse r = new main.ingame.horse.RaceHorse();
	
	//경기장 길이
	int fieldLength = 2500;
	
	public int getFieldLength() {
		return this.fieldLength;
	}
	public void setFieldLength(int field) {
		this.fieldLength = field;
	}

	//랜덤 수 생성 1~8
	public int[] createRandomNumber() {
		int count = r.getRaceStall().size(); // 난수 생성 갯수
		
		int a[] = new int[count];
		Random rd = new Random();
		
		// 1 ~ 8까지의 중복되지 않는 난수 
		for(int i=0; i<count; i++){
			a[i] = rd.nextInt(count) + 1; 
			for(int j=0; j<i; j++){
				if(a[i] == a[j]){
					i--;
				}
			}
		}
		return a;
	}
		
	//경주마들 레인에 랜덤배정
	public void giveLine() {
		//랜덤한 line
		int randNum[] = createRandomNumber();
	
		for(int i = 0; i<r.getRaceStall().size(); i++) {
			//랜덤한 라인에 배치
			r.getRaceStall().get(i).setLine("["+randNum[i]+"번라인]");
			
		}
	}
	
	
	
	public void gameStart(main.ingame.horse.RaceHorse r) {
		String fieldStone[] = new String[40];	
		//현재 거리
		int count = 0;
		int mass = 0;
		int oneStep = fieldLength/40;	// 2500/40 = 62.5 = 1칸 정보
		int stone = 0; 	//현재 위치 정보
		System.out.println();
		while(stone < 40) {
			for(int j = 0 ; j<40; j++) {
				if(stone == j ) 
				fieldStone[stone] = ">";
				else
				fieldStone[j] = "_ ";
			}
			System.out.println(r.getName()+ ": "+ String.join("", fieldStone));
			mass = (int) (count * r.getSpeed());
			stone = mass/oneStep;
			count++;// _ 40개
			
			try {
				Thread.sleep(80);
			} catch (InterruptedException e) {}
			
		}
		r.setRank(r.getRank());
		r.setRank(r.getRank()+1);
	
	}
	
	
	
	
	
	
	
}
