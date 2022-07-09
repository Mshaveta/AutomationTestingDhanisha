package operators.ControlStatements.LoopingStatements.NestedLoop;
/*
	1	2	3	4	5
1			*
2		*	*	*
3	*	*	*	*	*
 */
public class TYpe5_2 {
    public static void main(String[] args) {
        int n=3;
        for(int row=1;row<=n;row++){

            for(int space=1;space<= n-row ;space++){
                System.out.print(" ");
            }
            for(int star=1;star<= (2*row)-1 ;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
