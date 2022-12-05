package Cau3;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain3 {
    static Scanner sc=new Scanner(System.in);
    static ArrayList <HocSinh> students= new ArrayList<>();
    public static void main(String[] args) {
        HocSinh hocSinh=new HocSinh();
        do{
            menu();
            System.out.println("Nhập lựa chọn:");
            int chose=sc.nextInt();
            sc.nextLine();
            switch (chose){
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    hienThiThongTinHS20T();
                    break;
                case  4:
                    timSV();
                    break;
                case 5:
                    sapXepTheoQueQuan();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Chức năng không hợp lệ!");
                    break;
            }
        }while (true);
    }

    public static void sapXepTheoQueQuan() {
        if (students.size() >= 2) {
            for (int i = 0; i < students.size() - 1; i++) {
                for (int j = i + 1; j < students.size(); j++) {
                    if (students.get(i).getQueQuan().compareTo(students.get(j).getQueQuan()) > 0) {
                        HocSinh item = students.get(i);
                        students.set(i, students.get(j));
                        students.set(j, item);
                    }
                }

            }
            for(HocSinh i:students){
                i.outPut();
            }
        }else{
            System.out.println("Không thể sắp xếp!");
        }
    }
    public static void timSV() {
        if (ListEmpty()) {
            int dem = 0;
            title();
            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).getTuoi()== 23 && students.get(i).getQueQuan().compareTo("DN")==0) {
                    students.get(i).outPut();
                    dem++;
                }
            }
            System.out.println("Số sinh viên 23 tuổi và quê ở DN là:"+dem);
        }else{
            System.out.println("Chưa có sinh viên nào!");
        }
    }

    public static void hienThiThongTinHS20T() {
        if (ListEmpty()) {
            int dem = 0;
            title();
            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).getTuoi() == 20) {
                    students.get(i).outPut();
                    dem++;
                }
            }
            if (dem == 0) {
                System.out.println("Không có sinh viên tuổi 20");
            }
        }else{
            System.out.println("Chưa có sinh viên nào!");
        }
    }
    private static void nhap(){
        System.out.println("Nhập thông tin sinh viên:");
        HocSinh newHocSinh=new HocSinh();
        newHocSinh.inPut();
        students.add(newHocSinh);
    }
    private static  void title(){
        System.out.printf("%-15s %-10s %-20s %-10s %-10s\n","Họ và Tên","Tuổi","Quê quán", "Mã Lớp", "Tên Lớp");

    }
    public static void menu(){
        System.out.println("1.Thêm 1 học sinh mới");
        System.out.println("2.Xuất ra thông tin các học sinh");
        System.out.println("3.Hiển thị các học sinh 20 tuổi");
        System.out.println("4.Tìm các học sinh có tuổi là 23 và quê ở DN");
        System.out.println("5.Sắp xếp sinh viên tăng dần theo quê quán");
        System.out.println("6.Thoát khỏi chương trình");
    }
    private static void xuat() {
        if (ListEmpty()) {
            System.out.println("=============THÔNG TIN CỦA SINH VIÊN===================");
            title();
            for (HocSinh item : students) {
                item.outPut();
            }
        } else {
            System.out.println("Chưa có sinh viên nào");
        }
    }
    public static boolean ListEmpty(){
        return students.size()!=0;
    }

}
