package main.ingame.race;

import java.util.Scanner;
import main.ingame.horse.MyHorse;
import main.ingame.horse.RaceHorse;
import main.ingame.horse.UpBringing;

public class Ingame implements Runnable{
	
	Scanner sc = new Scanner(System.in);
	
	UpBringing u = new UpBringing();
	MyHorse h = new MyHorse();
	Price g = new Price();
	RaceHorse r = new RaceHorse();
	SaveRaces s = new SaveRaces();

	int raceCount = 1;

	public void run(){
		//임시
		h.getMyHorses().add(new MyHorse("노랑이", "파랑"));
		
		r.addToRaceHorses(h.getMyHorses());
		r.createRaceHorses();
		
		boolean start = true;	
		
		while(start) {
			//첫메뉴
			System.out.println(" _______________________________________________________________________ ");
			System.out.println("#			***인게임에 오신것을 환영합니다!***			# \n"			
					+ "#		   이곳에서 자신만의 말을 키우고 경기를 뛰어보세요!			#");
			System.out.println("#_______________________________________________________________________#");
			System.out.println("#   [   마구간(1)   ] [    육성(2)    ] [   경기(3)    ] [    끝내기(4)   ]   #");  
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("__________________________________________________________________________________________________________________");
				System.out.println("			***마구간*** \n"
						+ "내 말의 정보를 보거나 새로운 말을 키우는 곳입니다.	");
				System.out.println("__________________________________________________________________________________________________________________");

				out:
				while(true) {
					//말 메뉴 내부
					System.out.println("[   내 말 조회(1)   ] [    새 말 키우기(2)    ] [     메인메뉴(3)    ]    ");
					int number = sc.nextInt();
					
					switch(number) {
					case 1:
						h.print(h.getMyHorses());
						break;
					case 2:
//		추가할부분				h.createHorse();
						break;
					case 3:
						break out;
					}
				}break; 
				
				//육성
				case 2: 
					main:
					while(true) {
						
						System.out.println("전직(1) 훈련(2) 밥주기(3) 잠(4)  메인메뉴(5)");
						int number = sc.nextInt();
						
						switch(number) {
							case 1:
								u.swtichJobs(h.getMyHorses().get(0));
								break;
								//훈련
							case 2:
								while(true) {
									
									System.out.println("어떤 훈련을 하겠습니까?");
									
									System.out.println("장거리훈련(1)  점프훈련(2) 전으로 돌아가기(3)");
									int n = sc.nextInt();
									ro:
									switch(n) {
										case 1:
											u.longDistance(h.getMyHorses().get(0));
											break;
										case 2:
											u.jump(h.getMyHorses().get(0));
											break;
										case 3:
											break ro;
										}break;
									}
								break;
								
							case 3:
								u.eat(h.getMyHorses().get(0));
								break;
							case 4:
								u.sleep(h.getMyHorses().get(0));
								break;
							case 5:
								break main;
						}
					}break;
					
				//경기시작
				case 3:
					r.giveLine();
					out:
					while(true) {
					
						
						System.out.println("오늘의 경주마(1)  경기 시작(2)  메인메뉴(4)");
						int number = sc.nextInt();
						
						switch(number) {
							case 1:
								r.printRaceHorse(r.getRaceHorse());
								System.out.println("====================오늘의 경주마가 조회되었습니다.========================");
								break;
							
							case 2:
								System.out.println("                #######제 "+ this.raceCount + "회차 경주를 시작합니다!########");
								try {
									Thread.sleep(1000);
								} catch (InterruptedException e) {}
								System.out.println("                           ####"+ "준비"+"####");
								try { 
									Thread.sleep(500);
								} catch (InterruptedException e) {}
								System.out.println("                              #"+ "시작!"+"#");
								try { 
									Thread.sleep(500);
								} catch (InterruptedException e) {}
								
								while(true) {
									Thread thread1 = new Thread() {
											public void run() {
												r.getRaceTime(r.getRaceHorse().get(0));
												
											}
										};
										thread1.start();
						
									Thread thread2 = new Thread() {
										public void run() {
											r.getRaceTime(r.getRaceHorse().get(1));

										}
									};
									thread2.start();
									
									Thread thread3 = new Thread() {
										public void run() {
											r.getRaceTime(r.getRaceHorse().get(2));

										}
									};
									thread3.start();
									
									Thread thread4 = new Thread() {
										public void run() {
											r.getRaceTime(r.getRaceHorse().get(3));

										}
									};
									thread4.start();
					
								Thread thread5 = new Thread() {
									public void run() {
										r.getRaceTime(r.getRaceHorse().get(4));

									}
								};
								thread5.start();
								
								Thread thread6 = new Thread() {
									public void run() {
										r.getRaceTime(r.getRaceHorse().get(5));

									}
								};
								thread6.start();
								
									
								Thread thread7 = new Thread() {
									public void run() {
										r.getRaceTime(r.getRaceHorse().get(6));

									}
								};
								thread7.start();
								Thread thread8 = new Thread() {
									public void run() {
										r.getRaceTime(r.getRaceHorse().get(7));
									}
								};
								thread8.start();
									
									
									try {
										Thread.sleep(5000);
									} catch (InterruptedException e) {}
									
									System.out.println();
									//결과
									System.out.println("결과집계=============================================================");
//									for(RaceHorse horse: r.getRaceHorse()) {
//										r.afterRaceResult(horse);
//									}
									System.out.println("###제 " + this.raceCount + "회차 순위###");
									
									r.printAllRank();
									
									System.out.println("==================================================================");
									for(RaceHorse horse: r.getRaceHorse()) {
										g.victoryPrice(horse);
										g.afterGameExp(horse);
									}
									System.out.println("==================================================================");
									
									System.out.println();
									
									try {
										Thread.sleep(1000);
									} catch (InterruptedException e) {}
									
									s.save(r.getRaceHorse());
							
									this.raceCount +=1;
									
									r.giveLine();
									break;
								}
								break;
							case 4:
								break out;
						}
					}
				break;
					
				//게임종료
				case 4:
					start = false;
					break;
				}
		}
	}
}
