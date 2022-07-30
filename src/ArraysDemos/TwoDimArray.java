package ArraysDemos;

import java.util.Arrays;

public class TwoDimArray {
    public static void main(String[] args) {
        //case1:
//        int[][] arrName = new int[2][3];
//        System.out.println(arrName); // [[I@1b6d3586
//        System.out.println(Arrays.toString(arrName)); //[[I@4554617c, [I@74a14482]
//        System.out.println(arrName.length);//2
//        System.out.println(arrName[1].length);//3
//
//        System.out.println(arrName[0][1]);//0
//        System.out.println(arrName[0][1]);
//        System.out.println(arrName[0][2]);
//
//        System.out.println(arrName[1][0]);
//        System.out.println(arrName[1][1]);
//        System.out.println(arrName[1][2]);

        //case2:
        int[][] arrName1 = new int[2][];
        System.out.println(arrName1);//[[I@1b6d3586
        System.out.println(Arrays.toString(arrName1));//null,null
        System.out.println(arrName1.length);
        //System.out.println(arrName1[1].length);//NPE
       // System.out.println(arrName1[0][1]);//NPE

        //case3:Compilation Error
        //int[][] arrName2 = new int[][3];
    }
}
