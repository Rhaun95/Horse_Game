package main.mine.passSeek;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

import main.mine.Frame;

public class PassSeek {
	Map<String, Frame> hT1 = new Hashtable<>();
	public PassSeek() {
	}
	public void run(){
		hT1 =  main.mine.Menu.mDao.getmineDao();
		
		String ident;
		System.out.println("	비밀번호 찾기입니다.");

		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("아이디를 입력하세요.");
		ident = sc.nextLine();
		if(!hT1.containsKey(ident)) {
			System.out.println("해당하는 아이디가 없습니다.");
		}
		}while(!hT1.containsKey(ident));
		System.out.println("이름을 입력하세요.");
		String name =sc.nextLine();
		System.out.println("새로운 비밀번호를 입력하세요.");
		String pass = sc.nextLine();
		System.out.println("전화번호 뒷 네자리를 입력하세요.");
		System.out.print("010-XXXX-");
		int phoneNum = sc.nextInt();
		
		if(hT1.get(ident).equals(new Frame(name,phoneNum,pass))) {
			System.out.println("비밀번호가 변경되었습니다.");
			hT1.replace(ident, new Frame(name,phoneNum,pass));
			main.mine.Menu.mDao.setmineDao(hT1);
			System.out.println("변경된 비밀번호는: " + hT1.get(ident).pass);
		}
		else {
			System.out.println("정보가 일치하지 않습니다.");
		}
	}
}
