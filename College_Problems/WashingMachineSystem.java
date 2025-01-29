import java.util.Scanner;

public class WashingMachineSystem {
    public static void main(String[] args) {
//        System.out.println("Hello, World!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Load weigth :");
        int weigth = scanner.nextInt();
        if(weigth<0 || weigth >7000) System.out.println("Invalid Output");
        else if(weigth == 0) System.out.println("Time Estimated : " + 0);
        else{
            if(weigth < 2000) System.out.println("Time Estimated : " + 25);
            else if(weigth>2000 && weigth<4001) System.out.println("Time Estimated : " + 35);
            else if(weigth>4000) System.out.println("Time Estimated : " + 45);
        }
    }
}
