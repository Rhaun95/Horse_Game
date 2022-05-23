package main.itemshop.point;

import java.util.Scanner;

public class Point {
	public void run() {
		int point = main.mine.Menu.mDao.getPoint(); 
		Scanner sc = new Scanner(System.in); 
		
		for(int i=0;i<100;i++) {// 사용자가 원하는 만큼 횟수를 반복해야 하므로 반복문 사용
			System.out.println("원하시는 메뉴를 선택해주세요");
			System.out.println("포인트조회(1), 포인트충전(2) 종료(3)");
			
			int choice=sc.nextInt(); // 사용자로부터 번호를 입력받기 위한 choice 변수
			
			// 캐쉬조회
			if(choice==1) {
				System.out.println("현재 포인트는 "+ point +"포인트 입니다");
			}
			//캐쉬충전
			if(choice==2) {
				System.out.println("얼마를 충전하시겠습니까?");
				int insertPoint=sc.nextInt(); // 사용자가 입금할 금액 
				point+=insertPoint;
				main.mine.Menu.mDao.setPoint(point);
				System.out.println(insertPoint + "포인트가 충전되었습니다.");
			}
			// 종료 
			if(choice==3) {
				System.out.println("다음에 또 다시 이용해주세요");
				break;
			} 
		}
	}
}
