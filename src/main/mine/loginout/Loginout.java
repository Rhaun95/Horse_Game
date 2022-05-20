package main.mine.loginout;

import java.util.Scanner;

import java.util.Hashtable;
import java.util.Map;


class LogInfo{
	String name;
	int phoneNum;
	String pass;

	public LogInfo(String name, int phoneNum, String pass) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.pass = pass;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof LogInfo) {
			if (((LogInfo) obj).pass.equals(pass))
				return true;
		}
		return false;
	}
}
public class Loginout {
	public Loginout() {
		System.out.println("	로그인 로그아웃 입니다.");
		Map<String, LogInfo> hT2 = new Hashtable<>();
		hT2.put("abc", new LogInfo("홍지성",1213,"1234"));
		hT2.put("bcd", new LogInfo("임지희",1211,"asd"));
		String ident;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("아이디를 입력하세요.");
		ident = "abc";
		if(!hT2.containsKey(ident)) {
			System.out.println("해당하는 아이디가 없습니다.");
		}
		}while(!hT2.containsKey(ident));

		System.out.println("비밀번호를 입력하세요.");
		String pass = sc.next();
		
		System.out.println(hT2.get(ident).pass);
		
		if(hT2.get(ident).equals(new LogInfo(ident, hT2.get(ident).phoneNum, pass))) {
			System.out.println(ident + "로 로그인 되었습니다.");
			//로그인으로 플래그 값 추가할 것
		}
		else 
			System.out.println("비밀번호가 일치하지 않습니다.");
	}
}
