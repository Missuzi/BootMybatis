package com.lol.Controller;

import com.lol.Service.UserService;
import com.lol.common.Result;
import com.lol.po.DeptInfoList;
import com.lol.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/testBoot")
public class UserController {
    @Autowired
    private UserService userService;


    @RequestMapping("/searchMyValue")
    public Result searchMyValue(Integer DeptId )
    {
        List<DeptInfoList> lists=  userService.searchMyEvaluate(DeptId);
        if (lists.size()>0)
        {
            return  Result.success(lists);
        }
        else
            return  Result.fail("无关联部门数据");

    }

    @RequestMapping("/selectByPrimaryKey")
    public  Result selectByPrimaryKey(Integer id)
    {
        User user=  userService.selectByPrimaryKey(id);
        if(user!=null){
            return  Result.success(user);
        }
        else
            return  Result.fail("无数据！");


    }


}
