package BT4;

import java.util.Scanner;

public class NhanVien {
    private String hoTen;
    private int tuoi;
    private String gioiTinh;
    private String diaChi;
    private int soGioLV;
    private int soTien1H;
    public NhanVien(){
    }

    public NhanVien(String hoTen, int tuoi, String gioiTinh, String diaChi, int soGioLV, int soTien1H) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.soGioLV = soGioLV;
        this.soTien1H = soTien1H;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public int getSoGioLV() {
        return soGioLV;
    }

    public int getSoTien1H() {
        return soTien1H;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setSoGioLV(int soGioLV) {
        this.soGioLV = soGioLV;
    }

    public void setSoTien1H(int soTien1H) {
        this.soTien1H = soTien1H;
    }

    public long tongGioLam() {
        if(soGioLV>=45){
            return soGioLV=45+(soGioLV-45)*(3/2);
        }else{
            return soGioLV;
        }
    }
    public double luong(){
        return tongGioLam()*getSoTien1H();
    }
    public  double dongThue(){
        double thue=0;
        if(luong()> 300){
            return thue=(float)luong()*(20/100);
        }else{
            return 0;
        }
    }





    Scanner sc=new Scanner(System.in);
    public void inPut(){
        System.out.println("Nhap ten:");
        setHoTen(sc.nextLine());

        System.out.println("Nhap tuoi:");
        setTuoi(sc.nextInt());
        sc.nextLine();

        System.out.println("Nhap gioi tinh:");
        setGioiTinh(sc.nextLine());

        System.out.println("Nhap dia chi:");
        setDiaChi(sc.nextLine());

        System.out.println("Nhap so gio lam viec:");
        setSoGioLV(sc.nextInt());

        System.out.println("Nhap so tien moi gio:");
        setSoTien1H(sc.nextInt());
        sc.nextLine();
    }

    public void outPut(){
        System.out.printf("%-15s %-10d %-15s %-15s %-15d %-15d %-10f %-10f\n",getHoTen(),getTuoi(),getGioiTinh(),getDiaChi(),getSoGioLV(),getSoTien1H(),luong(),dongThue());
    }
}
