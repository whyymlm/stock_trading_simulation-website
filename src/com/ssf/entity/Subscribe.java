package com.ssf.entity;

public class Subscribe {
	   private String uid,sid,sname,numberOfResults;
	   private int cid;
	public Subscribe() {
		// TODO Auto-generated constructor stub
	}
	
	public Subscribe(String uid, String sid, String sname, int cid, String numberOfResults) {
		this.uid = uid;
		this.sid = sid;
		this.sname = sname;
		this.numberOfResults = numberOfResults;
	}

	public String getNumberOfResults() {
		return numberOfResults;
	}

	public void setNumberOfResults(String numberOfResults) {
		this.numberOfResults = numberOfResults;
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
	
	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

}
