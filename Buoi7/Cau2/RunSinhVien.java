package Cau2;

import java.util.ArrayList;
import java.util.Scanner;

public class RunSinhVien {
    static Scanner sc=new Scanner(System.in);
    static ArrayList<SinhVien> sinhViens=new ArrayList<>();
    public static void main(String[] args) {
        SinhVien sv=new SinhVien();
        do{
            menu();
            System.out.println("Nhập lựa chọn của bạn:");
            int chose=sc.nextInt();
            switch (chose){
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    timKiemTheoSBD();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }

        }while(true);
    }

    private static void timKiemTheoSBD() {
        if (ListEmpty()) {
            System.out.println("Nhập SBD cần tìm:");
            int sbd = sc.nextInt();
            for (int i = 0; i < sinhViens.size(); i++) {
                if (sinhViens.get(i).getsBD() == sbd) {
                    sinhViens.get(i).outPut();
                }
            }
        }
    }

    private static void nhap(){
        System.out.println("Nhập thông tin sinh viên:");
        SinhVien addSV=new SinhVien();
        addSV.inPut();
        sinhViens.add(addSV);
    }
    private static void title(){
        System.out.printf("%-15s %-15s %-10s %-15s %-10s %-10s %-10s %-10s\n","Số báo danh","Họ Tên","Địa Chỉ","Mức ưu tiên","Khối thi","Môn 1","Môn2","Môn 3");
    }
    private static void menu(){
        System.out.println("1.Thêm mới thí sinh");
        System.out.println("2.Hiển thị thông tin và khối thi thí sinh");
        System.out.println("3.Tìm kiếm theo số báo danh");
        System.out.println("4.Thoát khỏi chương trình");
    }
    private static void xuat(){
    if(ListEmpty()){
        title();
        for(SinhVien item:sinhViens){
            item.outPut();
        }
    }else{
        System.out.println("Chưa có sinh viên nào!");
    }}

    public static boolean ListEmpty(){
        return sinhViens.size()!=0;
    }
}
