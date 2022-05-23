package main.board.free;

import java.util.Scanner;

public class Menu extends Free{
	Scanner sc = new Scanner(System.in);

	public void run() {
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
				System.out.println("	메인으로 이동합니다.	");
				menu = -1;
				break;
			}
		}
	}
}
