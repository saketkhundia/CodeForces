import java.util.Scanner;

public class TrippiTroppi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt(); 
        scanner.nextLine(); 

        for (int i = 0; i < t; i++) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");
            String modernName = "" + parts[0].charAt(0) + parts[1].charAt(0) + parts[2].charAt(0);
            System.out.println(modernName);
        }

        scanner.close();
    }
}
