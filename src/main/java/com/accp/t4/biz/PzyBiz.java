package com.accp.t4.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.t4.dao.IPersonDao;
import com.accp.t4.dao.PzyDAO;
import com.accp.t4.pojo.Pzy;

@Service
public class PzyBiz {
	@Autowired
	private PzyDAO pzy;
	
	public Pzy query(String phone) {
		return pzy.query(phone);
	}
	public int insert() {
		return pzy.insert();
	}
}
