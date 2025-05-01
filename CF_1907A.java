import java.util.Scanner;

public class CF_1907A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        sc.nextLine();

        for (int i = 0; i < t; i++) {
            String pos = sc.nextLine();
            char col = pos.charAt(0); 
            char row = pos.charAt(1);          
            for (char r = '1'; r <= '8'; r++) {
                if (r != row) {
                    System.out.println(col + "" + r);
                }
            }          
            for (char c = 'a'; c <= 'h'; c++) {
                if (c != col) {
                    System.out.println(c + "" + row);
                }
            }
        }
        sc.close();
    }
}
