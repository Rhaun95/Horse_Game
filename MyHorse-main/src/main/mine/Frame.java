package main.mine;

import java.util.Objects;

public class Frame {

	public String name;
	public int phoneNum;
	public String pass;
	public int point;
	public boolean dcheck;
	
	public Frame() {
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public boolean isDcheck() {
		return dcheck;
	}

	public void setDcheck(boolean dcheck) {
		this.dcheck = dcheck;
	}

	public Frame(String name, int phoneNum,String pass) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.pass = pass;
		point = 1000;
		dcheck = false;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Frame) {
			if (((Frame) obj).name.equals(name) && ((Frame) obj).phoneNum == phoneNum)
				return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name+phoneNum); 
	}
}

