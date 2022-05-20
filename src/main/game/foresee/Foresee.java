package main.game.foresee;

class Day {
	int day;
	Day(){
		day = 10;
	}
}
class Track{
	String wether;
	int distance;
	Track(){
		wether = "맑음";
		distance = 2500;
	}
}

public class Foresee {
	
	void dDay() {// 경기까지 남은 일수.
		int k=1;
		System.out.println(k + "회 경기까지 " + new Day().day + "일 남았습니다.");
//		System.out.println("현재 경기가 진행중입니다.");
		
	}
	
	void trackInfo() {	//트랙정보 - 거리, 날씨,?
		
		System.out.print("현재 날씨: ");
		System.out.println(new Track().wether);
		System.out.print("트랙 정보: ");
		System.out.println(new Track().distance);
	}
	Foresee(){
		System.out.println();
		dDay();
		trackInfo();
		System.out.println();
	}
}
