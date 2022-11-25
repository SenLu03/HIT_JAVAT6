package BT1;

import java.util.Scanner;

public class NhanVien {

    private int id;
    private String hoTen;
    private String kieuNhanVien;
    private int soNgayLam;
    private int namVaoLam;

    private static int cnt=1;

    public NhanVien(){
        this.id=cnt++;
    }

    public int getId() {
        return id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getKieuNhanVien() {
        return kieuNhanVien;
    }

    public int getSoNgayLam() {
        return soNgayLam;
    }

    public int getNamVaoLam() {
        return namVaoLam;
    }


    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setKieuNhanVien(String kieuNhanVien) {
        this.kieuNhanVien = kieuNhanVien;
    }

    public void setSoNgayLam(int soNgayLam) {
        this.soNgayLam = soNgayLam;
    }

    public void setNamVaoLam(int namVaoLam) {
        this.namVaoLam = namVaoLam;
    }

    public int luongNhanVien(){
        int luong=0;
        if(kieuNhanVien=="San Xuat")
            luong=(int)this.soNgayLam*350000;
        else
            luong=(int )this.soNgayLam*400000;
        return luong;
    }
    public int phuCap(){
        int luongPhuCap=100000 + (2022-(int)this.namVaoLam)*200000;
        return luongPhuCap;
    }

    public int tongLuongNV(){
        int tongLuong= luongNhanVien()+ phuCap();
        return tongLuong;
    }

    Scanner sc=new Scanner(System.in);

    public void inPut(){
        System.out.println("Nhap ten nhan vien:");
        setHoTen(sc.nextLine());
        System.out.println("Nhap kieu nv:");
        String kieuNhanVien=null;
        do{
           kieuNhanVien=sc.nextLine();
        }while(!kieuNhanVien.equals("San Xuat") && !kieuNhanVien.equals("Van Phong"));
        setKieuNhanVien(kieuNhanVien);
        System.out.println("Nhap so ngay lam:");
        setSoNgayLam(sc.nextInt());
        System.out.println("Nhap so nam vao lam:");
        setNamVaoLam(sc.nextInt());
    }
    public void outPut(){
        System.out.printf("%-10d %-20s %-15s %-15d %-15d %-15d %-10d %-30d",
                getId(),getHoTen(),getKieuNhanVien(),getSoNgayLam(),getNamVaoLam(),luongNhanVien(), phuCap(),tongLuongNV());
    }
}
