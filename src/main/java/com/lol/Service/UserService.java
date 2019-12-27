package com.lol.Service;

import com.lol.po.DeptInfoList;
import com.lol.po.User;

import java.util.List;

public interface UserService {



    List<DeptInfoList> searchMyEvaluate(Integer DeptId);

    User selectByPrimaryKey(Integer id);


}
