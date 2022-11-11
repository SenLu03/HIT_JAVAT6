import java.util.Scanner;

public class BT5_B4 {
    private static int[] value = { 1, 5, 10, 50, 100, 500, 1000 };
    private static char[] key = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };

    private static int map(char c) {
        for (int i = 0; i < key.length; i++) {
            if (c == key[i]) {
                return value[i];
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int tmp = map(s.charAt(s.length() - 1));
        for (int i = s.length() - 2; i >= 0; i--) {
            int first = map(s.charAt(i));
            int second = map(s.charAt(i + 1));
            if (first >= second) {
                tmp += first;
            } else {
                tmp -= first;
            }
        }
        System.out.println(tmp);
    }
}
