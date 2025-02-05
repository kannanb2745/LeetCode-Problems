import java.util.Scanner;

public class pattern_up_down {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of lines to print");
        int n = scanner.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=0; j<(n-i); j++) System.out.print(" ");
            for(int s=0; s<i; s++) System.out.print("* ");
            System.out.println();
        }
        for(int l=n-1; l>0; l--){
            for(int m=0; m<(n-l); m++) System.out.print(" ");
            for(int o=0; o<l; o++) System.out.print("* ");
            System.out.println();
        }


    }
}
