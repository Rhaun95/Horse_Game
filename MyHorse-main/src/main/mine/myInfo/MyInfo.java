package main.mine.myInfo;

public class MyInfo {

	public void run() {
		System.out.println("	내정보");
		System.out.println("아이디: " + main.mine.Menu.mDao.getcuId());
		System.out.println("이름: " + main.mine.Menu.mDao.getFrame().name);
		System.out.println("전화번호: " + main.mine.Menu.mDao.getFrame().phoneNum);
		System.out.println("포인트: " + main.mine.Menu.mDao.getFrame().point);
		System.out.println();
	}
}
