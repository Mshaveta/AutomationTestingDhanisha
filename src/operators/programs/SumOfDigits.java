package operators.programs;

public class SumOfDigits {
    public static void main(String[] args) {
        int n= 345;
        int sum=0;//3-->5

        int d1 = n%10;
        //sum=sum+d1;//0+3 = 3
        n = n/10;//123/10;---> 12

        int d2 = n % 10;//12 % 10
        //sum=sum+d2;//3 + 2 =5

        int d3 = n/10;
       // sum=sum+d3;//5+1 =6

       // System.out.println("Sum of digits is- "+ sum);
        System.out.println("Sum of a number is "+ (d1+d2+d3));
        System.out.println("reverse of a number is "+ d1+d2+d3);
    }
}
