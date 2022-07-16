package operators.ControlStatements.LoopingStatements.NestedLoop;

public class Type1_3 {
    public static void main(String[] args) {
        int ttlRows=5;

        for(int row=1;row<=ttlRows;row++){
            for(int col=1;col<=ttlRows;col++){

                    //System.out.print(row+" ");
                System.out.print(col+" ");

            }
            System.out.println();
        }
    }
}
