import java.util.Scanner;

public class CF_2126A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int x = sc.nextInt();
            int minDigit = 9;
            int tmp = x;
            while (tmp > 0) {
                minDigit = Math.min(minDigit, tmp % 10);
                tmp /= 10;
            }
            System.out.println(minDigit);
        }
        sc.close();
    }
}
