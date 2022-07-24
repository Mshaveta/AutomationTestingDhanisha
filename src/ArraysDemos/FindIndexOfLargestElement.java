package ArraysDemos;

public class FindIndexOfLargestElement {
    public static void main(String[] args) {
        int[] numbers = new int[]{223,4,56,7,89,180,5,43};
        int size = numbers.length;

        int max = 0;//0->23-->56
        int maxIndex=0;
        for(int index=0;index<size;index++){//index0->1,2
           if(numbers[index]>max){ //numbers[0] >max ===> 23> 0--true, 4<23,56>23
               max = numbers[index];//max = 23 , max = 56
               maxIndex = index;

           }
        }

        System.out.println("Max njumber is  - "+ max);
        System.out.println("Index Number of Max number is  - "+ maxIndex);

    }
}
