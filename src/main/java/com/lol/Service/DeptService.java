package com.lol.Service;

import com.lol.po.Dept;

public interface DeptService {

    Dept selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Dept dept);


}
