package main.board.qna;

import java.util.Vector;

public class QNADao {
	Vector<QNAList> list = new Vector<QNAList>();
	public QNADao() {
		//List, ArrayList로 작성하여 필요시 뒷부분만 Vector로 변경
		for(int i = 1; i<10; i++) {
			list.add(new QNAList(i+"번글 작성",i+"번 내용작성", i+"작성자", list.size()));
			}
	}
	public Vector<QNAList> getQNAList(){
		return list;
	}
	public void setAskList(int e, QNAList list){
		this.list.set(e, list);
	}
}
