package main;

import java.util.Scanner;

public class Frame {
	Frame(){
		Scanner sc = new Scanner(System.in);
		int menu=0;
			System.out.println("xxx에 오신 걸 환영합니다.");
			System.out.println("메뉴를 선택해주세요");
	while(menu >= 0) {
		System.out.println("내정보(0) 경기 정보(1) 게시판(2) 이벤트(3) 인게임(4) 나가기(5)");
		menu = sc.nextInt();
		switch(menu) {
		case 0:
			new main.mine.Menu();menu=-1;
			break;
		case 1:
			new main.game.Menu();menu=-1;
			break;
		case 2:
			new main.board.Menu();menu=-1;
			break;
		case 3:
			new main.events.Menu();menu=-1;
			break;
		case 4:
			new main.ingame.race.Main();menu=-1;
			break;
		case 5:
			System.out.println("	또 와주세요.	");menu=-1;
			System.exit(0);
			break;
			}
		}
	}
}

