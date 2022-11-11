import java.util.Scanner;

public class BT4_B4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        //chu thuong toan bo
        s= s.toLowerCase();
        //xoa trang thua hai dau và giua
        s=s.replaceAll("\\s\\s+"," ").trim();

        //xoa ki tu so
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='0' && c<='9'){
                s=s.replace(String.valueOf(c),"");
                i--;
            }
        }
        //doi chu hoa ki tu dau
        String []arr=s.split(" ");
        String s1=" ";
        for(String x:arr){
            s1+= (x.substring(0,1).toUpperCase()) +  x.substring(1);
            s1=s1+ " ";
        }
        System.out.println(s1);
    }
}
