package ArraysDemos;

public class PrintArrayElmns {
    public static void main(String[] args) {
        int[] arr = new int[] {10,20,30,40,50};

        //way1
        for(int index=0;index<arr.length;index++){
            System.out.println(arr[index] * 100);
        }

        //way2:foreach loop / loop for arrays
//        for( dataType var_name : arr_name){
//
//        }
        System.out.println("----------------");


        int[] newArr = new int[] {110,120,130,140,150};
        for( int value : newArr){
            System.out.println(value);
        }

    }
}
