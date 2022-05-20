package main.ingame.horse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class RaceHorse{
	
	
	//경주마들
	ArrayList<RaceHorse> raceHorses = new ArrayList<RaceHorse>();

	LinkedList<Integer> rank = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

	String name;
	String color;
	double speed;
	int stamina;		
	String levelOfUpbringing;
	String raceType;
	int level;		
	int exp;
	int condition;
	String sympathetic;
	int horseRank;
	String line;
	
	
	int count = 0;
	
	public RaceHorse() {
		super();
	}
	public RaceHorse(String name, double speed, String color) {
		this.name = name;
		this.color = color;
		this.speed = speed;
		this.stamina = 100;
		this.levelOfUpbringing = "중";
		this.raceType = "잠금";
		this.level = 20;
		this.condition	= 100;
		this.sympathetic = "중";
		this.horseRank = 0;
		this.line = "미정";
	}
	
	public LinkedList<Integer> getRank() {
		return this.rank;
	}
	
	public String getLine() {
		return this.line;
	}
	public void setLine(String line) {
		this.line = line;
	}
	
	public ArrayList<RaceHorse> getRaceHorses() {
		return raceHorses;
	}

	public void setRaceHorses(ArrayList<RaceHorse> raceHorses) {
		this.raceHorses = raceHorses;
	}
	
	public int getHorseRank() {
		return this.horseRank;
	}
	public void setHorseRank(int r) {
		this.horseRank = r;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSpeed() {
		return this.speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getStamina() {
		return stamina;
	}

	public void setStamina(int stamina) {
		this.stamina = stamina;
	}

	public String getLevelOfUpbringing() {
		return levelOfUpbringing;
	}

	public void setLevelOfUpbringing(String levelOfUpbringing) {
		this.levelOfUpbringing = levelOfUpbringing;
	}

	public String getRaceType() {
		return raceType;
	}

	public void setRaceType(String raceType) {
		this.raceType = raceType;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getCondition() {
		return condition;
	}

	public void setCondition(int condition) {
		this.condition = condition;
	}

	public String getSympathetic() {
		return sympathetic;
	}

	public void setSympathetic(String sympathetic) {
		this.sympathetic = sympathetic;
	}

	public ArrayList<RaceHorse> getRaceHorse(){
		return this.raceHorses;
	}
	
	
	//내말 생성 & 경주마에 추가
	public void addToRaceHorses(ArrayList<MyHorse> h) {
		for(int i = 0; i<h.size(); i++) {
			raceHorses.add(new RaceHorse(h.get(i).getName(),h.get(i).getSpeed(),h.get(i).getColor()));
		}
	}					
		
	//말들 생성  & 경주말에 넣기
	public void createRaceHorses() {
		raceHorses.add(new RaceHorse("얼룩이", 70, "검정"));
		raceHorses.add(new RaceHorse("파랑이", 75, "무지개"));
		raceHorses.add(new RaceHorse("금박이", 80, "빨강"));
		raceHorses.add(new RaceHorse("분홍이", 73, "파랑"));
		raceHorses.add(new RaceHorse("초록이", 78, "초록"));
		raceHorses.add(new RaceHorse("금금이", 88, "황금"));
		raceHorses.add(new RaceHorse("말말이", 83, "갈색"));
		
	}
	
	//랜덤 수 생성 1~8 // 임시로 2
	public int[] createRandomNumber() {
		int count = raceHorses.size(); // 난수 생성 갯수
		
		int a[] = new int[count];
		Random r = new Random();
		
		for(int i=0; i<count; i++){
			a[i] = r.nextInt(raceHorses.size()) + 1; // 1 ~ 8까지의 난수 
			for(int j=0; j<i; j++){
				if(a[i] == a[j]){
					i--;
				}
			}
		}
		return a;
	}
	
	//레인에 랜덤배정
	public void giveLine() {
		//랜덤한 line
		int randNum[] = createRandomNumber();
	
		for(int i = 0; i<raceHorses.size(); i++) {
			//랜덤한 라인에 배치
			raceHorses.get(i).setLine("["+randNum[i]+"번라인]");
			
		}
	}
	
	
	//전체조회(1~8)
	public void printRaceHorse(ArrayList<RaceHorse> raceHorses) {
		
		for(RaceHorse horse :raceHorses) {
			
			System.out.println("이름: " + horse.getName());
			System.out.println("색상: " + horse.getColor());
			System.out.println("속도: " + horse.getSpeed());
			System.out.println("체력: " + horse.getStamina());
			System.out.println("육성난이도: " + horse.getLevelOfUpbringing());
			System.out.println("주행타입: " + horse.getRaceType());
			System.out.println("레벨: " + horse.getLevel());
			System.out.println("경험치: " + horse.getExp());
			System.out.println("컨디션: 상");
			System.out.println("교감도: " + horse.getSympathetic());
			System.out.println("라인 번호: " + horse.getLine());
			System.out.println();
		}
		
		System.out.println();
	}
	

	//말 세부정부 선택조회
//	public void print_number(int number) {
//		System.out.println("이름: " + raceHorses.get(number).getName());
//		System.out.println("색상: "  + raceHorses.get(number).getColor());
//		System.out.println("속도: " + raceHorses.get(number).getSpeed() + "km/h");
//		System.out.println("체력: "  + raceHorses.get(number).getStamina());
//		System.out.println("육성난이도: " + raceHorses.get(number).getLevelOfUpbringing());
//		System.out.println("주행타입: " + raceHorses.get(number).getRacetype());
//		System.out.println("레벨: "  + raceHorses.get(number).getLevel());
//		System.out.println("경험치: " + raceHorses.get(number).getExp());
//		System.out.println("체력: " + raceHorses.get(number).getCondition());
//		System.out.println("교감도: " + raceHorses.get(number).getSympathetic());
//		System.out.println();
//	}
	
	
	
	
	//말 한마리 당 경기 시간계산
	public void getRaceTime(RaceHorse rh) {
		
		
		
		
//		int field = 1200;
//			
//		for (int i = 0; i < field/(rh.getSpeed()/3.6); i++) {
//			System.out.println("\n" + rh.getName() + " : ");
//			for (int j = 0; j < i; j++) {
//				System.out.print("-");
//			}
//		
//			System.out.print(">");
//		
//			for (int j = (int)(field/(rh.getSpeed()/3.6))-1; j > i; j--) {
//				System.out.print("-");
//				}
//		
//		
//			try {
//				Thread.sleep(50);
//			} catch (InterruptedException e) {}
//			count++;
//				
//		}
//		System.out.println();
//		rh.setHorseRank(this.rank.poll()); 
//		
//		System.out.println();
		
		
		}
//	public void afterRaceResult(RaceHorse rh) {
//		
//		System.out.println((raceHorses.indexOf(rh)+1) + "번마:" + rh.getName() + "\r\n" +" 기록:" + count + "초  " +
//				   " 순위: " + rh.getHorseRank() +"등");
//
//	}
	
	
	//랭크 출력
	public void printAllRank() {
		int count = 1;
		for(RaceHorse horse : raceHorses) {
			System.out.println(horse.getLine() +" "+count + "번마: "+ horse.getName() +" 기록:" + count + "초  " +" 순위: " + horse.getHorseRank());
			count++;
		}
		System.out.println("=============================================================================");
		System.out.println();
	}

	
	public void addExp(int exp) {
		this.exp +=exp;
		
	}
	
}