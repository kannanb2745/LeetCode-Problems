import java.util.Scanner;

public class divided_by {
    public static void main(String[] args) {
        System.out.println("Enter a Number to check factor of 27");
        Scanner scanner = new Scanner(System.in);
        int divident = scanner.nextInt();
        System.out.println((divident%27) == 0 ? "It is divisible by 27" : "It is Not divisible by 27");
    }
}
