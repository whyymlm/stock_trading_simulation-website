package com.ssf.controller;


import java.io.UnsupportedEncodingException;
import java.util.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssf.dao.IUltimesMapper;
import com.ssf.entity.Ultime;
@Controller
@RequestMapping("/ultimet")
public class UltimeController {
	IUltimesMapper ultimeMapper=null;
	public IUltimesMapper getUltimeMapper() {
		return ultimeMapper;
	}
	@Autowired
	public void setUltimeMapper(@Qualifier("ultimesModel")IUltimesMapper ultimeMapper) {
		this.ultimeMapper = ultimeMapper;
	}
	@RequestMapping("/ultimeAdd")
	@ResponseBody
	public String AddUltimes(HttpServletRequest request,
			HttpServletResponse response,@RequestParam("uid")String uid) throws UnsupportedEncodingException{
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		Ultime ultime = new Ultime();
		ultime.setUid(uid);
		return ultimeMapper.AddUltime(ultime)>0?"success":"error";
	}
	@RequestMapping("/searchUltime")
	@ResponseBody
	public List<Map<String, Object>> FindultimesAll(HttpServletRequest request,
				HttpServletResponse response) throws UnsupportedEncodingException{
			request.setCharacterEncoding("UTF-8");
			response.setCharacterEncoding("UTF-8");
			response.setContentType("application/json");
			List<Map<String, Object>> res=new ArrayList<Map<String,Object>>();
			List<Ultime> listUltime=this.ultimeMapper.SelectUltimeAll();
			Map<String, Object> map=null;
			for (Ultime ultime : listUltime) {
				map=new HashMap<String, Object>();
				map.put("uid", ultime.getUid());
				map.put("ltime", ultime.getLtime());
				res.add(map);
			}
			return res;
		}
}