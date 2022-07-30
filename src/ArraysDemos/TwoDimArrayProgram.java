package ArraysDemos;

import java.util.Arrays;

public class TwoDimArrayProgram {
    public static void main(String[] args) {
        //case1:
       int[][] arrName = new int[][] {{1,2,3},{3,4,5},{6,7,8}};
        System.out.println(Arrays.toString(arrName[0]));
        System.out.println(Arrays.toString(arrName[1]));
        System.out.println(Arrays.toString(arrName[2]));


        System.out.println(arrName[2][2]);

        //Provide the Array Size and elemnets
        int[][] arrName1 = new int[2][2];
        arrName1[0][0] = 00;
        arrName1[0][1] = 01;
        arrName1[1][0] = 10;
        arrName1[1][1] = 11;

        System.out.println(Arrays.toString(arrName1[0]));
        System.out.println(Arrays.toString(arrName1[1]));
    }
}
