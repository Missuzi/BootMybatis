package com.lol.po;

/**
 * @Author xuleicai
 * @Description:
 * @Date 2019/12/27 15:42
 */
public class ShowUser {
    private Integer id;

    private String name;

    private double age;

    private String deptId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }
}
