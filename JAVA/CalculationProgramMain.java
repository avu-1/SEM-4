public class CalculationProgramMain {
    public static void main(String[] args) {
        java.util.Scanner scanner=new java.util.Scanner(System.in);
        System.out.println("Enter two no: ");
        int x= scanner.nextInt();
        int y= scanner.nextInt();
        System.out.println("Enter operator (+,-,*,/): ");
        String operator = scanner.next();
        switch (operator) {
            case "+":
            System.out.println("Addition of two no is: "+(x+y));
            break;
            case "-":
            System.out.println("Subtraction of two no is: "+(x-y));
            break;
            case "*":
            System.out.println("Multiplication of two no is: "+(x*y));
            break;
            case "/":
            System.out.println("Addition of two no is: "+(x/y));
            break;

            default:
            System.out.println("Invalid operator");
            break;
            
        }

    }
    
}