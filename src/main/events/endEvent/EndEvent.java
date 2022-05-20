package main.events.endEvent;

class EventList{
	int number;
	String title;
	EventList(int number, String title){
		this.number = number;
		this.title = title;
	}
}
public class EndEvent {
	EndEvent(){
		System.out.println("	종료된 이벤트 목록");
	}
}
