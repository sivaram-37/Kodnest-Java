package org.kodnest.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class University {
	private int uid;
	private String uname;
	
	@Autowired
	Trainer t;
	
	public University() {
		super();
	}
	public University(int uid, String uname, Trainer t) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.t = t;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public Trainer getT() {
		return t;
	}
	public void setT(Trainer t) {
		this.t = t;
	}
	@Override
	public String toString() {
		return "University [uid=" + uid + ", uname=" + uname + ", t=" + t + "]";
	}
	
}
