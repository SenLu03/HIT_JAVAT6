package Cau2;

import java.util.Scanner;

public class KhoiThi {
    private String mon1;
    private String mon2;
    private String mon3;
    public KhoiThi(){
    }

    public KhoiThi(String mon1, String mon2, String mon3) {
        this.mon1 = mon1;
        this.mon2 = mon2;
        this.mon3 = mon3;
    }

    public String getMon1() {
        return mon1;
    }

    public void setMon1(String mon1) {
        this.mon1 = mon1;
    }

    public String getMon2() {
        return mon2;
    }

    public void setMon2(String mon2) {
        this.mon2 = mon2;
    }

    public String getMon3() {
        return mon3;
    }

    public void setMon3(String mon3) {
        this.mon3 = mon3;
    }
    Scanner sc=new Scanner(System.in);
    public void inPut(){
        System.out.println("Nhập môn 1:");
        setMon1(sc.nextLine());
        System.out.println("Nhập môn 2:");
        setMon2(sc.nextLine());
        System.out.println("Nhập môn 3:");
        setMon3(sc.nextLine());
    }

    public void outPut(){
        System.out.printf("%-10s %-10s %-10s\n",getMon1(),getMon2(),getMon3());

    }
}
