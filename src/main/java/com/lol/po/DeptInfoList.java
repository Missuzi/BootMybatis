package com.lol.po;


import java.io.Serializable;

public class DeptInfoList implements Serializable {

    private String name;

    private String age;

    private Long deptId;

    private String deptDesc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public String getDeptDesc() {
        return deptDesc;
    }

    public void setDeptDesc(String deptDesc) {
        this.deptDesc = deptDesc;
    }

    public DeptInfoList(String name, String age, Long deptId, String deptDesc) {
        this.name = name;
        this.age = age;
        this.deptId = deptId;
        this.deptDesc = deptDesc;
    }

    @Override
    public String toString() {
        return "DeptInfoList{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", deptId=" + deptId +
                ", deptDesc='" + deptDesc + '\'' +
                '}';
    }

    public DeptInfoList() {
    }
}
