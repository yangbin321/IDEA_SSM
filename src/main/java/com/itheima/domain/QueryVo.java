package com.itheima.domain;

import java.io.Serializable;

/**
 * @author Yangbin
 * @create 2020-03-08 22:17
 * @Description QueryVo类，分页作用
 */
public class QueryVo implements Serializable {

    //客户名称
    private String custName;
    private String custSource;
    private String custIndustry;
    private String custLevel;

    //当前页
    private Integer page;
    //每页数
    private Integer size = 0;
    //开始行
    private Integer startRow = 0;

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustSource() {
        return custSource;
    }

    public void setCustSource(String custSource) {
        this.custSource = custSource;
    }

    public String getCustIndustry() {
        return custIndustry;
    }

    public void setCustIndustry(String custIndustry) {
        this.custIndustry = custIndustry;
    }

    public String getCustLevel() {
        return custLevel;
    }

    public void setCustLevel(String custLevel) {
        this.custLevel = custLevel;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getStartRow() {
        return startRow;
    }

    public void setStartRow(Integer startRow) {
        this.startRow = startRow;
    }

    @Override
    public String toString() {
        return "QueryVo{" +
                "custName='" + custName + '\'' +
                ", custSource='" + custSource + '\'' +
                ", custIndustry='" + custIndustry + '\'' +
                ", custLevel='" + custLevel + '\'' +
                ", page=" + page +
                ", size=" + size +
                ", startRow=" + startRow +
                '}';
    }
}
