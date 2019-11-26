package com.lol.Service.imp;

import com.lol.Service.UserService;
import com.lol.mapper.UserMapper;
import com.lol.po.DeptInfoList;
import com.lol.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<DeptInfoList> searchMyEvaluate(Integer DeptId ) {
        return  userMapper.searchMyEvaluate(DeptId);
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
