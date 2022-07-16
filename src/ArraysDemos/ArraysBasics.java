package ArraysDemos;

import java.util.Arrays;

public class ArraysBasics {
    public static void main(String[] args) {
        //Way1 - Array Declaration:
        int[] arr = new int[5];
        System.out.println(arr);//[I@1b6d3586
        System.out.println(arr[0]);//0
        System.out.println(Arrays.toString(arr));//[0, 0, 0, 0, 0]

        //Assigning the value to Array at index-0
        arr[0] = 100;
        arr[4] = 500;
        System.out.println(arr[0]);//100
        System.out.println(Arrays.toString(arr));//[100, 0, 0, 0, 500]

        //Way2 - Create an array and assign the values
        int[] arr1 = new int[] {11,12,23,345,5};
        System.out.println("Total no of Elements - "+arr1.length);

        //way3 - Create and assign the values
        int[] arr3 = {111,112,223,455};
        System.out.println(Arrays.toString(arr3));//[111, 112, 223, 455]
        int size = arr3.length;//4
        int lastIndex = size-1;//4-1=3
        System.out.println("Size - "+size);
        System.out.println("last Index - "+lastIndex);
        System.out.println(arr3[lastIndex]);

    }
}
