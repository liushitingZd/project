package com.project.ssm.model;

public class Role {
    private Integer rid;

    private String rname;

    private Integer available;

    private String desca;

    public Role(Integer rid, String rname, Integer available, String desca) {
        this.rid = rid;
        this.rname = rname;
        this.available = available;
        this.desca = desca;
    }

    public Role() {
        super();
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    public String getDesca() {
        return desca;
    }

    public void setDesca(String desca) {
        this.desca = desca;
    }
}