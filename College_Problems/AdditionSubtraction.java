import java.util.Scanner;
//import java.util.Math;
public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello, World!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number :");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter Seconde Number :");
        int secondNumeber = scanner.nextInt();

        System.out.println("Addition of Two Numbers is :" + Math.abs((firstNumber + secondNumeber)));
        System.out.println("Subtraction of Two Numbers is :" + (Math.abs(firstNumber - secondNumeber)));

        }
    }
