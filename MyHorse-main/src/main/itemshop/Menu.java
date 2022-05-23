package main.itemshop;

import java.util.Scanner;

public class Menu {
	main.itemshop.item.ItemList itemList = new main.itemshop.item.ItemList();
	main.itemshop.point.Point point = new main.itemshop.point.Point();
//	main.mine.Menu.mDao사용할 것
	
	Scanner sc = new Scanner(System.in);
	
	public void run() {
		int menu=0;
		System.out.println("	아이템샵입니다");
		if (main.mine.Menu.mDao.getcuId() == null) {
			System.out.println("	로그인이 필요한 메뉴입니다.");
			menu = -1;
		}
		
		while(menu >= 0) {
			System.out.println("아이템 목록(1) 포인트 조회/충전(2) 뒤로가기(3)");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				itemList.run();
				break;
			case 2:
				point.run();
				break;
			case 3:
				System.out.println("	메인으로 이동합니다.	");
				menu=-1;
				break;
			}
		}
	}
}
