import java.util.Scanner;

public class BT3 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int x , y , z;
        for(x = 1; x<100; x++){
            for(y = 1; y<100; y++){
                for(z = 1; z<100; z++){
                    if(((x + y + z)==100) && ( x*15 + y*9 + z)==300){
                        System.out.println("So trau dung:"+x);
                        System.out.println("So trau nam:"+y);
                        System.out.println("So tra gia:"+z);
                        System.out.println("-----------");
                    }
                }
            }
        }
    }
}
