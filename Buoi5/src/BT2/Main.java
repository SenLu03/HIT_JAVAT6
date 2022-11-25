package BT2;

import java.util.Scanner;

public class Main {
    public static void sapXep( Car []a, int n ) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i].giaHienTai() < a[j].giaHienTai()) {
                    Car temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in ) ;

        System.out.println("Nhap vao so luong oto: ") ;
        int n = sc.nextInt() ;

        System.out.println("Nhap vao " + n + " oto : ") ;
        System.out.println() ;

        Car[] a = new Car[ n ] ;
        for( int i = 0 ; i < n ; i++ )
        {
            System.out.println("Nhap thong tin oto thu " + ( i + 1 ) ) ;
            System.out.println() ;
            a[ i ] = new Car() ;
            a[ i ].input() ;
        }

        System.out.println("-----DANH SACH CAC XE OTO-----") ;
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s %n" , "Chu so huu" , "Ten xe" , "Hang" , "Gia" , "Nam su dung" , "Gia tri hien tai") ;
        for ( int i = 0 ; i < n ; i++)
        {
            a[ i ].output() ;
        }

        System.out.println();
        System.out.println();

        System.out.println("================DANH SACH XE OTO SAU KHI SAP XEP======================");
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s %n" , "Chu so huu" , "Ten xe" , "Hang" , "Gia" , "Nam su dung" , "Gia tri hien tai") ;
        sapXep(a,n);
        for ( int i = 0 ; i < n ; i++)
        {
            a[ i ].output() ;
        }

        System.out.println();
        System.out.println();

        System.out.println("================DANH SACH XE OTO HET GIA TRI SU DUNG======================");
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s %n" , "Chu so huu" , "Ten xe" , "Hang" , "Gia" , "Nam su dung" , "Gia tri hien tai") ;
        for ( int i = 0 ; i < n ; i++ )
        {
            if ( a [ i ].giaHienTai() <= 0 )
            {
                a [ i ].output() ;
            }
        }

    }
}
