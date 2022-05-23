package main.board.ask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class AskList{
		String titel;
		String inhalt;
		String writer;
		int num;
		AskList(){
			titel = "제목	";
			inhalt = "내용";
			writer = "글쓴이";
			num = 0;
		}
		AskList(String titel, String inhalt, String writer, int num){
			this.titel = titel;
			this.inhalt = inhalt;
			this.writer = writer;
			this.num = num;
		}	// 정리 필요
		public String getTitel() {
			return titel;
		}
		public void setTitel(String titel) {
			this.titel = titel;
		}
		public String getInhalt() {
			return inhalt;
		}
		public void setInhalt(String inhalt) {
			this.inhalt = inhalt;
		}
		public String getWriter() {
			return writer;
		}
		public void setWriter(String writer) {
			this.writer = writer;
		}
		public int getNum() {
			return num;
		}
		public void setNum(int num) {
			this.num = num;
		}
		public void showList(int index) {
			if(writer == null) 
				writer = "비회원";
			if(index == 0) {
			System.out.println("번호	"+ titel +"	"+ writer);
			}
			else {
			System.out.println(index +"	"+ titel +"		"+ writer);
			System.out.println("   내용: "+ inhalt);
			}
		}
}

public class Ask {

	Scanner sc = new Scanner(System.in);
	AskList askL = new AskList();
	List<AskList> askList = new ArrayList<>();
	AskDao aDao = new AskDao();
			
	String writer = main.mine.Menu.mDao.getcuId();
	
	
	public Ask() {
		for(int i = 0; i<aDao.getAskList().size(); i++) {
		askList.add(aDao.getAskList().get(i));
		}
	}
	
	void save() {
		askList.add(new AskList(getTitel(),getInhalt(), writer, askList.size()));
		aDao.setAskList(askList);
	}
	
	String getTitel() {
		System.out.println("제목: ");
		String titel = sc.nextLine();
		return titel;
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
		return Integer.toString(askList.size());
	}
	
	void print() {	
		askList.get(0).showList(0);
		for(int i = askList.size()-1 ; i>0; i--) {
			askList.get(i).showList(i);
		}
		System.out.println();
	}
	void editl() {
		System.out.println("몇번 게시물을 수정하시겠습니까?");
		int z = sc.nextInt();
		sc.nextLine();
		if(z<askList.size()) {	//IOBException 방지
		askList.get(z).setTitel(getTitel());
		askList.get(z).setInhalt(getInhalt());
		askList.get(z).showList(z);
		System.out.println();
		aDao.setAskList(askList);
		}
		else
		System.out.println("잘못입력하였습니다.");
		System.out.println();
	}
	
	void remove() {
		System.out.println("몇번 게시물을 삭제하시겠습니까?");
		int z = sc.nextInt();
		if(z<askList.size()) {	//IOB 방지
		askList.remove(z);
		aDao.setAskList(askList);
		}
		else
		System.out.println("잘못입력하였습니다.");
		System.out.println();
	}
	
	void exit() {
		System.out.println("메인으로 이동합니다.");
		System.exit(0);
	}
}
