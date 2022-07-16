package operators.ControlStatements.LoopingStatements.NestedLoop;

public class Type1_1 {
    public static void main(String[] args) {
        int ttlRows=10;
        int colTimes = 5;
        for(int row=1;row<=ttlRows;row++){
            for(int col=1;col<=ttlRows;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
