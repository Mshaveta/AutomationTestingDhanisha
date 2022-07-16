package operators.ControlStatements.LoopingStatements;

import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter total no of Rows.");
        int n=scn.nextInt();

        System.out.println("Please enter the table no");
        int tblNum =scn.nextInt();

        //String st = "10";
        //int x= 10;

       // System.out.println("Take String value");
       // String str = scn.next(); //"12","23.45"


       // int x = Integer.parseInt(str);
       // System.out.println(x);
        //System.out.println(str);

        for(int i=1; i<=n;++i){
            System.out.println(tblNum * i);//2*1 =2
        }
    }
}
