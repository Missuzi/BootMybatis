package com.lol.listUtil;

import com.lol.po.ShowUser;
import com.lol.po.User;

import javax.validation.constraints.Null;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author xuleicai
 * @Description:
 * @Date 2019/12/27 10:01
 */
public class ListUtil {
    /*
     * 检查list里面是否有重复的字符
     * */
    public static boolean checkIsHaveRepeat(List<String> checkCode) throws Exception {
        HashSet<String> codeSet = new HashSet<>();
        boolean flag = false;
        for (String code : checkCode) {
            flag = codeSet.add(code);
            if (!flag) {
                throw new Exception("文件中存在重复的编码：" + code);
            }
        }
        return flag;
    }

    /*
     * List取出对象中的某些属性
     * */
    public static List GetListReposity(List<User> Userlist, String toObject) {
        if (toObject == "取出对象中某一属性") {
            return Userlist.stream().map(User::getId).collect(Collectors.toList());
        } else if (toObject == "过滤元素") {
            User oneUser = Userlist.stream().filter(user -> user.getId() == 2).findAny().get();
            return null;
        } else if (toObject == "多管道stream") {
            Userlist.parallelStream().forEach(e -> {
                e.toString();
            });
            return null;
        } else if (toObject == "改变LIST中的某一记录") {
            return Userlist.stream().filter(user -> user.getName().equals("dema")).
                    map(user -> new User(user.getId(), "ruru", user.getAge(), user.getDeptId())).collect(Collectors.toList());
        } else {//JDK 1.8遍历和Stream
            List<ShowUser> newList= new ArrayList<>();
            Userlist.stream().forEach(

                    user -> {
                        ShowUser k= new ShowUser();
                        k.setId(user.getId());
                        k.setName(user.getName());
                        k.setAge(Double.parseDouble(user.getAge() == "0" ? "0.00" : user.getAge()));
                        k.setDeptId(user.getDeptId() == 2l ? "210" : user.getDeptId().toString());
                        newList.add(k);
                    }

            );
            return newList;
        }
    }


}
