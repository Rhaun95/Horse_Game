package main.game.gambling;

import java.util.ArrayList;
import java.util.TreeSet;

class Betting implements Comparable<Betting>{
	public int point;
	public String name;
	
	Betting(int point,String name) {
		this.point = point;
		this.name = name;
	}
	@Override
		public int compareTo(Betting b1){
		if(point<b1.point) { return 1; }
		else if (point==b1.point) {return 0;}
		else return -1;
	}
}

public class Gambling {	// 출전마에 배팅
	TreeSet<Betting> blist =new TreeSet<>();
	
	public Gambling(){
		blist.add(new Betting(1000,"1번마"));
		blist.add(new Betting(1500,"2번마"));
		blist.add(new Betting(2000,"3번마"));
		blist.add(new Betting(1500,"4번마"));
		blist.add(new Betting(5000,"5번마"));
		blist.add(new Betting(500,"6번마"));
	}
	public void run(){
		System.out.println();
		System.out.println("회 배팅 정보");
		int bSize = blist.size();
		long btotal = 0L;
		ArrayList<Betting> btemp = new ArrayList<>();
		
		for(int i = 0; i<bSize; i++) {
			btemp.add(blist.pollFirst()); 
			btotal += (long)btemp.get(i).point;
		}
			for(int i = 0; i<bSize; i++) {
			System.out.print(i+1 + "위: " + btemp.get(i).name + ", " + btemp.get(i).point +"포인트");
			System.out.printf(". 배당률 %.2f배%n",0.9*btotal/(btemp.get(i).point));
			}
		
		System.out.println("배팅액: 총 " + btotal+ "포인트");
		System.out.println();
	}
}
