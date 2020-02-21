package com.accp.t4.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.t4.biz.PcBiz;
import com.accp.t4.biz.PzyBiz;
import com.accp.t4.pojo.Pc;

@RestController
@RequestMapping("/api/pc")
public class PcAction {
	@Autowired
	private PcBiz pc;
	@GetMapping("{pid}")	
	public List<Pc> query(@PathVariable String pid) {
		return pc.query(pid);
	}
	@GetMapping("sc/{id}")	
	public int de(@PathVariable String id) {
		System.out.println("第一次修改");
		return pc.de(id);
		
	}
	@PostMapping("person")
	public int addPersonInfo(@RequestBody Pc person) {
		Map<String, String> message = new HashMap<String, String>();
		pc.addPersonInfo(person);
		return 1;
	}
	@PutMapping("xg")
	public int update(@RequestBody Pc list) {
		return pc.update(list);
	}
	@GetMapping("cx/{bh}")
	public Pc query2(@PathVariable String bh) {
		return pc.query2(bh);
	}
}
