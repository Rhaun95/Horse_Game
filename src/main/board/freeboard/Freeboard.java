package main.board.freeboard;

import java.util.ArrayList;
import java.util.Scanner;

public class Freeboard {
	ArrayList<String> titel = new ArrayList<String>();
	ArrayList<String> inhalt = new ArrayList<String>();
	ArrayList<String> writer = new ArrayList<String>();
	ArrayList<String> number = new ArrayList<String>();
	ArrayList<ArrayList<String>> main = new ArrayList<ArrayList<String>>();

	Scanner sc = new Scanner(System.in);
	
	//메뉴화면
	public Freeboard() {
		main.add(titel);
		main.add(inhalt);
		main.add(writer);
		main.add(number);
		
		titel.add("제목			");
		inhalt.add("내용			");
		writer.add("글쓴이			");
		number.add("번호			");
	}
	
	//내용 저장: 매개변수인 문자열들을 각각의 맞는 arrayList에 추가
	void save() {
		this.titel.add(getTitel());
		this.inhalt.add(getInhalt());
		this.writer.add(getWriter());
		this.number.add(getNumber());
	}
	
	String getTitel() {
		System.out.println("제목: ");
		return sc.nextLine();
	}
	String getInhalt(){
		System.out.println("내용: ");
		return sc.nextLine();
	}
	String getWriter() {
		System.out.println("글쓴이: ");
		return sc.nextLine();
	}
	String getNumber() {
		int size = main.get(0).size()-2;
		String nr = Integer.toString(++size);
		return nr;
	}
	
	//전체 조회
	void print() {	
		/*j와 i의 순서를 바꾼 이유:
		 보통의 순서로 할 경우 왼쪽부터 첫줄에 메뉴바가 생기고 오른쪽 방향으로 순서대로 각 부분의 내용이 출력된다.
		 나는 행마다 각각의 부분이 출력되길 원해서 바꾸었다.
		  */
		for(int j = 0; j<main.get(0).size(); j++) {
			for(int i = 0; i<main.size(); i ++)
			System.out.print(main.get(i).get(j) + " ");
			System.out.println();
			}
		System.out.println();
		
	}
	void editl() {
		System.out.println("몇번 게시물을 수정하시겠습니까?");
		int z = sc.nextInt();
		titel.remove(z);	// 수정 필요
		
	}
	
	void remove() {
		System.out.println("몇번 게시물을 삭제하시겠습니까?");
		int z = sc.nextInt();
		titel.remove(z);
		
	}
	
	void exit() {
		System.out.println("메인으로 이동합니다.");
		System.exit(0);
	}
}
