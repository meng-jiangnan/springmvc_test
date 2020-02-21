package com.accp.t4.dao;

import com.accp.t4.pojo.Cj;

public interface CjDAO {
    int insert(Cj record);

    int insertSelective(Cj record);
}