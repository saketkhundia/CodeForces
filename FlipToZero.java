import java.util.Scanner;

public class FlipToZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        while (t-- > 0) {
            String s = scanner.nextLine();
            int operations = 0;
            boolean inBlock = false;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    if (!inBlock) {
                        operations++;
                        inBlock = true;
                    }
                } else {
                    inBlock = false;
                }
            }

            System.out.println(operations);
        }

        scanner.close();
    }
}
