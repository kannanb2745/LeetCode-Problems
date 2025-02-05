import java.util.Scanner;

public class Simple_Interst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the P value");
        int p = scanner.nextInt();
        System.out.println("Enter the r value");
        int r = scanner.nextInt();
        System.out.println("Enter the t value");
        int t = scanner.nextInt();
        System.out.println("The Simple interst is :" + ((p*r*t)/100));
    }
}
