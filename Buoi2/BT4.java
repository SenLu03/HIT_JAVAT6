import java.util.Scanner;

public class BT4 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n;
        do {
           System.out.println("Nhap so nguyen n:");
           n= scanner.nextInt();
        } while ( n<=0);
        int du;
        int []a=new int [100];
        int i=0;
        while(n!=0) {
            du = n % 10;
            double k=Math.sqrt(du);
            if(k*k==du){
                a[i++]=du;
            }
            n = n / 10;
        }
        if(i==0){
            System.out.println("No");
        }
        for(int j=i-1;j>=0;j--){
            System.out.print(a[j]+" ");
        }
    }
}
