package main.board;

import java.util.Scanner;

public class Menu {
	Scanner sc = new Scanner(System.in);
	int menu2=0;
	
	main.board.free.Menu freeMenu = new main.board.free.Menu();
	main.board.qna.QNA qna = new main.board.qna.QNA();
	main.board.ask.Menu askMenu = new main.board.ask.Menu();
	
	public void run() {
		menu2 = 0;
		System.out.println("	게시판 입니다.");

		while(menu2 >= 0) {
			System.out.println("자유 게시판(1) Q&A(2) 문의 게시판(3) 뒤로가기(4)");
			menu2 = sc.nextInt();
			
			switch(menu2) {
			case 1:
				freeMenu.run();
				break;
			case 2:
				qna.print();
				break;
			case 3:
				askMenu.run();
				break;
			case 4:
				System.out.println("	메인으로 이동합니다.	");
				menu2=-1;
				break;
			}
		}
	}
}
