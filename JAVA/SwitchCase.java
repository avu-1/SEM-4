import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

        System.out.println("State and Capital Quiz");
        System.out.println("=======================");

        System.out.println("1.Punjab");
        System.out.println("2.Haryana");
        System.out.println("3.Himachal Pradesh");
        System.out.println("4.Uttar Pradesh");
        System.out.println("5.Rajasthan");
        System.out.println("6.TamilNadu");
        System.out.println("7.West Bengal");

        System.out.println("Enter choice between 1 and 7 :");
        int choice=sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Chandigarh");
                break;
            case 2:
                 System.out.println("The Capital is Chandigarh");
            break;
            case 3:
                 System.out.println("The Capital is Shimla");
                 break;
            case 4:
                 System.out.println("The Capital is Lucknow");
                 break;
            case 5:
                 System.out.println("The Capital is Jaipur");
                 break;
            case 6:
                 System.out.println("The Capital is Chennai");
                 break;
            case 7:
                 System.out.println("The Capital is Kolkata");
                 break;
            default:
            System.out.println("Invalid Input");
                break;
        }
    }
}
}