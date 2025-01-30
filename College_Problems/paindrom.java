import java.util.Scanner;

public class paindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an string");
        String s = scanner.nextLine();
        s = s.toLowerCase();
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            int check = s.charAt(i);
            if (check >= 65 && check <= 122) ans += s.charAt(i);
        }
        System.out.println(ans);
        String reversed = new StringBuilder(ans).reverse().toString();
        System.out.println(reversed);
        System.out.println(reversed.equals(ans) ? "True" : "False");
    }
}
