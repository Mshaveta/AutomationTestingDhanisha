package ArraysDemos;

public class CountEvenOdd {
    public static void main(String[] args) {
        int[] arr = {12,23,45,6,78,9,189,2,112,224,446,666};

        int evenCount = 0;
        int oddCount=0;
        for(int i=0;i<arr.length;i++){
            if( arr[i] %2 ==0 ){
                evenCount++;
            }else{
                oddCount++;
            }
        }

        System.out.println("Total no of Even Elements " + evenCount);
        System.out.println("Total no of Odd Elements " + oddCount);
    }
}
