package main.events.cuEvent;

import java.util.ArrayList;
import java.util.Scanner;
import main.events.EventList;

public class Menu{
	ArrayList<EventList> cuEventList = new ArrayList<>();
	
	Scanner sc = new Scanner(System.in);
	DailyCheck dcheck = new DailyCheck();
	public static Point2X p2x = new Point2X();
	
	public void run() {
		int menu=0;
		
		cuEventList = main.events.Menu.fe.getCuEventList();
		
		System.out.println("	진행중인 이벤트 목록");

		for(EventList clist:cuEventList) {
			System.out.println(clist.number +"." + clist.title);
		}
	
	while(menu >= 0) {
//		System.out.println("출석체크 (1), 포인트 2배 이벤트 (2) 뒤로가기 (3)");

		for(EventList clist:cuEventList) {
		System.out.print(clist.title +" (" + clist.number +") ");
		}
		System.out.println("뒤로가기 (" + (1 + cuEventList.size())+")");
		
		menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			dcheck.run();
			break;
		case 2:
			p2x.run();
			break;
		case 3:
			System.out.println("	이전으로 이동합니다.	");
			menu=-1;
			break;
		}
	}
	}
}
