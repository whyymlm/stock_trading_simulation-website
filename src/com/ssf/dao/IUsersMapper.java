package com.ssf.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ssf.entity.Holdshare;
import com.ssf.entity.Stock;
import com.ssf.entity.Subscribe;
import com.ssf.entity.User;


/**
 * mybatis核心操作的接口
 * 1.IUsersMapper接口操作针对的是user表， * 
 * 2.注解注入到app..xml配置文件中，但是标识一个唯一的bean id 是usersModel
 * 3.该接口是mybatis操作的核心接口所以没有Class实现类
 * @author Administrator
 */
@Component("usersModel")
public interface IUsersMapper {
	//4个方法，1体现出两个表操作一个接口的性能  2为SpringMVC异步json操作，返回json 3 登陆
	//查询单个User对象，适合于登陆,欢迎登陆   院长  jerry
	public User SelectUserByLogin(String uname,String upwd);
	public User SelectUserByUid(String uname);
//	public List<User> SelectUserByLogin1(String uname,String upwd);
	//返回的集合的size()是1
//	public User SelectUserByObject(User user);
//	public User SelectUserByUid(int uid);
//	//return json
	public int UserRegester(String uid, String name,String pwd);
	public List<Stock> SelectStockAll();
	public List<Stock> SelectStockById(String sinfo);
	public List<Stock> SelectStockByName(String sinfo);
	public int addSubscribe(String uid, String sid, String sname);
	public int removeSubscribe(String uid, String sid);
	public List<Stock> SelectMySubscribe(String uid);
	public List<Stock> SelectMyHold(String uid);
	public Subscribe searchSubscribeExistence(String uid,String sid);
	public Holdshare searchHoldExistence(String uid,String sid);
	public List<Holdshare> SelectHoldshareByUid(String uid);
	public int updatePwd(String uid,String pwd);
	public int updateUser(String uid,String uname, String ue_mail, String uwechat, String uqq, String usex, String location,String birthday);
    public int storeImg(String uid,String filePath);
    public int updateHoldshare(String uid, String sid, int number);
    public int addHoldshare(String uid, String sid, String sname, int number);
    public int changeMoney(String uid, double moneyChange);
    public int addReserve(int hoid,String uid,String sid,String sname,int number,double nowPrice);
    public Holdshare numberOfHold(String uid);
    public Subscribe numberOfConcern(String uid);
    
	
	
	
//	//根据角色名称查询对应user集合记录
//	public List<User> SelectUserByRname(String rname);
//	//return Roloes
//	public Roles SelectRolesByrid(Integer rid);
//	public List<Roles> SelectRolesAll();
//	public int InsertUser(User user);
//	public int InsertUsers(List<User> listuser);
//	public List<Roles> SearchRolUser();
}
