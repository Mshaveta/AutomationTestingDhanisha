package ArraysDemos;

import java.util.Arrays;

public class RightShift {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int lastIndex = arr.length-1;
        int lastElement = arr[lastIndex];

        for(int i=0;i<arr.length-1;i++){
            //i=0, arr[4-0] = 5
            //Right Side-
         arr[lastIndex-i] = arr[lastIndex-(i+1)];
        }

        arr[0] = lastElement;

        System.out.println(Arrays.toString(arr));
    }
}
