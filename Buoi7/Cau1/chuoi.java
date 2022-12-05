package Cau1;

import java.util.Scanner;

public class chuoi {
    private String chuoi;
    public chuoi(){
    }

    public chuoi(String chuoi) {
        this.chuoi = chuoi;
    }

    public String getChuoi() {
        return chuoi;
    }

    public void setChuoi(String chuoi) {
        this.chuoi = chuoi;
    }
    Scanner sc=new Scanner(System.in);
    public  void inPut(){
        System.out.println("Nhập chuỗi:");
        setChuoi(sc.nextLine());
    }
    public void outPut(){
        System.out.printf("%10s\n",getChuoi());
    }
}
