package com.ssf.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.ssf.entity.Ultime;


@Component("ultimesModel")
public interface IUltimesMapper {
	public int AddUltime(Ultime ultime);
	public List<Ultime> SelectUltimeAll();
}
