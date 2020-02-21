package com.accp.t4.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.t4.dao.PcDAO;
import com.accp.t4.dao.PzyDAO;
import com.accp.t4.pojo.Pc;

@Service
public class PcBiz {
	@Autowired
	private PcDAO pc;
	
	public List<Pc> query(String pid) {
		return pc.query(pid);
	}
	public int de(String id) {
		return pc.de(id);
	}
	public int addPersonInfo(Pc person) {
		return pc.addPersonInfo(person);
	}
	public int update(Pc list) {
		return pc.update(list);
	}
	public Pc query2(String bh) {
		return pc.query2(bh);
	}
	
}
