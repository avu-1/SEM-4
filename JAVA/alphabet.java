public class alphabet {
    public static void main(String[] args){
        System.out.println("Capital Alphabet");
        int c=97;
        while(c<=122){
            System.out.println((char)c+"\t");
            if(c%2==0)
                System.out.println();
                c=c+1;
        }
    }
}
/* char b='a';
while(b!='z'){
System.out.print(b+"\t");
b++;
alternate way
 */