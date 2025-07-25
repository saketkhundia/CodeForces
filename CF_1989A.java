import java.util.Scanner;

public class CF_1989A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(y >= -1 ? "YES" : "NO");
        }
        sc.close();
    }
}
