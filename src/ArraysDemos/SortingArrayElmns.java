package ArraysDemos;

import java.util.Arrays;

public class SortingArrayElmns {
    public static void main(String[] args) {
        int[] arr = {12,4,2,3,45,6,78,98,11};
        System.out.println("before Sorting: "+Arrays.toString(arr));

        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];//temp = 12
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("After Sorting: "+Arrays.toString(arr));
    }
}
