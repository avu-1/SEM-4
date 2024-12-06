import java.util.Scanner;

public class CalculationProgram {
    static int Addition ( int a , int b){
        return a+b;
    }
    static int Subtraction ( int a , int b){
        return a-b;
    }
    static int Multiplication( int a , int b){
        return a*b;
    }
    static int Division( int a , int b){
        return a/b;
    }
    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Addition");
        System.out.println("Subtraction");
        System.out.println("Multiplication");
        System.out.println("Division");
        
        String Choice = sc.next();

        switch (Choice){
            case "Addition":
            System.out.println("The addition of the numbers is : "+ Addition(a,b));
            break;
            case "Subtraction":
            System.out.println("The Subtraction of the numbers is : "+ Subtraction(a,b));
            break;
            case "Multiplication":
            System.out.println("The Multiplication of the numbers is : "+ Multiplication(a,b));
            break;
            case "Division":
            System.out.println("The Division of the numbers is : "+ Division(a,b));
            break;
            default:
            System.out.println("Invalid Input");
        }

        
    }
    }
}