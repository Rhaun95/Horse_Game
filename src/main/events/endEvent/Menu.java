package main.events.endEvent;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu extends EndEvent{
	public Menu() {
		
		ArrayList<EventList> endEventList = new ArrayList<>();
		endEventList.add(new EventList(1,"오픈 기념 이벤트1"));
		endEventList.add(new EventList(2,"오픈 기념 이벤트2"));
		
		for(EventList elist:endEventList) {
			System.out.println(elist.number +"." + elist.title);
		}
		
			Scanner sc = new Scanner(System.in);
			int menu=0;
	
	
	while(menu >= 0) {
		for(EventList eList : endEventList) {
		System.out.print(eList.title +" (" + eList.number +") ");
		}
		System.out.println("뒤로가기 (" + (1 + endEventList.size())+")");
		menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			System.out.println("	오픈 기념 이벤트1");
			System.out.println("오픈 기념 포인트 10배 획득 이벤트");
			System.out.println();
			break;
		case 2:
			System.out.println("	오픈 기념 이벤트2");
			System.out.println("오픈 기념 출석체크 이벤트");
			System.out.println();
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
