import java.util.Scanner;

public class BT3_B4 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("Nhap chuoi: ");
        str=sc.nextLine();
        boolean check= false;
        float tong=0;
        int dem=0;

        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
             int tem=c-48;
            if(tem>=0 && tem<=9){
                check=true;
                tong+=tem;
                dem++;
           }
        }
        float res=tong/dem;
        if(dem==0){
            System.out.println("False");
        }else{
            System.out.println("true"+ " "+ (double)Math.round(res*1000)/1000);
        }
    }
}
