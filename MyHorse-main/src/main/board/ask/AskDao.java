package main.board.ask;

import java.util.List;
import java.util.Vector;

public class AskDao {
	List<AskList> list = new Vector<AskList>();//List, ArrayList로 작성하여 동기화 불필요시 뒷부분만ArrayList로 변경
	public AskDao() {
		
		list.add(new AskList());
		for(int j = 1; j<10; j++) {
			list.add(new AskList(j+"번글 작성",j+"번 내용작성", j+"작성자", j));
			}
	}
	public List<AskList> getAskList(){
		return list;
	}
	public void setAskList(List<AskList> list){
		this.list = list;
	} 
}
