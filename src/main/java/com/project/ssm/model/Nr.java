package com.project.ssm.model;

public class Nr {
    private Integer nid;

    private String ntime;

    private String ncontent;

    private String nimage;

    private Integer uzt;

    public Nr(Integer nid, String ntime, String ncontent, String nimage, Integer uzt) {
        this.nid = nid;
        this.ntime = ntime;
        this.ncontent = ncontent;
        this.nimage = nimage;
        this.uzt = uzt;
    }

    public Nr() {
        super();
    }

    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }

    public String getNtime() {
        return ntime;
    }

    public void setNtime(String ntime) {
        this.ntime = ntime;
    }

    public String getNcontent() {
        return ncontent;
    }

    public void setNcontent(String ncontent) {
        this.ncontent = ncontent;
    }

    public String getNimage() {
        return nimage;
    }

    public void setNimage(String nimage) {
        this.nimage = nimage;
    }

    public Integer getUzt() {
        return uzt;
    }

    public void setUzt(Integer uzt) {
        this.uzt = uzt;
    }
}