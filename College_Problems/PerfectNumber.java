import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int divident = scanner.nextInt();
        int sum=0;
        for(int i=1; i<=divident/2; i++){
            if(divident % i == 0) sum+=i;
        }
        System.out.println(sum == divident ? "True" : "False");
    }
}
