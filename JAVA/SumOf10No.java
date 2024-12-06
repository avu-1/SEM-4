public class SumOf10No {
    public static void main(String[] args) {
        int c=1;
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int n=0;
        int sum=0;

        while(c<=10){
            System.out.println(c+" Enter a number: ");
            n=sc.nextInt();
            sum=sum+n;
            c=c+1;
        }
        System.out.println("Sum of 10 numbers is: " + sum);
    }
    
}
