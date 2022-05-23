package main.board.qna;

import java.util.Scanner;
import java.util.Vector;

class QNAList{
	String titel;
	String inhalt;
	String writer;
	int num;
	
	QNAList(){
		titel = "제목";
		inhalt = "내용";
		writer = "글쓴이";
		num = 0;
	}
	QNAList(String titel, String inhalt, String writer, int num){
		this.titel = titel;
		this.inhalt = inhalt;
		this.writer = writer;
		this.num = num;
	}
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
		if(index == 0) {
		System.out.println("번호	"+ titel +"		"+ writer);
		}
		else {
		System.out.println(index +"	"+ titel +"		"+ writer);
		System.out.println("    내용: "+ inhalt);
		}
	}
}

public class QNA {
	String writer = "abc";
	
	QNAList qnaL = new QNAList();
	Vector<QNAList> qnaList = new Vector<>();
	QNADao qDao = new QNADao();
			
	Scanner sc = new Scanner(System.in);
	
	//메뉴화면
	public QNA() {
		for(int i = 0; i<qDao.getQNAList().size(); i++) {
			qnaList.add(qDao.getQNAList().get(i));
		}
	}
	
	void save() {
		qnaList.add(new QNAList(getTitel(),getInhalt(), writer, qnaList.size()));
		qDao.setQNAList(qnaList);
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
		return Integer.toString(qnaList.size());
	}
	
	//전체 조회
	public void print() {	
		qnaList.get(0).showList(0);
		for(int i = qnaList.size()-1 ; i>0; i--) {
			qnaList.get(i).showList(i);
			}
		System.out.println();
	}
	void editl() {
		System.out.println("몇번 게시물을 수정하시겠습니까?");
		int z = sc.nextInt();
		sc.nextLine();
		if(z<qnaList.size()) {
		qnaList.get(z).setTitel(getTitel());
		qnaList.get(z).setInhalt(getInhalt());
		qnaList.get(z).showList(z);
		System.out.println();
		qDao.setQNAList(qnaList);
		}
		else
		System.out.println("잘못입력하였습니다.");
		System.out.println();
	}
	
	void remove() {
		System.out.println("몇번 게시물을 삭제하시겠습니까?");
		int z = sc.nextInt();
		if(z<qnaList.size()) {	//IOBException 방지
		qnaList.remove(z);
		qDao.setQNAList(qnaList);
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
