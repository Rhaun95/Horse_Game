package main.mine.loginout;

import java.util.Scanner;

import main.mine.Frame;

import java.util.Hashtable;
import java.util.Map;

public class Loginout {
	Map<String, Frame> hT2 = new Hashtable<>();
	public Loginout() {
	}
	public void run(){
		hT2 =  main.mine.Menu.mDao.getmineDao();
		String ident;
		Scanner sc = new Scanner(System.in);
		
		if( main.mine.Menu.mDao.getcuId() != null) {
			System.out.println("	로그아웃 하시겠습니까?");
			System.out.println("네(1) 아니오(2)");
			if(sc.nextInt() == 1) {
				main.mine.Menu.mDao.setcuId("");
				System.out.println("	로그아웃 되었습니다");
			}
			else
			System.out.println("취소하였습니다.");
		}
		else {
		System.out.println("	로그인 입니다.");

		do {
		System.out.println("아이디를 입력하세요.");
		ident = sc.nextLine();
		if(!hT2.containsKey(ident)) {
			System.out.println("해당하는 아이디가 없습니다.");
		}
		}while(!hT2.containsKey(ident));

		System.out.println("비밀번호를 입력하세요.");
		String pass = sc.nextLine();
		
		if(hT2.get(ident).pass.compareTo(pass) == 0) {
			System.out.println(ident + "로 로그인 되었습니다.");
			 main.mine.Menu.mDao.setcuId(ident);;//로그인 아이디 정보 저장
		}
		else 
			System.out.println("비밀번호가 일치하지 않습니다.");
	}
		}
}
