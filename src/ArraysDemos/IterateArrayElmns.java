package ArraysDemos;

import java.util.Arrays;
import java.util.Scanner;

public class IterateArrayElmns {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter the size of an array");
        int arrSize=  scn.nextInt();
        String[] names = new String[arrSize];//5->0-4
        //System.out.println("Before - "+Arrays.toString(names));
        for(int i=0;i<arrSize;i++) {
            System.out.println("Please enter value at index- "+i);
            names[i] = scn.next();
           // System.out.println("iteration - "+Arrays.toString(names));
        }
        System.out.println("After"+Arrays.toString(names));
        System.out.println("Total count of Elements - "+names.length);
    }
}
