package main.events.cuEvent;

import java.text.SimpleDateFormat;
import java.util.Date;

class CalcDay {
	int year = 2020;
	int month = 1;
	int day = 1;
	int dayOfW = 3;
	int dmax;
	
	private static CalcDay instance = new CalcDay();
	
	private CalcDay() {
		Date today = new Date();
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat format2 = new SimpleDateFormat("yyyyMMdd");
		String dataString = format2.format(today).toString();
		int dateInt = Integer.parseInt(dataString);
		
		int year = dateInt / 10000;
		int month = (dateInt / 100) % 100;
		int day = dateInt % 100;

		getCalender(year, month, day);
		System.out.println("오늘은 " + format1.format(today) + "입니다.");
		System.out.println();
	}
	
	private void getCalender(int year, int month, int day) {
		int tmp = 0;
		int k = 13;
		for (int i = this.year; i <= year; i++) {
			k = (i == year) ? month : 13;
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
		//출력
		System.out.println("========== " + year + "년 " + month + "월 ==========");
		System.out.println("ㅤ 일ㅤㅤ월ㅤㅤ화ㅤㅤ수ㅤㅤ목ㅤㅤ금ㅤㅤ토ㅤㅤ");
		int j;
		for (j = 0; j < dayOfW; j++) {
			System.out.print("  ✨　"); //
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
		System.out.print("출석 체크를 완료하였습니다.");
	}
	public static CalcDay getInstance() {
		return instance;
	}
}

public class CalcCheck {
	CalcCheck() {
		System.out.println("	출석체크 이벤트");
		CalcDay.getInstance();
	}
}
