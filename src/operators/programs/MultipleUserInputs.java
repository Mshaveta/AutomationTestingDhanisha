package operators.programs;

import java.util.Scanner;

public class MultipleUserInputs {
    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);
        System.out.println("Total count:");
        int count =  scn.nextInt();
        int sum = 0;
        for(int i = 1;i<=count;i++){
            System.out.println("Enter "+i+" Number");
            int num =  scn.nextInt();
            sum = sum+num;
        }

        System.out.println(sum);
    }
}
