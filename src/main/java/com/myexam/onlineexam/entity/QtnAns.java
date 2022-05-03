package com.myexam.onlineexam.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class QtnAns {
    @Id
    @GeneratedValue
    long qtnCode;
    String qtnAns;

    public QtnAns() {
    }

    public QtnAns(long qtnCode, String qtnAns) {
        this.qtnCode = qtnCode;
        this.qtnAns = qtnAns;
    }

    public long getQtnCode() {
        return qtnCode;
    }

    public void setQtnCode(long qtnCode) {
        this.qtnCode = qtnCode;
    }

    public String getQtnAns() {
        return qtnAns;
    }

    public void setQtnAns(String qtnAns) {
        this.qtnAns = qtnAns;
    }
}
