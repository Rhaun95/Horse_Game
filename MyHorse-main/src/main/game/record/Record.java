package main.game.record;


import main.game.GameDao;


class Horse implements Comparable<Horse>{
	
	public int rank;
	public String name;
	Horse(int rank,String name) {
		this.rank = rank;
		this.name = name;
	}
	@Override
		public int compareTo(Horse h1){
		if(rank<h1.rank) { return -1; }
		else if (rank==h1.rank) {return 0;}
		else return 1;
	}
}

public class Record {	//이전 회차 기록 확인
	
	
	GameDao gd = new GameDao();

	public void run(){
		
		gd.print(gd.getResultDao());
	}
}
