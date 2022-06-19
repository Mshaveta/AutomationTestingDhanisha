package operators.ControlStatements.LoopingStatements;

import java.util.Scanner;

public class SingleForLoopDemo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter total no of Rows.");
        int n=scn.nextInt();
        for(int i=1; i<=n;i++){
            System.out.println(i+" Hello..");
        }
    }
}
