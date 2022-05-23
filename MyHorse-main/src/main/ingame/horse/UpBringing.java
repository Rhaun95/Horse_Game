package main.ingame.horse;

import java.util.Scanner;

/*육성: 
 * 전직
 * 레벨업
 * 밥먹기
 * 장거리 뛰기
 * 점프훈련
 * 잠
 * 컨디션/체력 제한두기 <100
 * 출력 형태
*/
interface A{
	void swtichJobs(MyHorse h);
	void levelUp(MyHorse h);
	void eat(MyHorse h);
	void longDistance(MyHorse h);
	void jump(MyHorse h);
	void sleep(MyHorse h);
	void condStamiCheck(MyHorse h);
	void status(MyHorse h);
}

public class UpBringing implements A {
	
	MyHorse h = new MyHorse();
	int count = 0;
	
	//전직
	public void swtichJobs(MyHorse h) {
		
		System.out.println(" _______________________________________________________________________ ");
		System.out.println("#			어떤 말을 선택하시겠습니까?			        # \n"			
				+ "#		      당신의 선택으로 말의 성격이 정해집니다!			        #");
		System.out.println("#_______________________________________________________________________#");
		System.out.println("~   [   도주마(1)   ] [   선행마(2)   ] [   주입마(3)   ] [   자유마(4)   ]   ~");  
		
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		switch(a) {
			case 1: 
				if(h.getLevel() == 18) {
					h.setRaceType("도주마");
					h.addSpeed(20);
					System.out.println("=========================도주마로 전직하였습니다!=========================");
				}else {
					System.out.println("=========================레벨이 부족합니다!=========================");
				}
				System.out.println();
				System.out.println("________________________________________________________________________________________________");
				
				break;
				
			case 2: 
				if(h.getLevel() == 18) {
					h.setRaceType("선행마");
					h.addStamina(30);
					System.out.println("=========================선행마 전직하였습니다!=========================");
				}else {
					System.out.println("=========================레벨이 부족합니다!=========================");
				}
				System.out.println();
				System.out.println("________________________________________________________________________________________________");
				break;
				
			case 3: 
				if(h.getLevel() == 18) {
					h.setRaceType("주입마");
					h.addStamina(30);
					System.out.println("=========================주입마 전직하였습니다!=========================");
				}else {
					System.out.println("=========================레벨이 부족합니다!=========================");
				}
				System.out.println();
				System.out.println("________________________________________________________________________________________________");
				break;
				
			case 4: 
				if(h.getLevel() == 18) {
					h.setRaceType("자유마");
					h.addSpeed(20);
					System.out.println("=========================자유마 전직하였습니다!=========================");
				}else {
					System.out.println("=========================레벨이 부족합니다!=========================");
				}
				System.out.println();
				System.out.println("________________________________________________________________________________________________");
				break;		
		}	
	}
	
	public void condStamiCheck(MyHorse h) {
		if(h.getCondition()>=100) {
			h.setCondition(100);
		}
		if( h.getStamina()>=100) {
			h.setStamina(100);
		}
		
	}
	
	public void status(MyHorse h) {
		System.out.println("현재 경험치: " + h.getExp() + " 컨디션: " + h.getCondition() + 
				" 체력: " + h.getStamina() + " 호감도: " + h.getSympathetic());
		System.out.println("================================================================");
	}
	
	
	//말 레벨업(경험치 조건에 맞을경우)
	public void levelUp(MyHorse h){
		
		
		if(h.getLevel()>=1 && h.getLevel() <=10) {
			if(h.getExp() == h.getLevel() * 100){
				h.addLevel(1);	
				h.setCondition(100);
				h.setExp(0);
				h.setStamina(100);
				h.setSympathetic("상");
				System.out.println("축하합니다! " + h.getLevel()+ "레벨을 달성했습니다! ");
				}
		}else if(h.getLevel()>=11 && h.getLevel()<18) {
			if(h.getExp() == h.getLevel()*200-1000) {
				h.addLevel(1);	
				h.setCondition(100);
				h.setExp(0);
				h.setStamina(100);
				h.setSympathetic("상");
				System.out.println("축하합니다! " + h.getLevel()+ "레벨을 달성했습니다! ");
				}
		}else if(h.getExp() == h.getLevel()*300-2800) {
				h.addLevel(1);	
				h.setCondition(100);
				h.setExp(0);
				h.setStamina(100);
				h.setSympathetic("상");
				System.out.println("축하합니다! " + h.getLevel()+ "레벨을 달성했습니다! ");
		}else {
			System.out.println();
			
		}
	}
	
	
	//밥먹이기
	public void eat(MyHorse h) {
		if(count<5) {
			this.count +=1;
			System.out.println("=================밥을 먹었습니다" + count +"/5"+ "==================");
			h.addExp(5);
			h.addCondition(10);
			h.addStamina(40);
			h.setSympathetic("상");
			levelUp(h);
			
			condStamiCheck(h);
			
			status(h);
			
			System.out.println("=================================================");
		}else {
			System.out.println("===============더이상 밥을 먹이면 안됩니다!!=================");
		}
		
		System.out.println();
	}
	
	public void longDistance(MyHorse h) {
		
		if(h.getStamina() <= 10 || h.getCondition()<=20) {
			System.out.println("===================더이상 훈련을 시키면 안됩니다!!=============");
		}else {
			System.out.println("=====================장거리 달리기 훈련을 하였습니다.===================");
			h.addExp(10);
			h.addCondition(-20);
			h.setSympathetic("상");
			h.addStamina(-10);
			levelUp(h);
			
			condStamiCheck(h);
			status(h);
		}
		System.out.println();
	}
	
	
	public void jump(MyHorse h) {
		if(h.getStamina() <= 10 || h.getCondition()<=10) {
			System.out.println("===================더이상 훈련을 시키면 안됩니다!!=============");
		}else {
			System.out.println("======================점프훈련을 하였습니다==========================");
			h.addExp(50);
			h.addCondition(-10);
			h.setSympathetic("상");
			h.addStamina(-10);
			levelUp(h);
			
			condStamiCheck(h);
			status(h);
		}
		System.out.println();
	}
	
	public void sleep(MyHorse h) {
		
		System.out.println("======================Zzz...Zzz...Zzz...========================");
		h.addExp(5);
		h.addCondition(10);
		h.setSympathetic("상");
		h.setStamina(100);
		levelUp(h);
		
		condStamiCheck(h);
		status(h);
	
		System.out.println();
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
