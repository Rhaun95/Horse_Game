package main.events.cuEvent;

public class Point2X {

	public void run() { 
	System.out.println("	포인트 2배 이벤트");
	System.out.println("홀수일 획득 포인트 2배 이벤트");
	}
	public int getMultiple(int date) {
		return (date%2 != 0)? 2 : 1; 
	}
}
