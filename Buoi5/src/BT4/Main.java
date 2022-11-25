package BT4;

import java.util.Scanner;

public class Main {
    private static Scanner sc=new Scanner(System.in);
    public static void tieuDe(){
        System.out.printf("%-15s %-10s %-15s %-15s %-15s %-15s %-10s %-10s\n","Họ Tên","Tuổi","Giới","Địa chỉ","Số giờ","Số tiền 1h","Lương","Thuế");
    }
    public static void Top3(NhanVien[]a, int n){
        for (int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i].tongGioLam()<a[j].tongGioLam()){
                    NhanVien temp= new NhanVien();
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }

        if(n>3)
            for(int k=0;k<3;k++){
                a[k].outPut();
            }
    }

    public static void timKiem(NhanVien[]a, int n){
        String timTen;
        System.out.println("Nhập tên cần tìm:");
        timTen=sc.nextLine();
        for(int i=0;i<n;i++){
            if(a[i].getHoTen().equals(timTen)){
                tieuDe();
                a[i].outPut();
                break;
            }else{
                System.out.println("Không tìm thấy tên nhân viên");
                break;
            }
        }
    }

    public static void them(NhanVien[]a, int n){
        for(int i=0;i<n;i++){
        a[i].inPut();
        break;
        }
    }

    public static void menu(){
        System.out.println("1.Thêm một nhân viên");
        System.out.println("2.Hiển thị danh sách");
        System.out.println("3.Hiển thị top 3 nhân viên lam việc cham chi nhat");
        System.out.println("4.Tìm kiếm theo họ tên");
        System.out.println("5.Thoát khỏi chương trình");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng nhân viên:");
        int n = sc.nextInt();
        BT4.NhanVien[] a = new BT4.NhanVien[n];
        for (int i = 0; i < n; i++) {
            a[i] = new BT4.NhanVien();
            a[i].inPut();
        }

        int luaChon;
        do{
            menu();
            System.out.println("Nhập lựa chọn:");
            luaChon=sc.nextInt();
            switch (luaChon){
                case 1:
                    them(a,n);
                    break;
                case 2:
                    System.out.println("====DANH SÁCH NHÂN VIÊN=========");
                    tieuDe();
                    for(int i=0;i<n;i++){
                        a[i].outPut();
                    }
                    break;
                case 3:
                    System.out.println("3 NHÂN VIÊN CHĂM CHI NHAT");
                    tieuDe();
                    Top3(a,n);
                    break;
                case 4:
                    System.out.println("TÌM KIẾM THEO HỌ TÊN");
                    timKiem(a,n);
                    break;
                case 5:
                    System.out.println("Bạn xác nhận thoát chương trình");
                    break;
                default:
                    System.out.println("Bạn đã nhập sai!!");
                    break;
            }
        }while(luaChon!=5);
    }
}
