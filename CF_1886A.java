import java.util.Scanner;

public class CF_1886A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (n > 6 && n != 9) {
                System.out.println("YES");
                System.out.println("2 3 " + (n - 5));
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
