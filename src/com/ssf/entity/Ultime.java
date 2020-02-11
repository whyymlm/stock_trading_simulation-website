package com.ssf.entity;

public class Ultime {
	   private String uid,ltime;
	   
	   public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getLtime() {
		return ltime;
	}
	public void setLtime(String ltime) {
		this.ltime = ltime;
	}
	public Ultime(){};
	   public Ultime(String uid,String ltime){
		   this.uid = uid;
		   this.ltime = ltime;
	   }

}