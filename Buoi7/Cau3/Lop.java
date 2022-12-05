package Cau3;

import java.util.Scanner;

public class Lop {
    private String maLop;
    private String tenLop;

    public Lop(){
    }

    public Lop(String maLop, String tenLop) {
        this.maLop = maLop;
        this.tenLop = tenLop;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }
    Scanner sc=new Scanner(System.in);
    public void inPut(){
        System.out.println("Nhập mã lớp:");
        setMaLop(sc.nextLine());

        System.out.println("Nhập tên Lớp:");
        setTenLop(sc.nextLine());
    }
    public void outPut(){
        System.out.printf("%-10s %-10s\n",getMaLop(),getTenLop());
    }
}
