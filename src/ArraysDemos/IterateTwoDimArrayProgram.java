package ArraysDemos;

import java.util.Arrays;

public class IterateTwoDimArrayProgram {
    public static void main(String[] args) {
        //case1:
       int[][] arrName = new int[][] { {1,2,3},
                                       {3,4,5}
                                     };
       int rowSize = arrName.length;//total count of Rows
       System.out.println("Row Count - "+ rowSize);

        int colSize = arrName[1].length;//RowNumber.length =  column count
        System.out.println("Col Count - "+ colSize);

        for(int row=0;row<rowSize;row++){
            for(int col=0;col<colSize;col++){
                System.out.print(arrName[row][col] *2+" ");
            }

            System.out.println();
        }

    }
}
