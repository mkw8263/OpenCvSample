package com.project.opencvperson;

/**
 * 서버에서 받은 데이터 담을 클래스
 */

public class Items {
    private int cc_num;
    private String cc_count;
    private String cc_date;

    public Items(int cc_num, String cc_count, String cc_date) {
        this.cc_num = cc_num;
        this.cc_count = cc_count;
        this.cc_date = cc_date;
    }

    public int getCc_num() {
        return cc_num;
    }

    public void setCc_num(int cc_num) {
        this.cc_num = cc_num;
    }

    public String getCc_count() {
        return cc_count;
    }

    public void setCc_count(String cc_count) {
        this.cc_count = cc_count;
    }

    public String getCc_date() {
        return cc_date;
    }

    public void setCc_date(String cc_date) {
        this.cc_date = cc_date;
    }
}
