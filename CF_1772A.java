import java.util.Scanner;

public class CF_1772A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int a = s.charAt(0) - '0'; 
            int b = s.charAt(2) - '0'; 
            System.out.println(a + b);
        }
        sc.close();
    }
}
