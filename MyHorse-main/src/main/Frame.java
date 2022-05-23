package main;

import java.util.Scanner;

public class Frame {
	main.mine.Menu mineMenu = new main.mine.Menu();
	main.game.Menu gameMenu = new main.game.Menu();
	main.board.Menu boardMenu = new main.board.Menu();
	main.events.Menu eventsMenu = new main.events.Menu();
	main.ingame.race.Ingame raceMain =new main.ingame.race.Ingame();
	main.itemshop.Menu itemshopMenu = new main.itemshop.Menu();
	
	Scanner sc = new Scanner(System.in);
	
	Frame(){
		System.out.println("#			[Min's Stall]에 오신것을 환영합니다!			    # \n"			
				+ "#		                          메뉴를 선택해주세요		 	            #");
		System.out.println("#___________________________________________________________________________#");
	
	}
	
	public void run(){
		int menu=0;
		
	while(true) {
		System.out.println(" [   내정보(0)   ]  [   경기 정보(1)    ] [    인게임(2)   ] [   게시판(3)   ]  \n    \n        [   아이템샵(4)   ] [    이벤트(5)   ]    [    나가기(6)   ] ");
		menu = sc.nextInt();
		switch(menu) {
		case 0:
			mineMenu.run();
			break;
		case 1:
			gameMenu.run();
			break;
		case 2:
			raceMain.run();
			break;
		case 3:
			boardMenu.run();
			break;
		case 4:
			itemshopMenu.run();
			break;
		case 5:
			eventsMenu.run();
			break;
		case 6:
			System.out.println("	또 오세요.	");
			System.exit(0);
			break;
			}
		}
	}
}
