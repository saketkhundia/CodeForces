import java.util.*;

public class CF_1530A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String n = sc.next();
            int maxDigit = 0;
            for (char c : n.toCharArray()) {
                maxDigit = Math.max(maxDigit, c - '0');
            }
            System.out.println(maxDigit);
        }
        sc.close();
    }
}
