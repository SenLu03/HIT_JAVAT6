import java.util.Scanner;

public class BT1_B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang:");
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        input(a,n,b);
        sapxep(a,n);
        soLanXuatHien(a,n,b);

    }

    public static void input(int []a, int n,int []b){
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu "+ i + ":");
            a[i] = new Scanner(System.in).nextInt();
            b[i] = -1;
        }
    }
    public static void sapxep(int []a, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    public static void soLanXuatHien(int []a,int n,int []b){
        int dem;
        for (int i = 0; i < n; i++) {
            dem = 1;
            for (int j = i + 1; j < n; j++) {
                if (b[j] != 0 && a[i] == a[j]) {
                    dem++;
                    b[j] = 0;
                }
            }
            if (b[i] != 0) {
                b[i] = dem;
            }

        }
        for (int i = 0; i < n; i++) {
            if (b[i] > 0) {
                System.out.println("So " + a[i] + " xuat hien " + b[i] + " lan");
            }
        }
    }
}
