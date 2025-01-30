import java.util.Scanner;

public class DivisibleStringArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an interger");
        int n = scanner.nextInt();
        String[] arr = new String[n];
        for (int i = 1; i <=n; i++) {
            if (i % 3 == 0 && i % 5 == 0) arr[i-1] = "FizzBuzz";
            else if (i % 3 == 0) arr[i-1] = "Fizz";
            else if (i % 5 == 0) arr[i-1] = "Buzz";
            else arr[i-1] = String.valueOf(i);
        }
        for (String iter : arr) System.out.println(iter);
    }
}