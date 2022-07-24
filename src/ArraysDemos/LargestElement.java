package ArraysDemos;

public class LargestElement {
    public static void main(String[] args) {
        int[] numbers = new int[]{23,4,56,7,89,80,5,43};
        int size = numbers.length;

        int max = 0;//0->23-->56
        for(int index=0;index<size;index++){//index0->1,2
           if(numbers[index]>max){ //numbers[0] >max ===> 23> 0--true, 4<23,56>23
               max = numbers[index];//max = 23 , max = 56
           }
        }

        System.out.println("Max njumber is  - "+ max);

    }
}
