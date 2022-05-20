package main.mine.passSeek;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

class PassInfo extends main.mine.Frame{

	public PassInfo(String name, int phoneNum, String pass) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.pass = pass;
	}
}
public class PassSeek {
	public PassSeek() {
		String ident;
		
		System.out.println("	비밀번호 찾기입니다.");
		Map<String, PassInfo> hT1 = new Hashtable<>();
		hT1.put("abc", new PassInfo("홍지성",1234,"1234"));
		hT1.put("bcd", new PassInfo("임지희",1211,"1653"));

		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("아이디를 입력하세요.");
		ident = "abc";
		if(!hT1.containsKey(ident)) {
			System.out.println("해당하는 아이디가 없습니다.");
		}
		}while(!hT1.containsKey(ident));
		System.out.println("이름을 입력하세요.");
		String name ="홍지성";
		System.out.println("새로운 비밀번호를 입력하세요.");
		String pass = "0000";
		System.out.println("전화번호 뒷 네자리를 입력하세요.");
		System.out.print("010-XXXX-");
		int phoneNum = sc.nextInt();
		
		if(hT1.get(ident).equals(new PassInfo(name,phoneNum,pass))) {
			System.out.println("비밀번호가 변경되었습니다.");
			hT1.replace(ident, new PassInfo(name,phoneNum,pass));
			System.out.println("변경된 비밀번호는: " + hT1.get(ident).pass);
		}
		else {
			System.out.println("정보가 일치하지 않습니다.");
		}
	}
}
