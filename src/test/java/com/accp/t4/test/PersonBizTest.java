package com.accp.t4.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.accp.t4.biz.PcBiz;
import com.accp.t4.biz.PersonBiz;
import com.accp.t4.biz.PzyBiz;
import com.accp.t4.pojo.Address;
import com.accp.t4.pojo.Cj;
import com.accp.t4.pojo.Pc;
import com.accp.t4.pojo.Person;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/spring-ctx.xml" })
public class PersonBizTest {
	
	@Autowired
	private PcBiz pc;
	
	@Test
	public void testQuery() {
		Pc a=new Pc();
		a.setBh("1");
		a.setName("主");
		a.setPhone("数学");
		for (Pc s :pc.query("")) {
			System.out.println(s.getList());
		}
	}
}
