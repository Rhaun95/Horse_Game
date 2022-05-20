package main.mine.withdraw;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

class WithdrawInfo extends main.mine.Frame {
	public WithdrawInfo(String name, int phoneNum,String pass) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.pass = pass;
	}
}

public class Withdraw {
	public Withdraw() {
		String name="";
		String pass="";
		String ident="";
		int phoneNum=0;
		
		System.out.println("	회원탈퇴 페이지입니다.");
		Map<String, WithdrawInfo> hT3 = new Hashtable<>();
		hT3.put("abc", new WithdrawInfo("홍지성",1213,"1234"));
		hT3.put("bcd", new WithdrawInfo("임지희",1211,"1653"));
		System.out.println(hT3.size());
		
		Scanner sc = new Scanner(System.in);
		
		while(!hT3.containsKey(ident)) {
		System.out.println("아이디를 입력하세요.");
		ident = "abc";
		if(!hT3.containsKey(ident)) {
			System.out.println("아이디가 일치하지 않습니다.");
		}
		}
		while(hT3.get(ident).name.compareTo(name) != 0) {
		System.out.println("이름을 입력하세요.");
		name = "홍지성";
		}
		while(hT3.get(ident).pass.compareTo(pass) != 0) {
		System.out.println("비밀번호를 입력하세요.");
		pass = "1234";
		}
		while(Integer.compare(hT3.get(ident).phoneNum,phoneNum) != 0) {
		System.out.println("전화번호 뒷 네자리를 입력하세요.");
		phoneNum = 1213;
		}

		System.out.println("회월 탈퇴시 모든 재화는 소멸하며 복구되지 않습니다.");
		System.out.println("정말 회원탈퇴 하시겠습니까?");
		System.out.println("네(1) 아니오(2)");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			System.out.println("회원탈퇴 중입니다.");
			hT3.remove(ident); //아이디 삭제
			System.out.println(ident + " 아이디의 탈퇴 처리가 완료되었습니다.");
			System.out.println();
			break;
		case 2:
			System.out.println("취소하였습니다.");
			System.out.println();
			break;
		default:
			System.out.println("잘못 입력하였습니다.");
			System.out.println();
			break;
			}
	}
}
