package com.lol.Controller;

import com.lol.Service.DeptService;
import com.lol.common.Result;
import com.lol.po.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    DeptService deptService;

    @RequestMapping("/updateDeptInfo")
     public Result updateDeptInfo(Dept dept){
        Result result;
        try{
            dept.setId(1);
            dept.setDeptDesc("瞧你咋地");
            int n=deptService.updateByPrimaryKeySelective(dept);
            if (n>0)
                result=Result.success(n);
           else
               result=Result.fail();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            result=Result.fail(e.getMessage());
        }
        return  result;





    }

}
