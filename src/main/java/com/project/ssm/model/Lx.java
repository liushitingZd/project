package com.project.ssm.model;

public class Lx {
    private Integer lid;

    private Integer min;

    private Integer max;

    private Double lx;

    private Double wyj;

    public Lx(Integer lid, Integer min, Integer max, Double lx, Double wyj) {
        this.lid = lid;
        this.min = min;
        this.max = max;
        this.lx = lx;
        this.wyj = wyj;
    }

    public Lx() {
        super();
    }

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public Double getLx() {
        return lx;
    }

    public void setLx(Double lx) {
        this.lx = lx;
    }

    public Double getWyj() {
        return wyj;
    }

    public void setWyj(Double wyj) {
        this.wyj = wyj;
    }
}