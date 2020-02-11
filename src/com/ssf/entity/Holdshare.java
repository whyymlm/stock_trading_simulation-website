package com.ssf.entity;

public class Holdshare {
	 private int hoid,hvolume;
	   private String uid,sid,sname,numberOfResults;
	   
	   public Holdshare(){};
	   public Holdshare(int hoid,String uid,String sid,String sname,int hvolume){
		   this.hoid = hoid;
		   this.uid = uid;
		   this.sid = sid;
		   this.sname = sname;
		   this.hvolume= hvolume;
		   
	   }
	   
	public String getNumberOfResults() {
		return numberOfResults;
	}
	public void setNumberOfResults(String numberOfResults) {
		this.numberOfResults = numberOfResults;
	}
	public int getHoid() {
		return hoid;
	}
	public void setHoid(int hoid) {
		this.hoid = hoid;
	}
	public int getHvolume() {
		return hvolume;
	}
	public void setHvolume(int hvolume) {
		this.hvolume = hvolume;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
}

