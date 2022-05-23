package main.board.ask;

import java.util.Scanner;

public class Menu{
	Scanner sc = new Scanner(System.in);
	Ask ask = new Ask();
	
	public void run() {
		int menu = 0;
		System.out.println("	문의하기 게시판입니다");
		
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
				System.out.println("	메인으로 이동합니다.	");
				menu=-1;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			}
		}
	}
}

