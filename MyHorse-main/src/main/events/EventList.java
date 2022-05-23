package main.events;

public class EventList{
	public int number;
	public String title;
	public EventList(){
	}
	public EventList(int number, String title){
		this.number =number;
		this.title =title;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}

