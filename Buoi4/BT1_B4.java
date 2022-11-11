import java.util.Scanner;
public class BT1_B4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dem = new int[256];
        String s = sc.nextLine();
        s = s.replaceAll(" ", "");
        s=s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            dem[s.charAt(i)]++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (dem[s.charAt(i)]!= 0) {
                System.out.println(s.charAt(i) + ":" + dem[s.charAt(i)]);
                dem[s.charAt(i)] = 0;
            }
        }
    }
}

