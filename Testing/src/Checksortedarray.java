import java.util.Scanner;
public class Checksortedarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the arr");
        int size = scanner.nextInt();
        System.out.println("Enter the elements in sequential");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = scanner.nextInt();
        System.out.println(asc(arr) || des(arr));
    }
    static boolean asc(int[] arr){
        for(int i =0; i< arr.length-1; i++){
            if(arr[i] > arr[i+1]) return false;
        }
        return true;
    }
    static boolean des(int[] arr){
        for(int i =0; i< arr.length-1; i++){
            if(arr[i] < arr[i+1]) return false;
        }
        return true;
    }
}

