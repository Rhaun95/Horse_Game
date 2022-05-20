package itemshop;

import java.util.Scanner;

public class ltemlist {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Item_1 item1 = new Item_1("스피드  ", 10 );
		Item_1 item2 = new Item_1("스테미나  ", 100);
		Item_1 item3 = new Item_1("공격력  ", 200);
		Item_1 item4 = new Item_1("경험치  ", 300);
	
		
		int choiceMainMenu = 0;
		
		while(choiceMainMenu >= 0) {
		// 아이템샵 메인
		System.out.println(" 1.  아이템샵 ");
		System.out.println(" 2.  캐시충전 및 조회 ");
		System.out.println("=============");
		System.out.println(" 번호를 입력해주세요. ");
		choiceMainMenu = sc.nextInt();

		// 아이템 목록
		int itemListChoice = 0;
		while(choiceMainMenu >= 0) {
		System.out.println();
		System.out.println(" 1.  스피드 업 ");
		System.out.println(" 2.  스테미나 업 ");
		System.out.println(" 3.  공격력 업 ");
		System.out.println(" 4.  경험치 업 ");
		System.out.println(" 번호를 입력해주세요. ");
		itemListChoice = sc.nextInt();
		sc = new Scanner(System.in);
		
		int buyYN1 = 0;
		int buyYN2 = 0;
		int buyYN3 = 0;
		int buyYN4 = 0;
		
		switch(itemListChoice) {
		
		case 1:
			System.out.println( item2.getName() + item2.getPrice() + "증가합니다." + item2.getPrice() + "원 입니다.");
			System.out.println("- 구매여부를 입력해주세요. (1.구매하기 2.뒤로가기) >> ");
			buyYN1 =  sc.nextInt();
			switch(buyYN1) {
			
			case 1:
				// 구매
				System.out.println("구매가 되었습니다.");
				System.out.println();
				break;
			case 2:
				// 뒤로가기
				 break;
			} 
			
		
		case 2:
			System.out.println( item2.getName() + item2.getPrice() + "증가합니다." + item2.getPrice() + "원 입니다.");
			System.out.println("- 구매여부를 입력해주세요. (1.구매하기 2.뒤로가기) >> ");
			buyYN2 =  sc.nextInt();
			switch(buyYN2) {	
			
			case 1:
				// 구매
				System.out.println("구매가 되었습니다.");
				System.out.println();
				break;
			case 2:
				// 뒤로가기
				break;
			} 
			break;
			
		case 3:
			System.out.println( item2.getName() + item2.getPrice() + "증가합니다." + item2.getPrice() + "원 입니다.");
			System.out.println("- 구매여부를 입력해주세요. (1.구매하기 2.뒤로가기) >> ");
			buyYN3 =  sc.nextInt();
			switch(buyYN3) {
			
			case 1:
				// 구매 
				System.out.println("구매가 되었습니다.");
				System.out.println();
				break;
			case 2:
				// 뒤로가기
				break;
			} 
			break;
			
		case 4:
			System.out.println( item2.getName() + item2.getPrice() + "증가합니다." + item2.getPrice() + "원 입니다.");
			System.out.println("- 구매여부를 입력해주세요. (1.구매하기 2.뒤로가기) >> ");
			buyYN4 =  sc.nextInt();
			switch(buyYN4) {
			
			case 1:
				// 구매
				System.out.println("구매가 되었습니다.");
				System.out.println();
				break;
			case 2:
				// 뒤로가기		
				break;
		}
			break;
				}
		
		}
		}
		
	}
		}
