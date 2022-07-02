package operators.ControlStatements.LoopingStatements.NestedLoop;

public class Type1_2 {
    public static void main(String[] args) {
        int ttlRows=5;

        for(int row=1;row<=ttlRows;row++){
            for(int col=1;col<=ttlRows;col++){
                if(row==1 || col==1 || row==5 || col==5){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
