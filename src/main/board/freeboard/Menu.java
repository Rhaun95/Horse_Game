package main.board.freeboard;

import java.util.Scanner;

public class Menu extends Freeboard{
	public Menu() {

		Scanner sc = new Scanner(System.in);
		int menu = 0;
		while (menu >= 0) {
			print();
			System.out.println("글쓰기(1)  수정(2)  삭제(3)  뒤로가기(4)");
			menu = sc.nextInt();

			switch (menu) {
			case 1:
				save();
				break;
			case 2:
				editl();
				break;
			case 3:
				remove();
				break;
			case 4:
				System.out.println("	게시판 메인으로 이동합니다.	");
				new main.board.Menu();menu=-1;
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			}
		}
		sc.close();
	}
}
