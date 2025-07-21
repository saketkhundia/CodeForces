import java.util.Scanner;

public class CF_2002A{ 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            long n = sc.nextLong();
            long m = sc.nextLong();
            long k = sc.nextLong();
            long a = Math.min(n, k);
            long b = Math.min(m, k);
            System.out.println(a * b);
        }
        sc.close();
    }
}
