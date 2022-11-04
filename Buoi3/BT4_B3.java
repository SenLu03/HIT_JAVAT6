import java.util.Scanner;

public class BT4_B3 {
    public static int  KTSNT(int n){
        if(n<2) return 0;
        for(int i=2;i<=Math.sqrt(n);i++) {
            if (n % i == 0) return 0;
        }
                return 1;
    }
    public static int Check(int n){
        while(n>0){
            if(KTSNT(n)==1){
                return 1;
            }
            n/=10;
        }
        return 0;
    }
    public static void XuLy(int []a,int n){
        int dem=0;
        for(int i=0;i<n;i++){
            if(KTSNT(a[i])==1){
                if(Check(a[i])==1){
                    System.out.print(a[i]+" ");
                    dem++;
                }
            }
        }
        if(dem==0){
            System.out.println("NO");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int [n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        XuLy(a,n);
    }
}
