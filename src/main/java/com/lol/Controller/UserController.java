package com.lol.Controller;

import com.lol.Service.UserService;
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
    public List<DeptInfoList> searchMyValue(Integer DeptId )
    {
        return  userService.searchMyEvaluate(DeptId);

    }

    @RequestMapping("/selectByPrimaryKey")
    public  User selectByPrimaryKey(Integer id)
    {
        return  userService.selectByPrimaryKey(id);

    }


}
