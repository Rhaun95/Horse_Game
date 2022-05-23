package main.itemshop.item;

import java.util.ArrayList;
import java.util.Scanner;

class Item_1 {	
	String item;
	String Stat;
	int price;
	
	ArrayList<Item_1> list = new ArrayList<Item_1>();
	Scanner sc = new Scanner(System.in);
	
	public Item_1(String item1, String Stat, int price) {
		this.item = item1;
		this.Stat = Stat;
		this.price = price;
	}
	
	public String getName() {
		return this.item;
	}
	
	
	public int getPrice() {
		return this.price;
	}
	
	public String getStat() {
		return this.Stat;
	}
	
	public void print() {
		for (int i=0; i<list.size(); i++) {
			System.out.println("이름 " + list.get(i).getName() + list.get(i).getStat()+"가격: " + list.get(i).getPrice()  + "포인트 입니다");
		}
	} 
	
	public Item_1() {	
		// 아이템 이름, 효과, 가격
		Item_1 item1 = new Item_1("스피드  ", "스피드가 10 증가합니다.",  10);
		Item_1 item2 = new Item_1("스테미나  ", "스테미나가 20 증가합니다.",  100);
		Item_1 item3 = new Item_1("공격력  ", "공격력이 20 증가합니다.",  200);
		Item_1 item4 = new Item_1("경험치  ", "경험치가 100 증가합니다.", 300);
	}
}
public class ItemList {
	String item;
	String Stat;
	int price;

	ArrayList<Item_1> list = new ArrayList<Item_1>();
	Item_1 i = new Item_1();
	Scanner sc = new Scanner(System.in);
	
	public ItemList() {

	}

	public void Item_1(String item, String Stat, int price) {
		this.item = item; // 이름
		this.Stat = Stat; // 효과
		this.price = price; // 가격

	}

	public String getName() {
		return this.item;
	}

	public String getStat() {
		return this.Stat;
	}

	public int getPrice() {
		return this.price;
	}

	public void print() {

		for (int i = 0; i < list.size(); i++) {
			System.out.println("유저1 " + list.get(i).getStat());
		}
	}

	public void Item_1() {
		// // 아이템 이름, 효과, 가격
		// Item_1 item1 = new Item_1("스피드 ", "스피드가 10 증가합니다.", 10);
		// Item_1 item2 = new Item_1("스테미나 ", "스테미나가 20 증가합니다.", 100);
		// Item_1 item3 = new Item_1("공격력 ", "공격력이 20 증가합니다.", 200);
		// Item_1 item4 = new Item_1("경험치 ", "경험치가 100 증가합니다.", 300);
	}

	public ArrayList<Item_1> getList() {
		return this.list;
	}
	public void getItem(Item_1 item, int price) {
		int point = main.mine.Menu.mDao.getPoint();
		if(point<price)
		System.out.println("포인트가 부족합니다.");
		else {
			System.out.println("구매가 완료 되었습니다.");
			i.list.add(item);
			i.print();
			main.mine.Menu.mDao.setPoint(point - price);
		}
	}
	
	public void run() {
		// 아이템 이름, 효과, 가격
		Item_1 item1 = new Item_1("스피드  ", "스피드가 10 증가합니다.", 1000);
		Item_1 item2 = new Item_1("스테미나 ", "스테미나가 20 증가합니다.", 1000);
		Item_1 item3 = new Item_1("공격력  ", "공격력이 20 증가합니다.", 2000);
		Item_1 item4 = new Item_1("경험치  ", "경험치가 100 증가합니다.", 3000);

			System.out.println("★★★★★★★★★★★★");
			System.out.println("★         아이템샵       ★");
			
			System.out.println("★★★★★★★★★★★★");

			int itemListChoice = 0;
			while (itemListChoice >= 0) {
				// 아이템 목록
				System.out.println(" 번호를 입력해주세요. ");
				System.out.println(" 1.  스피드 업 ");
				System.out.println(" 2.  스테미나 업 ");
				System.out.println(" 3.  공격력 업 ");
				System.out.println(" 4.  경험치 업 ");
				System.out.println(" 5.  뒤로가기 ");
				itemListChoice = sc.nextInt();

				switch (itemListChoice) {

				case 1:
					System.out.println(item1.getName() + item1.getStat() + "  " + item1.getPrice() + "포인트 입니다.");
					System.out.println("- 구매여부를 입력해주세요. (1.구매하기 2.뒤로가기) >> ");
					int buyYN1 = 0;
					buyYN1 = sc.nextInt();
					switch (buyYN1) {
					case 1:
						// 구매
						getItem(item1, item1.getPrice());
						System.out.println();
						break;
					case 2:
						// 뒤로가기
						break;
					}
					break;

				case 2:
					System.out.println(item2.getName() + item2.getStat() + "  " + item2.getPrice() + "포인트 입니다.");
					System.out.println("- 구매여부를 입력해주세요. (1.구매하기 2.뒤로가기) >> ");
					int buyYN2 = 0;
					buyYN2 = sc.nextInt();
					switch (buyYN2) {
					case 1:
						// 구매
						getItem(item2, item2.getPrice());
						System.out.println();
						break;
					case 2:
						// 뒤로가기
						break;
					}
					break;

				case 3:
					System.out.println(item3.getName() + item3.getStat() + "  " + item3.getPrice() + "포인트 입니다.");
					System.out.println("- 구매여부를 입력해주세요. (1.구매하기 2.뒤로가기) >> ");
					int buyYN3 = 0;
					buyYN3 = sc.nextInt();
					switch (buyYN3) {
					case 1:
						// 구매
						getItem(item3, item3.getPrice());
						System.out.println();
						break;
					case 2:
						// 뒤로가기
						break;
					}
					break;

				case 4:
					System.out.println(item4.getName() + item4.getStat() + "  " + item4.getPrice() + "포인트 입니다.");
					System.out.println("- 구매여부를 입력해주세요. (1.구매하기 2.뒤로가기) >> ");
					int buyYN4 = 0;
					buyYN4 = sc.nextInt();
					switch (buyYN4) {
					case 1:
						getItem(item4, item4.getPrice());// 포인트확인
						System.out.println();
						break;
					case 2:
						// 뒤로가기
						break;
					}
					break;
				case 5:
					itemListChoice=-1;
					break;
			}
		}
	}
}
