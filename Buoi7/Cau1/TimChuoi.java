package Cau1;


import java.util.ArrayList;
import java.util.Scanner;

public class TimChuoi {
    static ArrayList<chuoi> chuois = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        chuoi chuoi = new chuoi();
        do {
            System.out.println("DANH SACH CAC LUA CHON");
            System.out.println("1- Nhap vap chuoi");
            System.out.println("2- Hien thi chuoi vua nhap");
            System.out.println("3- Dua ra chuoi can tim kiem");

            int choese = sc.nextInt();
            sc.nextLine();
            switch (choese) {
                case 1:
                    nhap();
                    break;
                case 2:
                    System.out.println("chuoi vua nhap la: ");
                    xuat();
                    break;
                case 3:
                    System.out.println("Cac chuoi thoa man la: ");
                    timKiemChuoi() ;
                    break;
            }
        }
        while (true);
    }

    private static void nhap() {
        chuoi newTimChuoi = new chuoi();
        newTimChuoi.inPut();
        chuois.add(newTimChuoi);
    }

    private static void title() {
        System.out.printf("%10s \n", "Chuỗi là");
    }

    public static boolean listEmpty() {
        if (chuois.size() != 0) return true;
        else return false;
    }

    private static void xuat() {
        if (listEmpty()) {
            title();
            for (int i = 0; i < chuois.size(); i++) {
                chuois.get(i).outPut();
                ;
            }
        } else {
            System.out.println("Khong co chuoi ten nao duoc thanh lap!");
        }
    }

    private static void timKiemChuoi() {
        if (listEmpty()) {
            System.out.println("Nhap vao chuoi muon tim: ");
           String ch=sc.nextLine();

            int dem = 0;
            for (int i = 0; i < chuois.size(); i++) {
                if (chuois.get(i).getChuoi().equals(ch)) {
                    dem++;
                    title();
                    chuois.get(i).outPut();
                    break;
                }else{
                    System.out.println("Không có chuỗi này!");
                    break;
                }
            }
        } else {
            System.out.println("Chua co chuoi nao duoc thanh lap!");
        }

    }
}


