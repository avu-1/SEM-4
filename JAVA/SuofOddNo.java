public class SuofOddNo {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int c=1;
        int n=0;
        int sum=0;

        while(c<=10) {
            System.out.println(c+" Enter a number: ");
            n = sc.nextInt();
            if(n % 2 != 0) {
                continue;
            } else {
                sum = sum + n;
                c = c + 1;
            }
        }
        System.out.println("Sum of 10 even numbers is: " + sum);
        sc.close();
    }
}
