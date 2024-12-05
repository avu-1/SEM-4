public class marks {
    public static void main(String[] args) {
        float m1 = 56.67f;
        float m2 = 25.67f;

        //and operator 
        if(m1>35 && m2>35)
            System.out.println("Passed");

        //or operator
        if (m1<35 || m2<35)
            System.out.println("Fail");
            
        System.out.println((m1 >= 35 && m2 > 35) ? "pass" : "");
        System.out.println((m1 < 35 && m2 < 35) ? "fail" : "");

    }
}
