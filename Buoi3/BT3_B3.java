import java.util.Scanner;

public class BT3_B3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+5];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int dem= 1 , max = 0 ;
        for( int i = 1 ; i < n ; i++ )
        {
            if ( a[ i ] >= a [ i - 1 ] ) dem++ ;
            else dem= 1 ;
            if ( dem > max ) max = dem ;
        }
        if ( dem > max ) max = dem ;
        System.out.println( "Do dai lon nhat la: " + max ) ;
    }
}

