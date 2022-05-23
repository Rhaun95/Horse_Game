package main.mine;

import java.util.Scanner;

public class Menu {
	main.mine.join.Join join = new main.mine.join.Join();
	main.mine.loginout.Loginout loginout = new main.mine.loginout.Loginout();
	main.mine.passSeek.PassSeek passSeek = new main.mine.passSeek.PassSeek();
	main.mine.withdraw.Withdraw withdraw = new main.mine.withdraw.Withdraw();
	main.mine.myInfo.MyInfo myInfo = new main.mine.myInfo.MyInfo();
	public static MineDao mDao = new MineDao();
	
	Scanner sc = new Scanner(System.in);
	
	public void run() {
		int menu=0;
		while(menu >= 0) {
			if(mDao.getcuId() == null) {
				System.out.println("로그인이 필요한 메뉴입니다.");
				System.out.println("회원가입(1) 로그인(2) 비밀번호 찾기(3) 뒤로가기(4)");
			}else {
				System.out.println("아이디 : " + mDao.getcuId());	// 수정필요
				System.out.println("내정보(1) 로그아웃(2) 탈퇴(3) 뒤로가기(4)");
			}
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				if(mDao.getcuId() == null)
				join.run();
				else
				myInfo.run();
				break;
			case 2:
				loginout.run();
				break;
			case 3:
				if(mDao.getcuId() == null)
				passSeek.run();
				else
				withdraw.run();
				break;
			case 4:
				System.out.println("	메인으로 이동합니다.	");
				menu=-1;
				break;
			}
		}
	}
}
