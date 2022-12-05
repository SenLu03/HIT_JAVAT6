package Cau4;

import java.util.Scanner;

public class CBGV {
    private double luongCung;
    private double luongThuong;
    private double luongPhat;

    public CBGV(){
    }

    public CBGV(double luongCung, double luongThuong, double luongPhat) {
        this.luongCung = luongCung;
        this.luongThuong = luongThuong;
        this.luongPhat = luongPhat;
    }

    public double getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(double luongCung) {
        this.luongCung = luongCung;
    }

    public double getLuongThuong() {
        return luongThuong;
    }

    public void setLuongThuong(double luongThuong) {
        this.luongThuong = luongThuong;
    }

    public double getLuongPhat() {
        return luongPhat;
    }

    public void setLuongPhat(double luongPhat) {
        this.luongPhat = luongPhat;
    }
    Scanner sc=new Scanner(System.in);
    public void inPut(){
        System.out.println("Nhập lương cứng:");
        setLuongCung(sc.nextDouble());
        System.out.println("Nhập lương thưởng:");
        setLuongThuong(sc.nextDouble());
        System.out.println("Nhập lương phạt:");
        setLuongPhat(sc.nextDouble());
    }
    public double luong(){
        double tongLuong=0;
        tongLuong+=(luongCung+luongThuong)-luongPhat;
        return tongLuong;
    }

    public void outPut(){
        System.out.printf("%-15f %-15f %-15f %-15f\n",getLuongCung(),getLuongThuong(),getLuongPhat(),luong());
    }
}
