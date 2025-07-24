import java.util.Scanner;

public class CF_2007A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            long l = sc.nextLong(), r = sc.nextLong();
            long n = r - l + 1;
            long odd = ((r + 1) / 2) - (l / 2);
            long maxPairs = odd / 2;
            long maxTriplets = n / 3;
            System.out.println(Math.min(maxPairs, maxTriplets));
        }
        sc.close();
    }
}
