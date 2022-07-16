package operators;
/*
AND - && (both the cond. are ture then overall result would be true)
OR - ||  (either one of the condisiotn is true)
NOT ! (inverse)
 */
public class LogicalOpt {
    public static void main(String[] args) {
        int a=100;
        int b=190;
        int c=100;

        System.out.println(a==c && b==c);
        System.out.println(a==c || b==c);


        //exp ? true stmnt : false part

        System.out.println((a>b) ? "a is greater than b" : "b is greater than a");

    }
}
