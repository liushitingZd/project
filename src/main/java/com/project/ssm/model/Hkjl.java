package com.project.ssm.model;

public class Hkjl {
    private Integer hid;

    private String uid;

    private Double syje;

    private Double hkje;

    private String htime;

    public Hkjl(Integer hid, String uid, Double syje, Double hkje, String htime) {
        this.hid = hid;
        this.uid = uid;
        this.syje = syje;
        this.hkje = hkje;
        this.htime = htime;
    }

    public Hkjl() {
        super();
    }

    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Double getSyje() {
        return syje;
    }

    public void setSyje(Double syje) {
        this.syje = syje;
    }

    public Double getHkje() {
        return hkje;
    }

    public void setHkje(Double hkje) {
        this.hkje = hkje;
    }

    public String getHtime() {
        return htime;
    }

    public void setHtime(String htime) {
        this.htime = htime;
    }
}