package com.ssf.entity;

public class Stock {
	   private int volume,turnover;
	   private String sid, sname, openTod, closeYes;
	   
	   public Stock(){}
	   public Stock(int volume, int turnover, String sid, String sname, String openTod,String closeYes){
		   this.volume=volume;
		   this.turnover=turnover;
		   this.sid=sid;
		   this.sname=sname;
		   this.openTod=openTod;
		   this.closeYes = closeYes;
	   }
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getTurnover() {
		return turnover;
	}
	public void setTurnover(int turnover) {
		this.turnover = turnover;
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
	public String getOpenTod() {
		return openTod;
	}
	public void setOpenTod(String openTod) {
		this.openTod = openTod;
	}
	public String getCloseYes() {
		return closeYes;
	}
	public void setCloseYes(String closeYes) {
		this.closeYes = closeYes;
	}
		
		
	   
	}

