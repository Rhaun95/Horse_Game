package main.events;

import java.util.Scanner;

public class Menu {
	public Menu() {
		new main.events.FullEvent();
		
		Scanner sc = new Scanner(System.in);
		int menu=0;
		
		
		while(menu >= 0) {
			System.out.println("진행 중인 이벤트(1) 종료된 이벤트(2) 뒤로가기(3)");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				new main.events.cuEvent.Menu();menu=-1;
				break;
			case 2:
				new main.events.endEvent.Menu();menu=-1;
				break;
			case 3:
				System.out.println("	메인으로 이동합니다.	");
				new main.Menu();menu=-1;
				break;
			}
			
		}
		sc.close();
	}
}
