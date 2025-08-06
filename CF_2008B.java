import java.util.Scanner;

public class CF_2008B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            String s = sc.next();
            long r = (long) Math.sqrt(n);

            if (r * r != n) {
                System.out.println("No");
            } else {
                long zeroCount = s.chars().filter(ch -> ch == '0').count();
                long requiredZeros = (r >= 2) ? (r - 2) * (r - 2) : 0;

                System.out.println(zeroCount == requiredZeros ? "Yes" : "No");
            }
        }
        sc.close();
    }
}
    