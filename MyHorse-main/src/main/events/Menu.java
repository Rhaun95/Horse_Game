package main.events;

import java.util.Scanner;

public class Menu {
	main.events.cuEvent.Menu cuEventMenu = new main.events.cuEvent.Menu();
	main.events.endEvent.Menu endEventMenu = new main.events.endEvent.Menu();
	public static main.events.EventsDao fe= new main.events.EventsDao();
	
	Scanner sc = new Scanner(System.in);
	
	public void run() {
		
		fe.run();
		int menu=0;
		
		
		while(menu >= 0) {
			System.out.println("진행 중인 이벤트(1) 종료된 이벤트(2) 뒤로가기(3)");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				cuEventMenu.run();
				break;
			case 2:
				endEventMenu.run();
				break;
			case 3:
				System.out.println("	메인으로 이동합니다.	");
				menu=-1;
				break;
			}
			
		}
	}
}
