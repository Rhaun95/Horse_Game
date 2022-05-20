package main.game.record;

import java.util.TreeSet;

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
	Record() {
		System.out.println();
		
	TreeSet<Horse> hlist =new TreeSet<>();
	hlist.add(new Horse(3,"1번"));
	hlist.add(new Horse(4,"2번"));
	hlist.add(new Horse(2,"3번"));
	hlist.add(new Horse(1,"4번"));
	hlist.add(new Horse(6,"5번"));
	hlist.add(new Horse(5,"6번"));

	System.out.println("회 경기 정보");
	int hSize = hlist.size();
		for(int i = 0; i<hSize; i++) {
			System.out.print(i+1 + "등: ");
			System.out.println(hlist.pollFirst().name);
			}
		System.out.println();
	}
}
