package com.alipay.test.start_spring_boot.entity;

import java.sql.Date;

/**
 * Created by dly on 2018/7/13
 */
public class UserLowCarbon {
    private String seq;
    private String userId;
    private Date dataDt;
    private Integer lowCarbon;

    public UserLowCarbon(String seq, String userId, Date dataDt, Integer lowCarbon) {
        this.seq = seq;
        this.userId = userId;
        this.dataDt = dataDt;
        this.lowCarbon = lowCarbon;
    }

    public String getSeq() {
        return seq;
    }

    public String getUserId() {
        return userId;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setDataDt(Date dataDt) {
        this.dataDt = dataDt;
    }

    public void setLowCarbon(Integer lowCarbon) {
        this.lowCarbon = lowCarbon;
    }

    public Date getDataDt() {

        return dataDt;
    }

    public Integer getLowCarbon() {
        return lowCarbon;
    }

    @Override
    public String toString() {
        return "UserLowCarbon{" +
                "seq='" + seq + '\'' +
                ", userId='" + userId + '\'' +
                ", dataDt=" + dataDt +
                ", lowCarbon=" + lowCarbon +
                '}';
    }
}
