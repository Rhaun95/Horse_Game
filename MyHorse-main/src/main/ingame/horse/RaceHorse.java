package main.ingame.horse;

import java.util.ArrayList;
import java.util.Random;

public class RaceHorse{
	
	//마구간
	ArrayList<RaceHorse> raceStall = new ArrayList<RaceHorse>();

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
	int rank = 1;
	String line;
	
	
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
		this.rank = 0;
		this.line = "미정";
	}

	
	
	public ArrayList<RaceHorse> getRaceStall() {
		return raceStall;
	}

	public void setRaceStall(ArrayList<RaceHorse> raceStall) {
		this.raceStall = raceStall;
	}
	
	public String getLine() {
		return this.line;
	}
	public void setLine(String line) {
		this.line = line;
	}
	
	public int getRank() {
		return this.rank;
	}
	public void setRank(int r) {
		this.rank = r;
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
	public void addSpeed(int speed) {
		this.speed = this.speed +speed;
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
	
	public void addExp(int exp) {
		this.exp +=exp;
		
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

	//말들 생성  & 경주말에 넣기
	public void createRaceHorses() {
		raceStall.add(new RaceHorse("얼룩이", 70, "검정"));
		raceStall.add(new RaceHorse("파랑이", 75, "무지개"));
		raceStall.add(new RaceHorse("금박이", 80, "빨강"));
		raceStall.add(new RaceHorse("분홍이", 73, "파랑"));
		raceStall.add(new RaceHorse("초록이", 78, "초록"));
		raceStall.add(new RaceHorse("금금이", 88, "황금"));
		raceStall.add(new RaceHorse("말말이", 83, "갈색"));
		
	}
	
	//전체조회(1~8)
	public void printRaceHorse(ArrayList<RaceHorse> raceStall) {
		for(RaceHorse horse :raceStall) {
			
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
	
	public int createRandomNumber2() {
		int a;
		Random r = new Random();
		a = r.nextInt(7) + 1; // 1 ~ 7까지의 난수 
		return a;
	}
	
	
	
	
}
