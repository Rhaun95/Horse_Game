package main.ingame.race;

import java.util.ArrayList;

import main.ingame.horse.RaceHorse;


public class SaveRaces{
	
	//저장소
	//각 회차 경주마들/결과
	main.ingame.horse.RaceHorse r = new main.ingame.horse.RaceHorse();
	ArrayList<ArrayList<RaceHorse>> result = new ArrayList<>();
	ArrayList<RaceHorse> rankSave = new ArrayList<>();
	
	
	public ArrayList<ArrayList<RaceHorse>> getResult(){
		return this.result;
	}
	public void setResult(ArrayList<ArrayList<RaceHorse>> result) {
		this.result =  result;
	}
	
	//랭크 출력
	public void printAllRank() {
		int count = 1;
		for(RaceHorse horse : r.getRaceStall()) {

			System.out.println(horse.getLine() +" "+count + "번마: "+ horse.getName() +" 순위: " + horse.getRank());
			count++;
		}
		System.out.println("=============================================================================");
		System.out.println();
	}
	
	
	public void print() {
		for(ArrayList<RaceHorse> stall : this.result) {
			for(RaceHorse horse : stall) {
				System.out.println(horse.getName());
				System.out.println(horse.getRank());
				System.out.println(horse.getLine());
			}}}
	
	//각 회 경기 결과 저장 메서드
	public void save(ArrayList<RaceHorse> raceHorses) {
		for(RaceHorse horse : raceHorses) {
			RaceHorse r = new RaceHorse();

			r.setLine(horse.getLine());
			r.setName(horse.getName());
			r.setRank(horse.getRank());
			rankSave.add(r);
			
		}
		
		result.add(rankSave);

	}
}
