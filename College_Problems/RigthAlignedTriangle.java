import java.util.Scanner;

public class RigthAlignedTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of lines to print:");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }

        scanner.close();
    }
}
