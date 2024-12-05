public class UserInput {
    static int addition(int p, int q) {
        return p + q;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int a, b;
        System.out.println("Enter first number: ");
        a = sc.nextInt();
        System.out.println("Enter second number: ");
        b = sc.nextInt();
        System.out.println("First number is " + a);
        System.out.println("Second number is " + b);
        int add = addition(a, b);
        System.out.println("The sum is " + add);
    }
}