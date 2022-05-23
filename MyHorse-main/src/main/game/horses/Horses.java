package main.game.horses;

import java.util.TreeSet;

class Horse implements Comparable<Horse>{
	public int order;
	public String name;
	
	Horse(int order,String name) {
		this.order = order;
		this.name = name;
	}
	@Override
		public int compareTo(Horse h1){
		if(order<h1.order) { return -1; }
		else if (order==h1.order) {return 0;}
		else return 1;
	}
}
public class Horses {	// 출전마 정보 출력
	TreeSet<Horse> hlist =new TreeSet<>();
	
	public Horses(){
		hlist.add(new Horse(3,"1번마"));
		hlist.add(new Horse(4,"2번마"));
		hlist.add(new Horse(2,"3번마"));
		hlist.add(new Horse(1,"4번마"));
		hlist.add(new Horse(6,"5번마"));
		hlist.add(new Horse(5,"6번마"));
	}
	public void run(){
		System.out.println();
		System.out.println("회 출전마 정보");
		int hSize = hlist.size();
		
		for(int i = 0; i<hSize; i++) {
			System.out.print(i+1 + "번마: ");
			System.out.println(hlist.pollFirst().name);
			}
		System.out.println();
	}
}
