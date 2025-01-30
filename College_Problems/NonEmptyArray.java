import java.util.HashSet;
import java.util.Scanner;

public class NonEmptyArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an array size");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements");
        for(int i=0; i<size; i++) arr[i] = scanner.nextInt();
//        for(int j : arr) System.out.println(j);
        HashSet<Integer> hs = new HashSet<>();
        boolean flag = true;
        for(int k=0; k<size; k++){
            if(hs.contains(arr[k])) flag = false;
            else hs.add(arr[k]);
        }
        System.out.println(flag ? "True" : "False");
    }
}
