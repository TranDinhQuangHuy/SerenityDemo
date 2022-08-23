package model;

public class tinh {
    private int so1;
    private int so2;
    private int tong;
    private int hieu;


    public tinh() {
    }

    public tinh(int so1, int so2, int tong, int hieu) {
        this.so1 = so1;
        this.so2 = so2;
        this.tong = tong;
        this.hieu = hieu;
    }

    public int getSo1() {
        return so1;
    }

    public void setSo1(int so1) {
        this.so1 = so1;
    }

    public int getSo2() {
        return so2;
    }

    public void setSo2(int so2) {
        this.so2 = so2;
    }

    public int getTong() {
        return tong;
    }

    public void setTong(int tong) {
        this.tong = tong;
    }

    public int getHieu() {
        return hieu;
    }

    public void setHieu(int hieu) {
        this.hieu = hieu;
    }

    public int tinh_tong(){
        return so1 + so2;
    }

    public int tinh_hieu(){
        return so1 - so2 + 1;
    }
}
