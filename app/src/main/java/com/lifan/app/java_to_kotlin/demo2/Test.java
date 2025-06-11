package com.lifan.app.java_to_kotlin.demo2;

/**
 * @author by LiFan
 * @date 2018/7/13
 */

class Test {
    public int n;
    private int nn;
    private int nnn;  // 可写不可读
    private int nnnn; // 可读不可写

    public int getNn() {
        return nn;
    }

    public void setNn(int nn) {
        this.nn = nn;
    }

    public void setNnn(int nnn) {
        this.nnn = nnn;
    }

    public int getNnnn() {
        return nnnn;
    }
}
