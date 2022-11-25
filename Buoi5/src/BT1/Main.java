package BT1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so luong NV:");
        int n=sc.nextInt();


        NhanVien []a=new NhanVien[n];
        for(int i=0;i<n;i++){
            a[i]=new NhanVien();
            a[i].inPut();
        }

        System.out.printf("%-10s %-20s %-15s %-15s %-15s %-15s %-15s %-10s\n",
                "ID","Ten","Kieu","So ngay lam","Nam bat dau","Luong","Phu cap","Tong");
//        for(int i=0;i<n;i++){
//            a[i].outPut();
//        }
        for(NhanVien nv:a){
            nv.outPut();
        }
    }
}
