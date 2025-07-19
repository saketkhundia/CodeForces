import java.util.Scanner;

public class  CF_2114A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // Number of test cases
        while (t-- > 0) {
            String s = sc.next();      // Read the 4-digit string
            int y = Integer.parseInt(s);  // Convert to integer

            int sqrt = (int) Math.sqrt(y);
            if (sqrt * sqrt != y) {
                System.out.println("-1");
            } else {
                // Any pair (a, b) such that a + b = sqrt is valid
                System.out.println("0 " + sqrt);
            }
        }
        sc.close();
    }
}
