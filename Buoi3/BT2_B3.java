import java.util.Scanner;

public class BT2_B3 {
    public static void outPut(int x, int y){
        for(int i=x+1;i<y;i++){
            System.out.print(i + " ");
        }
    }
    public static void Tinh(int []a, int n){
        int dem=0;
        for(int i=0;i<n;i++){
            if(a[i+1]-a[i]==1){
                dem++;
            }
            if(a[i+1]-a[i]>=2){
                outPut(a[i],a[i+1]);
            }
        }
        if(dem==n){
            System.out.println("YES");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Nhap n: ");
        n=sc.nextInt();
        int[] a=new int [n+5];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Tinh(a,n);
    }
}
