package Cau3;

import java.util.Scanner;

public class HocSinh {
    private String hoTen;
    private int tuoi;
    private String queQuan;
    private Lop lop=new Lop();
    public HocSinh(){
    }

    public HocSinh(String hoTen, int tuoi, String queQuan) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.queQuan = queQuan;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }
    Scanner sc=new Scanner(System.in);

    public void inPut(){
        System.out.println("Nhập tên HS:");
        setHoTen(sc.nextLine());

        System.out.println("Nhập tuổi:");
        setTuoi(sc.nextInt());
        sc.nextLine();

        System.out.println("Nhập quê quán:");
        setQueQuan(sc.nextLine());
        lop.inPut();

    }
    public  void outPut(){
        System.out.printf("%-15s %-10d %-20s",getHoTen(),getTuoi(),getQueQuan());
        lop.outPut();
    }
}
