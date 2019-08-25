package com.project.ssm.model;

public class Jk {
    private Integer jid;

    private String uid;

    private String jtime;

    private Integer jqx;

    private Integer jyq;

    private Integer jyt;

    private Double jje;

    private Integer jtg;

    private String ufid;

    private Integer jzt;

    private Integer hksm;

    private Integer hkfs;

    private Double jyh;

    public Jk(Integer jid, String uid, String jtime, Integer jqx, Integer jyq, Integer jyt, Double jje, Integer jtg, String ufid, Integer jzt, Integer hksm, Integer hkfs, Double jyh) {
        this.jid = jid;
        this.uid = uid;
        this.jtime = jtime;
        this.jqx = jqx;
        this.jyq = jyq;
        this.jyt = jyt;
        this.jje = jje;
        this.jtg = jtg;
        this.ufid = ufid;
        this.jzt = jzt;
        this.hksm = hksm;
        this.hkfs = hkfs;
        this.jyh = jyh;
    }

    public Jk() {
        super();
    }

    public Integer getJid() {
        return jid;
    }

    public void setJid(Integer jid) {
        this.jid = jid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getJtime() {
        return jtime;
    }

    public void setJtime(String jtime) {
        this.jtime = jtime;
    }

    public Integer getJqx() {
        return jqx;
    }

    public void setJqx(Integer jqx) {
        this.jqx = jqx;
    }

    public Integer getJyq() {
        return jyq;
    }

    public void setJyq(Integer jyq) {
        this.jyq = jyq;
    }

    public Integer getJyt() {
        return jyt;
    }

    public void setJyt(Integer jyt) {
        this.jyt = jyt;
    }

    public Double getJje() {
        return jje;
    }

    public void setJje(Double jje) {
        this.jje = jje;
    }

    public Integer getJtg() {
        return jtg;
    }

    public void setJtg(Integer jtg) {
        this.jtg = jtg;
    }

    public String getUfid() {
        return ufid;
    }

    public void setUfid(String ufid) {
        this.ufid = ufid;
    }

    public Integer getJzt() {
        return jzt;
    }

    public void setJzt(Integer jzt) {
        this.jzt = jzt;
    }

    public Integer getHksm() {
        return hksm;
    }

    public void setHksm(Integer hksm) {
        this.hksm = hksm;
    }

    public Integer getHkfs() {
        return hkfs;
    }

    public void setHkfs(Integer hkfs) {
        this.hkfs = hkfs;
    }

    public Double getJyh() {
        return jyh;
    }

    public void setJyh(Double jyh) {
        this.jyh = jyh;
    }
}