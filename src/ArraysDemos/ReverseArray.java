package ArraysDemos;


import java.sql.SQLOutput;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {23,34,57,8,12,3};
        System.out.println(Arrays.toString(arr));//[23, 34, 57, 8, 12, 3]

        int temp=0;
        for(int i=0;i<arr.length/2;i++){
            temp = arr[i];
            arr[i] = arr[arr.length-(i+1)];
            arr[arr.length-(i+1)] = temp;
        }

        System.out.println(Arrays.toString(arr));//[23, 34, 57, 8, 12, 3]


    }
}
