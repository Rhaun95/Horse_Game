package main.events;

import java.util.ArrayList;

public class EventsDao {
	ArrayList<EventList> cuEventList = new ArrayList<>();
	ArrayList<EventList> endEventList = new ArrayList<>();
	
	
	public EventsDao(){
	cuEventList.add(new EventList(1,"출석 체크"));
	cuEventList.add(new EventList(2,"포인트 2배 이벤트"));
	
	endEventList.add(new EventList(1,"오픈 기념 이벤트1"));
	endEventList.add(new EventList(2,"오픈 기념 이벤트2"));
	
	}
	public void run() {
	System.out.println();
	System.out.println("	이벤트 탭입니다. ");
	System.out.println("이벤트 탭에서는 무료로 포인트를 획득하거나");
	System.out.println("각종 혜택을 받으실 수 있습니다.");
	System.out.println();
	}
	
	public ArrayList<EventList> getCuEventList() {
		return cuEventList;
	}
	public void setCuEventList(ArrayList<EventList> cuEventList) {
		this.cuEventList = cuEventList;
	}
	public ArrayList<EventList> getEndEventList() {
		return endEventList;
	}
	public void setEndEventList(ArrayList<EventList> endEventList) {
		this.endEventList = endEventList;
	}
}
