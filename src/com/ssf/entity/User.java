package com.ssf.entity;



/**
 * User实体类对象，映射的users表
 * 字段对应属性
 * 属性和字段名一致  
 * @author Administrator
 *
 */
public class User {
   private int uid,uage;
   private String uname,upwd,udate,ubirthdate,ue_mail,uqq,uwechat,usex,img,location;
   private double uasset;
   public String getUbirthdate() {
	return ubirthdate;
}
   
public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

public String getImg() {
	return img;
}

public void setImg(String img) {
	this.img = img;
}

public String getUsex() {
	return usex;
}

public void setUsex(String usex) {
	this.usex = usex;
}

public String getUqq() {
	return uqq;
}

public void setUqq(String uqq) {
	this.uqq = uqq;
}

public String getUwechat() {
	return uwechat;
}

public void setUwechat(String uwechat) {
	this.uwechat = uwechat;
}

public void setUbirthdate(String ubirthdate) {
	this.ubirthdate = ubirthdate;
}
public String getUe_mail() {
	return ue_mail;
}
public void setUe_mail(String ue_mail) {
	this.ue_mail = ue_mail;
}
public double getUasset() {
	return uasset;
}
public void setUasset(double uasset) {
	this.uasset = uasset;
}
public User(){}
   public User(int uid,int uage, String uname,String upwd,String udate){
	   this.uid=uid;
	   this.udate=udate;
	   this.uage=uage;
	   this.uname=uname;
	   this.upwd=upwd;
   }
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getUage() {
		return uage;
	}
	public void setUage(int uage) {
		this.uage = uage;
	}
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public String getUdate() {
		return udate;
	}
	public void setUdate(String udate) {
		this.udate = udate;
	}
	
   
}
