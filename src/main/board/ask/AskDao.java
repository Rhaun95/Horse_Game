package main.board.ask;

import java.util.Vector;

public class AskDao {
	Vector<AskList> list = new Vector<AskList>();
	public AskDao() {
		//List, ArrayList로 작성하여 필요시 뒷부분만 Vector로 변경
		for(int i = 1; i<10; i++) {
			list.add(new AskList(i+"번글 작성",i+"번 내용작성", i+"작성자", list.size()));
			}
	}
	public Vector<AskList> getAskList(){
		return list;
	}
	public void setAskList(int e, AskList list){
		this.list.set(e, list);
	}
}
