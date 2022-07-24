package ArraysDemos;

public class SmallestElement {
    public static void main(String[] args) {
        int[] numbers = new int[]{23,4,56,7,89,80,5,1};
        int size = numbers.length;

        int min = numbers[0];//23->4
        for(int index=0;index<size;index++){
           if(numbers[index]<min){  //56<4
               min = numbers[index];//min =4
           }
        }

        System.out.println("Min number is  - "+ min);

    }
}
