package com.lol.common;

import java.util.List;

public class Page<T> {
    private Integer pageNum; //页编号

    private Integer pageSize;//每页的大小

    private Integer pageSum;//总的页数

    private long totaItem;//条数

    private List<T> list;

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageSum() {
        return pageSum;
    }

    public void setPageSum(Integer pageSum) {
        this.pageSum = pageSum;
    }

    public long getTotaItem() {
        return totaItem;
    }

    public void setTotaItem(long totaItem) {
        this.totaItem = totaItem;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

//public  static<T> Page<T> transPage(List<T> list)
//{
//
//
//}



}
