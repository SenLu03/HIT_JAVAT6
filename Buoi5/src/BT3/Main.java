package BT3;

import java.util.Scanner;

public class Main {
    private static Scanner sc=new Scanner(System.in);
    public static void tieuDe(){
        System.out.printf("%-20s %-20s %-20s %-20s %-10s\n","Mã Sinh viên","Họ tên","Địa chỉ","Số điện thoại","Điểm số");
    }
    public static void menu(){
        System.out.println("1.Xuất danh sách theo thứ tự tăng dần của điểm");
        System.out.println("2.Tìm kiếm theo tên");
        System.out.println("3.Sắp xếp danh sách theo Tên cho phép theo chiều tăng");
        System.out.println("4.Thoát khỏi chương trình");
    }
    public static void sapXep(SinhVien1 []a, int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i].getDiemSo()<a[j].getDiemSo()){
                    SinhVien1 temp=new SinhVien1();
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i].toString());
        }
    }

    public static void timKiem(SinhVien1[]a, int n){
        String timTen;
        System.out.println("Nhập tên cần tìm:");
        timTen=sc.nextLine();
        for(int i=0;i<n;i++){
            if(a[i].getHoTen().equals(timTen)){
                tieuDe();
                System.out.println(a[i].toString());
                break;
            }else{
                System.out.println("Không tìm thấy tên nhân viên");
                break;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập số lượng sinh viên:");
        int n=sc.nextInt();
        SinhVien1 []a=new SinhVien1[n];
        for(int i=0;i<n;i++){
            a[i]=new SinhVien1();
            a[i].inPut();
        }
        int luaChon;
        do{
            menu();
            System.out.println("Nhập lựa chọn:");
            luaChon=sc.nextInt();
            switch (luaChon){
                case 1:
                    tieuDe();
                    sapXep(a,n);
                    break;

                case 2:
                    System.out.println("TÌM KIẾM THEO HỌ TÊN");
                    timKiem(a,n);
                    break;
                case 3:
                    System.out.println("SẮP XẾP DANH SÁCH TÊN THEO CHIỀU TĂNG");

                case 4:
                    System.out.println("Bạn đã thoát khỏi chương trình");
                    break;
                default:
                    System.out.println("Bạn đã nhập sai!!");
                    break;
            }
        }while(luaChon!=4);

    }
}
