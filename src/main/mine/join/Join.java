package main.mine.join;

import java.util.Scanner;

import java.util.Hashtable;
import java.util.Map;

class JoinInfo extends main.mine.Frame {
	public JoinInfo(String name, int phoneNum,String pass) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.pass = pass;
	}
}

public class Join {
	public Join() {
		String ident;
		
		System.out.println("	회원가입 페이지입니다.");
		Map<String, JoinInfo> hT1 = new Hashtable<>();
		hT1.put("abc", new JoinInfo("홍지성",1213,"1234"));
		hT1.put("bcd", new JoinInfo("임지희",1211,"1653"));
		System.out.println("현재"+hT1.size()+"명의 회원이 있습니다.");

		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("아이디를 입력하세요.");
		ident = "ab";
		if(hT1.containsKey(ident)) {
			System.out.println("이미 사용중인 아이디입니다.");
		}
		}while(hT1.containsKey(ident));
			
		System.out.println("이름을 입력하세요.");
		String name = "김의진";
		System.out.println("비밀번호를 입력하세요.");
		String pass = "2580";
		System.out.println("전화번호 뒷 네자리를 입력하세요.");
		int phoneNum = sc.nextInt();

		hT1.put(ident, new JoinInfo(name,phoneNum,pass)); //아이디 생성
		System.out.println(ident + "아이디가 생성되었습니다.");
		System.out.println("이름: "+ name + ", 비밀번호: " + pass + ", 전화번호 뒷 4자리: " + phoneNum);
		
	}
}
