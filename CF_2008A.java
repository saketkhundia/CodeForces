import java.util.Scanner;

public class CF_2008A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            boolean ok = (a % 2 == 0) && (a > 0 || b % 2 == 0);
            System.out.println(ok ? "Yes" : "No");
        }
        sc.close();
    }
}
