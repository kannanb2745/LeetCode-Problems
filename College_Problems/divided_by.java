import java.util.Scanner;

public class divided_by {
    public static void main(String[] args) {
        System.out.println("Enter a Number to check factor of 27");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] arr = s.toCharArray();
        for(char i : arr){
            switch (i){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(i);
            }
        }
    }
}
