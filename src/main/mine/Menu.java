package main.mine;

import java.util.Scanner;

public class Menu {
	boolean loginFlag=false;
	public Menu() {
		Scanner sc = new Scanner(System.in);
		int menu=0;
		
		while(menu >= 0) {
			if(!loginFlag) {
				System.out.println("로그인이 필요한 메뉴입니다.");
				System.out.println("회원가입(1) 로그인(2) 비밀번호 찾기(3) 뒤로가기(4) 임시-탈퇴(5)");
			}else {
				System.out.println("아이디 : " + "abc");
				System.out.println("내정보(1) 로그아웃(2) 탈퇴(3) 뒤로가기(4)");
			}
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				new main.mine.join.Join();
//								
				break;
			case 2:
				new main.mine.loginout.Loginout();
//				new main.mine.
				break;
			case 3:
				//(loginFlag)? 
				//new main.mine.withdraw.Withdraw(); 
				new main.mine.passSeek.PassSeek();
				break;
			case 4:
				System.out.println("	메인으로 이동합니다.	");
				new main.Menu();menu=-1;
				break;
			case 5:
				new main.mine.withdraw.Withdraw();
				break;	
			}
		}
		sc.close();
	}
}
