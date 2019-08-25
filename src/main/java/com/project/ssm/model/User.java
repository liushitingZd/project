package com.project.ssm.model;

public class User {
    private String uid;

    private String usex;

    private String utel;

    private String upwd;

    private String uname;

    private String uemail;

    private Integer uxy;

    private Integer hmd;

    private Integer ujf;

    private Integer umy;

    private Integer uwork;

    private String uimage;

    private String utime;

    private Integer uty;

    private Integer umarry;

    private String usfz;

    private String ubirth;

    private Integer uson;

    private Integer uxl;

    private String uyhzh;

    private Integer ufh;

    private String usfimage;

    private String salt;

    private Integer locked;

    public User(String uid, String usex, String utel, String upwd, String uname, String uemail, Integer uxy, Integer hmd, Integer ujf, Integer umy, Integer uwork, String uimage, String utime, Integer uty, Integer umarry, String usfz, String ubirth, Integer uson, Integer uxl, String uyhzh, Integer ufh, String usfimage, String salt, Integer locked) {
        this.uid = uid;
        this.usex = usex;
        this.utel = utel;
        this.upwd = upwd;
        this.uname = uname;
        this.uemail = uemail;
        this.uxy = uxy;
        this.hmd = hmd;
        this.ujf = ujf;
        this.umy = umy;
        this.uwork = uwork;
        this.uimage = uimage;
        this.utime = utime;
        this.uty = uty;
        this.umarry = umarry;
        this.usfz = usfz;
        this.ubirth = ubirth;
        this.uson = uson;
        this.uxl = uxl;
        this.uyhzh = uyhzh;
        this.ufh = ufh;
        this.usfimage = usfimage;
        this.salt = salt;
        this.locked = locked;
    }

    public User() {
        super();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUsex() {
        return usex;
    }

    public void setUsex(String usex) {
        this.usex = usex;
    }

    public String getUtel() {
        return utel;
    }

    public void setUtel(String utel) {
        this.utel = utel;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }

    public Integer getUxy() {
        return uxy;
    }

    public void setUxy(Integer uxy) {
        this.uxy = uxy;
    }

    public Integer getHmd() {
        return hmd;
    }

    public void setHmd(Integer hmd) {
        this.hmd = hmd;
    }

    public Integer getUjf() {
        return ujf;
    }

    public void setUjf(Integer ujf) {
        this.ujf = ujf;
    }

    public Integer getUmy() {
        return umy;
    }

    public void setUmy(Integer umy) {
        this.umy = umy;
    }

    public Integer getUwork() {
        return uwork;
    }

    public void setUwork(Integer uwork) {
        this.uwork = uwork;
    }

    public String getUimage() {
        return uimage;
    }

    public void setUimage(String uimage) {
        this.uimage = uimage;
    }

    public String getUtime() {
        return utime;
    }

    public void setUtime(String utime) {
        this.utime = utime;
    }

    public Integer getUty() {
        return uty;
    }

    public void setUty(Integer uty) {
        this.uty = uty;
    }

    public Integer getUmarry() {
        return umarry;
    }

    public void setUmarry(Integer umarry) {
        this.umarry = umarry;
    }

    public String getUsfz() {
        return usfz;
    }

    public void setUsfz(String usfz) {
        this.usfz = usfz;
    }

    public String getUbirth() {
        return ubirth;
    }

    public void setUbirth(String ubirth) {
        this.ubirth = ubirth;
    }

    public Integer getUson() {
        return uson;
    }

    public void setUson(Integer uson) {
        this.uson = uson;
    }

    public Integer getUxl() {
        return uxl;
    }

    public void setUxl(Integer uxl) {
        this.uxl = uxl;
    }

    public String getUyhzh() {
        return uyhzh;
    }

    public void setUyhzh(String uyhzh) {
        this.uyhzh = uyhzh;
    }

    public Integer getUfh() {
        return ufh;
    }

    public void setUfh(Integer ufh) {
        this.ufh = ufh;
    }

    public String getUsfimage() {
        return usfimage;
    }

    public void setUsfimage(String usfimage) {
        this.usfimage = usfimage;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Integer getLocked() {
        return locked;
    }

    public void setLocked(Integer locked) {
        this.locked = locked;
    }
}