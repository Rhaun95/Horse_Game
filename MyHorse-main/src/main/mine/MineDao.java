package main.mine;

import java.util.Hashtable;
import java.util.Map;

public class MineDao {
	private Map<String, Frame> mineDao = new Hashtable<>();
	private String cuId;
	
	public MineDao(){
		mineDao.put("abc", new Frame("홍지성",1213,"1234"));
		mineDao.put("bcd", new Frame("임지희",1211,"asd"));
	}
	public Map<String, Frame> getmineDao(){
		return mineDao;
	}
	public void setmineDao(Map<String, Frame> mineDao){
		this.mineDao = mineDao;
	}
	public String getcuId(){
		return cuId;
	}
	public void setcuId(String cuId){
		this.cuId = cuId;
	}
	public Frame getFrame(){
		return mineDao.get(cuId);
	}
	public void setDcheck(boolean dcheck){
		mineDao.get(cuId).setDcheck(dcheck);
		mineDao.replace(cuId, mineDao.get(cuId));
	}
	public boolean getDcheck(){
		return mineDao.get(cuId).dcheck;
	}
	public void setPoint(int point){
		mineDao.get(cuId).setPoint(point);
		mineDao.replace(cuId, mineDao.get(cuId));
	}
	public int getPoint(){
		return mineDao.get(cuId).point;
	}
}
