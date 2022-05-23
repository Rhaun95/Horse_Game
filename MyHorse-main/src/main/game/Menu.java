package main.game;

import java.util.Scanner;

public class Menu {
	main.game.foresee.Foresee foresee = new main.game.foresee.Foresee();
	main.game.horses.Horses horses = new main.game.horses.Horses();
	main.game.record.Record record = new main.game.record.Record();
	main.game.gambling.Gambling gambling = new main.game.gambling.Gambling();
	
	Scanner sc = new Scanner(System.in);
	
	public void run() {
		int menu=0;
		foresee.run();
		
		while(menu >= 0) {
			System.out.println("[   경기 정보(0)   ]  [   출전마 정보(1)    ] [    경기 기록(2)   ] [   배팅 정보(3)    ] [    뒤로가기(4)   ]  ");
			menu = sc.nextInt();
			switch(menu) {
			case 0:
				foresee.run();
				break;
			case 1:
				horses.run();
				break;
			case 2:
				record.run();
				break;
			case 3:
				gambling.run();
				break;
			case 4:
				System.out.println("#___________________________________________________________________________#");
				System.out.println("#	                        ***메인으로 이동합니다.***	                    #");
				System.out.println("#___________________________________________________________________________#");
				menu=-1;
				break;
			}
		}
	}
}
