package operators.ControlStatements.LoopingStatements;
/*
num=123 = 6
pallindrom num = 151,111
 */
public class ReverseUsingLoop {
    public static void main(String[] args) {
        int num = 234546;//2345->234
        int rem=0,rev=0;

        while(num>0){
            rem = num%10; //2345%10 =  5
            rev = rev*10 + rem;//5
            num = num/10;//234
        }
        System.out.println(rev);
    }
}
