package main.board.qna;

import java.util.List;
import java.util.Vector;

public class QNADao {
	List<QNAList> list = new Vector<QNAList>();
	public QNADao() {
		//List, ArrayList로 작성하여 필요시 뒷부분만 Vector로 변경
		list.add(new QNAList());
		for(int i = 1; i<10; i++) {
			list.add(new QNAList(i+"번글 작성",i+"번 내용작성", i+"작성자", list.size()));
			}
	}
	public List<QNAList> getQNAList(){
		return list;
	}
	public void setQNAList(List<QNAList> list){
		this.list = list;
	} 
}
