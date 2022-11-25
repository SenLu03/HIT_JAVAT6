package BT3;

import java.util.Scanner;

public class SinhVien1 {
    private static Scanner sc=new Scanner(System.in);
    private static int count=1;
    private int msv;
    private String hoTen;
    private String diaChi;
    private long std;
    private float diemSo;

    public SinhVien1(){
        this.msv=count++;
    }

    public SinhVien1(String hoTen, String diaChi, long std, float diemSo) {
        this.msv =count++;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.std = std;
        this.diemSo = diemSo;
    }

    public int getMsv() {
        return msv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public long getStd() {
        return std;
    }

    public float getDiemSo() {
        return diemSo;
    }

    public void setId(int id) {
        this.msv =count++;
    }

    public boolean setHoTen(String hoTen) {
        String ten=hoTen.trim();
        for(int i=0;i<ten.length();i++){
            if(ten.charAt(i)==' '){
                this.hoTen=ten;
                return true;
            }
        }
        System.err.println("Nhập lại tên sinh viên");
        return false;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public boolean setStd(long std) {
       if(std>1000000 && std<10000000){
           this.std=std;
           return true;
       } else{
           System.err.println("Nhập lại số điện thoại");
           return false;
       }
    }


    public boolean setDiemSo(float diemSo) {
        if(diemSo>=0.0 && diemSo<=10.0){
        this.diemSo = diemSo;
        return true;
        }
        System.err.println("Nhập lại điểm của sinh viên");
        return false;
    }
    public void inPut() {
        System.out.println("Nhập họ tên SV:");
        while (true) {
            String ten= sc.nextLine();
            boolean check = setHoTen(ten);
            if (check) {
                break;
            }
        }
        System.out.println("Nhập địa chỉ:");
        setDiaChi(sc.nextLine());
        System.out.println("Nhập số điện thoại:");
        while (true) {
            long std = sc.nextLong();
            boolean check = setStd(std);
            if (check) {
                break;
            }
        }

        System.out.println("Nhập điểm:");
        while (true) {
            float diemSo = sc.nextFloat();
            boolean check = setDiemSo(diemSo);
            if (check) {
                break;
            }
        }
        sc.nextLine();
    }




    @Override
    public String toString() {
        return String.format("%-15d %-20s %-20s %-20s %-20f",getMsv(),getHoTen(),getDiaChi(),getStd(),getDiemSo()) ;
    }
}
