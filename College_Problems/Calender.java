import java.util.Scanner;

public class Calender {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        int days = 0;
        switch(date.substring(5,7)){
            case "02":
                days+=31;
                break;
            case "03":
                days+=59;
                break;
            case "04":
                days+=90;
                break;
            case "05":
                days+=120;
                break;
            case "06":
                days+=151;
                break;
            case "07":
                days+=181;
                break;
            case "08":
                days+=212;
                break;
            case "09":
                days+=243;
                break;
            case "10":
                days+=273;
                break;
            case "11":
                days+=304;
                break;
            case "12":
                days+=334;
                break;
        }
        days += Integer.parseInt(date.substring(8));
        System.out.println("Total days in that year is : " + days);

    }
}
