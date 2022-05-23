package main.game;

import java.util.ArrayList;
import main.ingame.horse.RaceHorse;
import main.ingame.race.SaveRaces;

public class GameDao {
	SaveRaces sr = new SaveRaces();
	RaceHorse rh = new RaceHorse();
	
	ArrayList<ArrayList<RaceHorse>> resultDao = new ArrayList<>();
	ArrayList<RaceHorse> stallDao = new ArrayList<>();
	int field;
			
	public void setResultDao(ArrayList<ArrayList<RaceHorse>> result) {
		this.resultDao =result ;
	}
	public ArrayList<ArrayList<RaceHorse>> getResultDao(){
		this.resultDao = sr.getResult();
		return this.resultDao;
	}
	//경주말 8마리
	public ArrayList<RaceHorse> getStallDao(){
		this.stallDao = rh.getRaceHorses();
		return this.stallDao;
	}
	public void setStallDao(ArrayList<RaceHorse> stall) {
		this.stallDao = stall;
	}
	
	public int getField() {
		this.field = rh.getFieldLength();
		return this.field;
	}
	public void setField(int field) {
		this.field = field;
	}
	
	
	public void print(ArrayList<ArrayList<RaceHorse>> resultDao) {
		for(ArrayList<RaceHorse> race :resultDao ) {
			for(RaceHorse horse : race) {
				System.out.print("이름: " + horse.getName());
				System.out.print("순위: " + horse.getRank() + "위" );
				System.out.println(horse.getLine());
			}
		}
		
	}
	
	
}
