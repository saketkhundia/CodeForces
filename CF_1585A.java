import java.util.Scanner;

public class CF_1585A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int score = 1; 
            boolean dead = false;

            for (int i = 0; i < n; i++) {
                if (a[i] == 1) {
                    if (i > 0 && a[i - 1] == 1) {
                        score += 5;
                    } else {
                        score += 1;
                    }
                } else {
                    if (i > 0 && a[i - 1] == 0) {
                        score = -1;
                        dead = true;
                        break;
                    }
                }
            }

            System.out.println(score);
        }
        sc.close();
    }
}
