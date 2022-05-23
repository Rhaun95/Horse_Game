package main.events.cuEvent;

import java.text.SimpleDateFormat;
import java.util.Date;

class CalcDay {
	int year = 2020;
	int month = 1;
	int day = 1;
	int dayOfW = 3;
	int dmax;
	int dateInt=0;
	int tmp;
	int yearI;
	int monthI;
	
	private static CalcDay instance = new CalcDay();
	
	public CalcDay() {
		Date today = new Date();
		SimpleDateFormat format1 = new SimpleDateFormat("yyyyMMdd");
		String dateString = format1.format(today).toString();
		dateInt = Integer.parseInt(dateString);
		
		yearI = dateInt / 10000;
		monthI = (dateInt / 100) % 100;

		getCalender(yearI, monthI);
		System.out.println();
	}
	
	public void getCalender(int year, int month) {
		tmp = 0;
		int k = 13;
		for (int i = this.year; i <= year; i++) {
			k = (i == yearI) ? month : 13;
			for (int j = 1; j < k; j++) {
				switch (j) {
				case 1: case 3: case 5: case 7: case 8: case 10: case 12:
					tmp += 31;
					dmax = 31;
					break;
				case 4: case 6: case 9: case 11:
					tmp += 30;
					dmax = 30;
					break;
				case 2:
					dmax = (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) ? 29 : 28;
					tmp += dmax;
					break;
				}
			}
		}
		dayOfW = (dayOfW + tmp) % 7;
	}
		public void showCalender() {
		//출력
		System.out.println("========== " + yearI + "년 " + monthI + "월 ==========");
		System.out.println("ㅤ 일ㅤ 월ㅤ 화ㅤ 수ㅤ 목ㅤ 금ㅤ 토ㅤ");
		int j;
		for (j = 0; j < dayOfW; j++) {
			System.out.print("  "+ "▩" + " "); //
		}
		for (int i = 1; i <= dmax; i++) {
			if (i < 10) {
				System.out.print("  " + i + " ");
			} else
				System.out.print(" " + i + " ");
			if ((dayOfW + i) % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}
	public static CalcDay getInstance() {
		return instance;
	}
	public int getDateInt() {
		return dateInt;
	}
}

public class DailyCheck {

	public void run() {
		int multiplyer = main.events.cuEvent.Menu.p2x.getMultiple((CalcDay.getInstance().getDateInt()));		//event2 연동
		if(CalcDay.getInstance().getDateInt() %2 != 0)
		System.out.println(" ※" + multiplyer + "배 획득이벤트 진행중");
	
		int getPoint = 500;
		int pointTotal = getPoint*multiplyer;
		
		System.out.println("	출석체크 이벤트");
		// 분기 추가 및 포인트 증가
		try {
			if (main.mine.Menu.mDao.getDcheck() == false) {
				CalcDay.getInstance().showCalender();
				main.mine.Menu.mDao.setPoint(main.mine.Menu.mDao.getPoint() + pointTotal);
				main.mine.Menu.mDao.setDcheck(true);// 출석체크 플래그
				System.out.println("출석 체크를 완료하였습니다. +" + pointTotal);
			} else
				System.out.println("이미 출석 체크를 완료하였습니다.");
		} catch (NullPointerException e) {	//NullPointerException처리
			System.out.println("	로그인이 필요한 메뉴입니다.");
		}finally {
			int todayI = CalcDay.getInstance().getDateInt();
			System.out.println("=== 오늘은 " + todayI/10000 + "-" + (todayI/100)%100 + "-" + (todayI)%100 + " 입니다. ===");
		}
	}
}
