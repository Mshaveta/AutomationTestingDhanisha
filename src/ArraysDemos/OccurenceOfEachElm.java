package ArraysDemos;

import java.util.Arrays;

public class OccurenceOfEachElm {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 4, 4, 3, 5, 5, 1};
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0) { //optional
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        arr[j] = 0;
                    }
                }
            }
           // if (arr[i] != 0 && count>1) { condition for find the duplicate elements
            if (arr[i] != 0 ) { //occurenece of elmns
                System.out.println("Duplicate Elements - "+ arr[i]); //condition for find the duplicate elements
                 System.out.println(arr[i] + " occurs " + count + " times");
            }
            count = 1;
        }
    }
}
