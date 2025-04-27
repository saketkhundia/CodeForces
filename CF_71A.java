import java.util.Scanner;

public class CF_71A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            String word = sc.nextLine();
            if (word.length() > 10) {
                // Abbreviate the word
                String abbreviated = word.charAt(0) + String.valueOf(word.length() - 2) + word.charAt(word.length() - 1);
                System.out.println(abbreviated);
            } else {
                // Print the word as it is
                System.out.println(word);
            }
        }

        sc.close();
    }
}
