package com.accp.t4.dao;

import org.apache.ibatis.annotations.Param;

import com.accp.t4.pojo.Pzy;

public interface PzyDAO {

	Pzy query(@Param("phone") String phone);
	
	Integer insert();
}