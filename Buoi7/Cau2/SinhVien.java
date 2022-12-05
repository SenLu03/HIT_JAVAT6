package Cau2;

import java.util.Scanner;

public class SinhVien {
    private int sBD;
    private  String hoTen;
    private String diaChi;
    private int mucUuTien;
    private String khoithi;
    KhoiThi khoiThi=new KhoiThi();

    public SinhVien(){
    }

    public SinhVien(int sBD, String hoTen, String diaChi, int mucUuTien) {
        this.sBD = sBD;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.mucUuTien = mucUuTien;
    }

    public int getsBD() {
        return sBD;
    }

    public void setsBD(int sBD) {
        this.sBD = sBD;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getMucUuTien() {
        return mucUuTien;
    }

    public void setMucUuTien(int mucUuTien) {
        this.mucUuTien = mucUuTien;
    }

    public String getKhoithi() {
        return khoithi;
    }

    public void setKhoithi(String khoithi) {
        this.khoithi = khoithi;
    }

    Scanner sc=new Scanner(System.in);
    public void inPut(){
        System.out.println("Nhập số báo danh:");
        setsBD(sc.nextInt());
        sc.nextLine();

        System.out.println("Nhập họ tên:");
        setHoTen(sc.nextLine());

        System.out.println("Nhập địa chỉ:");
        setDiaChi(sc.nextLine());

        System.out.println("Nhập mức ưu tiên:");
        setMucUuTien(sc.nextInt());
        sc.nextLine();

        System.out.println("Nhập khối thi:");
        setKhoithi(sc.nextLine());
        khoiThi.inPut();
    }
    public void outPut(){
        System.out.printf("%-15d %-15s %-10s %-15d %-10s ",getsBD(),getHoTen(),getDiaChi(),getMucUuTien(),getKhoithi());
        khoiThi.outPut();
    }
}
