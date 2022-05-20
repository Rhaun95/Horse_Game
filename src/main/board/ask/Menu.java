package main.board.ask;

import java.util.Scanner;

public class Menu extends Ask{
	public Menu() {
		
		Ask ask = new Ask();
		System.out.println("	문의하기 게시판입니다");
		
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		while (menu >= 0) {
			ask.print();
			System.out.println("글쓰기(1)  수정(2)  삭제(3)  뒤로가기(4)");
			menu = sc.nextInt();

			switch (menu) {
			case 1:
				ask.save();
				break;
			case 2:
				ask.editl();
				break;
			case 3:
				ask.remove();
				break;
			case 4:
				System.out.println("	게시판 메인으로 이동합니다.	");
				new main.board.Menu();menu=-1;
				break;
			}
		}
		sc.close();
	}
}

