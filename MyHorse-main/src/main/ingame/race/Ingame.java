package main.ingame.race;

import java.util.Scanner;

import main.game.GameDao;
import main.ingame.horse.Item;
import main.ingame.horse.MyHorse;
import main.ingame.horse.RaceHorse;
import main.ingame.horse.UpBringing;

public class Ingame implements Runnable{
	
	Scanner sc = new Scanner(System.in);
	
	UpBringing u = new UpBringing();
	MyHorse h = new MyHorse();
	Price p = new Price();
	RaceHorse r = new RaceHorse();
	SaveRaces sr = new SaveRaces();
	Item i = new Item();
	Game g = new Game();
	
	GameDao gd = new GameDao();

	int raceCount = 1;
	
	public int getRaceCount() {
		return this.raceCount;
	}

	public Ingame() {
		r.createRaceHorses();
	}
	
	public void run(){

		boolean start = true;	
		
		while(start) {
			//첫메뉴
			System.out.println(" _______________________________________________________________________ ");
			System.out.println("#			***인게임에 오신것을 환영합니다!***			# \n"			
					+ "#		   이곳에서 자신만의 말을 키우고 경기를 뛰어보세요!			#");
			System.out.println("#_______________________________________________________________________#");
			System.out.println("~          [   마구간(1)   ]  [   경기(2)    ] [    메인메뉴(3)   ]           ~");  
			int menu = sc.nextInt();
			
			switch(menu) {
				case 1:
					
					System.out.println(" _______________________________________________________________________");
					System.out.println("#			   ***마구간***                                  #\n"
							+ "#                내 말의 정보를 보거나 새로운 말을 키울 수 있어요!	                #");
					System.out.println("#_______________________________________________________________________#");
					out:
					while(true) {
						//말 메뉴 내부                                                                               
						System.out.println("~     [   내 말(1)   ] [   육성(2)   ] [ 새 말 키우기(3) ] [  아이템 사용(4) ] [  돌아가기(5) ]     ~");
						
						int number = sc.nextInt();
						main:
						switch(number) {
							//내 말 조회
							case 1:
								h.print(h.getMyStall());
								break;
							//육성
							case 2: 
							                                                     
								System.out.println("[   전직(1)   ] [   훈련(2)   ] [   밥주기(3)   ] [    잠(4)    ] [  돌아가기(5)  ]");
								int nb = sc.nextInt();
								ro:
								switch(nb) {
									case 1:
										u.swtichJobs(h.getMyStall().get(0));
										break;
										//훈련
									case 2:
										
											System.out.println(" _______________________________________________________________________ ");
											System.out.println("#			***어떤 훈련을 하시겠습니까?***			# \n"			
													+ "#    적당한 훈련은 좋은 결과를 가져오지만, 무리한 훈련은 말을 지치게하니 주의하세요!         #");
											System.out.println("#_______________________________________________________________________#");
											System.out.println("[   장거리훈련(1)   ] [   	점프훈련(2)    ] [    돌아가기(3)    ]");
											int n = sc.nextInt();
											
											switch(n) {
												case 1:
													u.longDistance(h.getMyStall().get(0));
													break;
												case 2:
													u.jump(h.getMyStall().get(0));
													break;
												case 3:
													break ro;
												}break;
												
									case 3:
										u.eat(h.getMyStall().get(0));
										break;
									case 4:
										u.sleep(h.getMyStall().get(0));
										break;
									case 5:
										break main;
								}break; 	
								
							//새 말 키우기	
							case 3:
					             	h.createHorse();
								break;
							case 4:
									while(true) {
										
										System.out.println(" _______________________________________________________________________ ");
										System.out.println("#				***아이템샵***				# \n"			
												+ "#    ***어떤 아이템을 사용하시겠습니까?***	         #");
										System.out.println("#_______________________________________________________________________#");
										System.out.println("[   스피드업(1)   ] [   	스테미나업(2)    ] [    공경력 업 (3)    ] [    경헙치 업 (4)    ]");
										int n = sc.nextInt();
										
										switch(n) {
											case 1:
												System.out.println("*** 노랑이의 속도가 +10 되었습니다! ***");
												i.useSpeedItem((h.getMyStall().get(0)));
												h.print(h.getMyStall());
												break;
											case 2:
												System.out.println("*** 노랑이의 체력이 +20 되었습니다! ***");
												i.useStaminaItem((h.getMyStall().get(0)));
												h.print(h.getMyStall());
												break;
											case 3:
												System.out.println("상대방 말의 속도가 -20 되었습니다!");
												i.useAttackItem(r.getRaceStall());
												r.printRaceHorse(r.getRaceStall());
												
												break;
											case 4: 
												System.out.println("노랑이의 경험치가 +100 되었습니다!");
												i.useExpItem(h.getMyStall().get(0));
												h.print(h.getMyStall());
											}
											break;
										}
									break;
								
							//나가기
							case 5:
								break out;
							}
						}	break;		
				//경기
				case 2:
					
					try {
						h.addToRaceHorses(h.getMyStall().get(0));
					}catch (IndexOutOfBoundsException e){
						System.out.println("경주에 출전시킬 말을 선택하세요!");
						System.out.println();
						break;
					}
					
					g.giveLine();
					
					out2:
					while(true) {
					
						System.out.println("[  오늘의 경주마(1)   ] [    경기시작(2)    ] [    메인메뉴(3)    ]");
						int number = sc.nextInt();
						
						switch(number) {
							case 1:
								System.out.println("====================오늘의 경주마 조회를 시작합니다.========================");
								
								r.printRaceHorse(r.getRaceStall());
								
								System.out.println("====================오늘의 경주마가 조회되었습니다.========================");
								break;
						
							case 2:
						
								System.out.println("                #######제 "+ this.raceCount + "회차 경주를 시작합니다!########");
								try {
									Thread.sleep(500);
								} catch (InterruptedException e) {}
								System.out.println("                           ####"+ "준비"+"####");
								try { 
									Thread.sleep(200);
								} catch (InterruptedException e) {}
								System.out.println("                              #"+ "시작!"+"#");
								try { 
									Thread.sleep(300);
								} catch (InterruptedException e) {}
								
								
								Thread thread1 = new Thread(() -> g.gameStart(r.getRaceStall().get(0)));
								thread1.start();
								
								Thread thread2 = new Thread(() -> g.gameStart(r.getRaceStall().get(1)));
								thread2.start();
								
								Thread thread3 = new Thread(() ->g.gameStart(r.getRaceStall().get(2)));
								thread3.start();		
								
								Thread thread4 = new Thread(()-> g.gameStart(r.getRaceStall().get(3)));
								thread4.start();
								
								Thread thread5 = new Thread(()->g.gameStart(r.getRaceStall().get(4)));
								thread5.start();
								
								Thread thread6 = new Thread(()->g.gameStart(r.getRaceStall().get(5)));
								thread6.start();
								
								Thread thread7 = new Thread(()->g.gameStart(r.getRaceStall().get(6)));
								thread7.start();
								
								Thread thread8 = new Thread(()->g.gameStart(r.getRaceStall().get(7)));
								thread8.start();
					
									
									try {
										Thread.sleep(4000);
									} catch (InterruptedException e) {}
									
									System.out.println();
									//결과
									System.out.println("결과집계=============================================================");
								
									System.out.println("###제 " + this.raceCount + "회차 순위###");
									
									sr.printAllRank();
									
									System.out.println("==================================================================");
									
									for(RaceHorse horse: r.getRaceStall()) {
										p.victoryPrice(horse);
										p.afterGameExp(horse);
									}
									
									System.out.println("==================================================================");
									
									System.out.println();
									
									try {
										Thread.sleep(1000);
									} catch (InterruptedException e) {}
									
									sr.save(r.getRaceStall());
									
									this.raceCount +=1;

									r.setRank(1);
								
									
									break;

							case 3:
								break out2;
						}
					}
					
				//게임종료
				case 3:
					start = false;
					break;
				
		}}
	}}

