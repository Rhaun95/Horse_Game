package main.board;

import java.util.Scanner;

public class Menu {
	public Menu() {
		System.out.println("	게시판 입니다.");
		
		Scanner sc = new Scanner(System.in);
		int menu=0;
		
		while(menu >= 0) {
			System.out.println("자유 게시판(1) Q&A(2) 문의 게시판(3) 뒤로가기(4)");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				new main.board.freeboard.Menu();menu=-1;
				break;
			case 2:
				new main.board.qna.QNA().print();
				break;
			case 3:
				new main.board.ask.Menu();menu=-1;
				break;
			case 4:
				System.out.println("	메인으로 이동합니다.	");
				new main.Menu();menu=-1;
				break;
			}
		}
		sc.close();
	}
}
