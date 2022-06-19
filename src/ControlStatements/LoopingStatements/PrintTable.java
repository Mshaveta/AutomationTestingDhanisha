package operators.ControlStatements.LoopingStatements;

import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter total no of Rows.");
        int n=scn.nextInt();

        System.out.println("Please enter the table no");
        int tblNum =scn.nextInt();

        for(int i=1; i<=n;++i){
            System.out.println(tblNum * i);//2*1 =2
        }
    }
}
