package com.accp.t4.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.t4.pojo.Pc;

public interface PcDAO {
   
	List<Pc> query(@Param("pid") String pid);
	
	int de(@Param("id") String id);
	
	int addPersonInfo(@Param("person") Pc person);
	
	int update(@Param("person") Pc person);
	
	Pc query2(@Param("bh") String bh);
}