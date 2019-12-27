package com.lol.Service.imp;

import com.lol.Service.DeptService;
import com.lol.mapper.DeptMapper;
import com.lol.po.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptServiceImp implements DeptService {

    @Autowired
    DeptMapper deptMapper;


    @Override
    public Dept selectByPrimaryKey(Integer id) {
        return  deptMapper.selectByPrimaryKey(id);

    }

    @Override
    public int updateByPrimaryKeySelective(Dept dept) {
        return deptMapper.updateByPrimaryKeySelective(dept);
    }
}
