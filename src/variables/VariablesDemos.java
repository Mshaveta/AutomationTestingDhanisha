package variables;
/*
Variable: container, can holds the value
 */
public class VariablesDemos {
    public static void main(String[] args) {
         //variable declaration
        int a,c,d;

        //decl along with init.
        int b=10;

        //init.
        b=100;

        System.out.println("b");
        System.out.println(100);

        b=900;
        System.out.println(b);

       c=10;
       d=20;
        System.out.println("Sum is -" + c+d);//Sum is - 10 20
        System.out.println(c+d+"Sum is -");// 30 Sum is -
        System.out.println("Sum is -"+(c+d));// SUm is 30
        System.out.println("Sum is -" +  (c+d) + ".......");//  Sum is - 30 .......
        System.out.println("Sum is -"+c+d+".......");//Sum is- 1020......
    }
}
