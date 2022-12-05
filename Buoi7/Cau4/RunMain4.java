package Cau4;

import HOCSINH.SinhVien;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain4 {
   static Scanner sc=new Scanner(System.in);
    static ArrayList<Nguoi> Nguois= new ArrayList<>();
    public static void main(String[] args) {
        Nguoi ng= new Nguoi();
       do{
           System.out.println("-----DANH SÁCH CÁC LỰA CHỌN-----");
           System.out.println("1.Thêm giáo viên");
           System.out.println("2.Hiển thị danh sách");
           System.out.println("3.Xóa giáo viên theo MaGV");
           int chose=sc.nextInt();
           switch (chose){
               case 1:
                   nhap();
                   break;
               case 2:
                   xuat();
                   break;
               case 3:
                   xoaGV();
                   break;


           }

       }while (true);
    }
    private static void xoaGV(){
        if (ListEmpty()){
            System.out.println("Nhập mã giáo viên cần xóa:");
            int mgv=sc.nextInt();
            for(int i=0;i<Nguois.size();i++){
                if(Nguois.get(i).getMaGV()==mgv){
                        Nguois.remove(i);
                }
            }

        }else{
            System.out.println("Chưa có giáo viên nào!");
        }
    }
    private static void nhap(){
        System.out.println("Nhập thông tin giáo viên:");
        Nguoi themGV=new Nguoi();
        themGV.inPut();
        Nguois.add(themGV);
    }
    private static void title(){
        System.out.printf("%-15s %-15s %-10s %-15s %-15s %-15s %-15s %-15s\n","Họ Tên","Tuổi","Địa Chỉ","Mã giáo viên","Lương cứng","Lương thưởng","Lương phạt","Tổng lương");
    }
    private static void xuat(){
        if(ListEmpty()){
            title();
            for(Nguoi item:Nguois){
                item.outPut();
            }
        }else{
            System.out.println("Chưa có giáo viên nào!");
        }}
    public static boolean ListEmpty(){
        return Nguois.size()!=0;
    }
}
