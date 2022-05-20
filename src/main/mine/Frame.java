package main.mine;

import java.util.Objects;

public class Frame {
	public String name;
	public int phoneNum;
	public String pass;
	public Frame() {
		
	}
	public Frame(String name, int phoneNum,String pass) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.pass = pass;
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

