import java.util.Scanner;

public class CalsiUsingWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Loop:
        while(true){
            System.out.println();
            System.out.println("---------------------------------------------");
            System.out.println("Enter an Option number to choose Operation :");
            System.out.println("Enter 1 for Addition");
            System.out.println("Enter 2 for Subtracion");
            System.out.println("Enter 3 for Multiplication");
            System.out.println("Enter 4 for Division");
            System.out.println("Enter 5 to Quit the Loop");
            int choice = scanner.nextInt();
            int a,b;
            switch (choice){
                case 1:
                    System.out.println("Enter two number to Perform Operation");
                    System.out.println("Enter the First number");
                    a = scanner.nextInt();
                    System.out.println("Enter the Seconde number");
                    b = scanner.nextInt();
                    System.out.println("The Addition is : " + (a+b));
                    break;
                case 2:
                    System.out.println("Enter two number to Perform Operation");
                    System.out.println("Enter the First number");
                    a = scanner.nextInt();
                    System.out.println("Enter the Seconde number");
                    b = scanner.nextInt();
                    System.out.println("The Subtraction is : " + (a-b));
                    break;
                case 3:
                    System.out.println("Enter two number to Perform Operation");
                    System.out.println("Enter the First number");
                    a = scanner.nextInt();
                    System.out.println("Enter the Seconde number");
                    b = scanner.nextInt();
                    System.out.println("The Multiplication is : " + (a*b));
                    break;
                case 4:
                    System.out.println("Enter two number to Perform Operation");
                    System.out.println("Enter the First number");
                    a = scanner.nextInt();
                    System.out.println("Enter the Seconde number");
                    b = scanner.nextInt();
                    System.out.println("The Division is : " + (a/b));
                    break;
                case 5:
                    System.out.println("The Program is About to Quit");
                    break Loop;
                default:
                    System.out.println("Error Occured Please Restart ");
            }
        }
    }
}

