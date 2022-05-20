package main.ingame.horse;

import java.util.ArrayList;
import java.util.Scanner;

public class MyHorse {
	
	Scanner sc = new Scanner(System.in);
	
	//마구간
	ArrayList<MyHorse> myHorses = new ArrayList<MyHorse>();
	RaceHorse r = new RaceHorse();
	
	//말 세부정보
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
	String line;
	
	RaceHorse rh = new RaceHorse();
	//생성자
	public MyHorse() {
		
	}

	public MyHorse(String name, String color) {
		this.name = name;
		this.color = color;
		this.speed = 100;
		this.stamina = 100;
		this.levelOfUpbringing = "-";
		this.raceType = "잠금";
		this.level = 1;
		this.exp = 0;
		this.condition	= 100;
		this.sympathetic = "중";
		this.sympathetic = "중";
		this.line = "미정";
	}
	
	//내 말들 보관함(용량 2) 받아오기
	public ArrayList<MyHorse> getMyHorses(){
		return this.myHorses;
	}
	
	// getter&setter
	public String getLine() {
		return this.line;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getExp() {
		return exp;
	}
	
	public void setExp(int exp) {
		this.exp = exp;
	}
	public void addExp(int a) {
		this.exp = this.exp + a; 
	}
	
	public int getLevel() {
		return this.level;
	}
	public void addLevel(int level) {
		this.level = this.level+ level;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	
	public double getSpeed() {
		return this.speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public void addSpeed(double speed) {
		this.speed = this.speed +speed;
	}
	public int getStamina() {
		return this.stamina;
	}
	public void setStamina(int stamina) {
		this.stamina = stamina;
	}
	public void addStamina(int stamina) {
		this.stamina = this.stamina + stamina;
	}
	public String getLevelOfUpbringing() {
		return this.levelOfUpbringing;
	}
	public void setLevelOfUpbringing(String levelOfUpbringing) {
		this.levelOfUpbringing = levelOfUpbringing;
	}
	
	public String getRaceType() {
		return this.raceType;
	}
	public void setRaceType(String raceType) {
		this.raceType = raceType;
	}
	
	//컨디션
	public int getCondition() {
		return this.condition;
	}
	public void addCondition(int a) {
		this.condition = this.condition + a;
	}
	public void setCondition(int condition) {
		this.condition = condition;
	}	
	
	
	public String getSympathetic() {
		return this.sympathetic;
	}
	public void setSympathetic(String sympathetic) {
		this.sympathetic = sympathetic;
	}
	

	//말 객체 생성(name, color)
//	public void createHorse() {
//		String n ;
//		String c;
//		
//		if(myHorses.isEmpty()) {
//			System.out.println("말에게 이름을 주세요: ");
//			n = sc.nextLine();
//			System.out.println("색상을 정해주세요:");
//			c = sc.nextLine();
//			myHorses.add(new MyHorse(n, c));
//			
//			System.out.println("========축하합니다 [" + myHorses.get(0).getName() + "]가 생성되었습니다!========");
//			print(myHorses);
//			System.out.println("===================================================");
//		}else {
//			System.out.println("이미 키우고 있는 말이 있습니다.");
//		}
//		System.out.println();
//	}
		
	

	//전체조회(1~8)
	public void print(ArrayList<MyHorse> myHorses) {
		
		for(MyHorse horse : myHorses) {
			System.out.println("이름: " + horse.getName());
			System.out.println("색상: " + horse.getColor());
			System.out.println("속도: " + horse.getSpeed());
			System.out.println("체력: " + horse.getStamina());
			System.out.println("육성난이도: " + horse.getLevelOfUpbringing());
			System.out.println("주행타입: " + horse.getRaceType());
			System.out.println("레벨: " + horse.getLevel());
			System.out.println("경험치: " + horse.getExp());
			System.out.println("컨디션: " + horse.conditionLevel(horse.getStamina(), horse.getSympathetic()));
			System.out.println("교감도: " + horse.getSympathetic());;
		}
		System.out.println();
	}
	
	//말 컨디션과 (컨디션 포인트,체력, 교감도)의 관계
	public String conditionLevel(int stamina, String sympathetic) {
		
		if(sympathetic == "상") {
			addCondition(10);
		}else if (sympathetic == "중") {
			addCondition(5);
		}else
			addCondition(-10);
		
		if(stamina>= 80) {
			addCondition(10);;
		}else if(stamina < 80 && stamina >40) {
			addCondition(5);
		}
		else {
			addCondition(-10);
		}
		
		
		if(getCondition()> 80) {
			return "상";
		}else if(getCondition() <= 80 && getCondition() >40) {
			return "중";
		}
		else {
			return "하";
		}
	}
	
}
