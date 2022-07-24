package ArraysDemos;

public class SumOfArrayElmns {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,23,45,6};
        int sum=0;

        for(int i=0;i<arr.length;i++){//i=0-><5-->0,1,2,3,4
            sum = sum + arr[i];//0+1=1, 1+2=3
        }

        System.out.println(sum);
    }
}
