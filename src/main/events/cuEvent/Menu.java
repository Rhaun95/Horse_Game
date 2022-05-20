package main.events.cuEvent;

import java.util.ArrayList;
import java.util.Scanner;

class EventList{
	int number;
	String title;
	EventList(int number, String title){
		this.number =number;
		this.title =title;
	}
}

public class Menu{
	public Menu() {
		
	System.out.println("	진행중인 이벤트 목록");
	ArrayList<EventList> cuEventList = new ArrayList<>();
	cuEventList.add(new EventList(1,"출석 체크"));
	cuEventList.add(new EventList(2,"포인트 2배 이벤트"));
	
	for(EventList clist:cuEventList) {
		System.out.println(clist.number +"." + clist.title);
	}
	
	Scanner sc = new Scanner(System.in);
	int menu=0;
	
	
	while(menu >= 0) {
		for(EventList clist:cuEventList) {
		System.out.print(clist.title +" (" + clist.number +") ");
		}
		System.out.println("뒤로가기 (" + (1 + cuEventList.size())+")");
		menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			new CalcCheck();
			break;
		case 2:
//			new main.events.endEvent.Menu();
			break;
		case 3:
			System.out.println("이벤트 메인으로 이동합니다.	");
			new main.events.Menu();menu=-1;
			break;
		}
		
	}
	sc.close();
	}
}
