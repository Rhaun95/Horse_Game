package main.events.endEvent;

import java.util.ArrayList;
import java.util.Scanner;
import main.events.EventList;

public class Menu{
	ArrayList<EventList> endEventList = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	public void run() {
		int menu=0;
		endEventList = main.events.Menu.fe.getEndEventList();
		for(EventList elist: endEventList) {
			System.out.println(elist.number +"." + elist.title);
		}
		
	while(menu >= 0) {
//		System.out.println("오픈 기념 이벤트1(1) 오픈 기념 이벤트2(2) 뒤로가기(3)");

		for(EventList eList : endEventList) {
		System.out.print(eList.title +" (" + eList.number +") ");
		}
		System.out.println("뒤로가기 (" + (1 + endEventList.size())+")");
		
		menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			System.out.println("	" + endEventList.get(menu-1).title);
			System.out.println("오픈 기념 포인트 100배 획득 이벤트");
			System.out.println();
			break;
		case 2:
			System.out.println("	" + endEventList.get(menu-1).title);
			System.out.println("오픈 기념 출석체크 이벤트");
			System.out.println();
			break;
		case 3:
			System.out.println("	이전으로 이동합니다.	");
			menu=-1;
			break;
		}
		}
	}
}
