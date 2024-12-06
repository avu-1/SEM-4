public class loop1 {
public static void main(String[] args) {
    int counter = 1;

    while (counter <= 10) {
        System.out.println("Hello, World!");
        counter=counter+1;
        if (counter==5)
        break;
    }
}
}