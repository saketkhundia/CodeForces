import java.util.Scanner;

public class CF_1987A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long result = 1 + (n - 1) * k;
            System.out.println(result);
        }
        sc.close();
    }
}
