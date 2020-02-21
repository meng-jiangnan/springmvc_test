package com.accp.t4.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.t4.biz.PersonBiz;
import com.accp.t4.biz.PzyBiz;
import com.accp.t4.pojo.Pzy;

@RestController
@RequestMapping("/api/pzy")
public class PzyAction {
	@Autowired
	private PzyBiz pzy;

	public Pzy query(String phone) {
		return pzy.query(phone);
	}
	@GetMapping("cc")
	public int insert() {
		return pzy.insert();
	}
}
