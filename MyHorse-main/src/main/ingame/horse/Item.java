package main.ingame.horse;

import java.util.ArrayList;

public class Item {
	
	MyHorse h = new MyHorse();
	RaceHorse r = new RaceHorse();
	UpBringing u = new UpBringing();
	
	public void useSpeedItem(MyHorse h) {
		h.addSpeed(10);
	}
	
	public void useStaminaItem(MyHorse h) {
		h.addStamina(20);
	} 


	public void useAttackItem(ArrayList<RaceHorse> raceHorses) {
		int a = r.createRandomNumber2();
		raceHorses.get(a).addSpeed(-20);
		
	}
	
	public void useExpItem(MyHorse h) {
		h.addExp(100); 
		u.levelUp(h);
		
	}	
}
