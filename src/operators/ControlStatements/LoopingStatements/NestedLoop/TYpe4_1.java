package operators.ControlStatements.LoopingStatements.NestedLoop;
/*
	1	2	3	4	5
1					*
2				*	*
3			*	*	*
4		*	*	*	*
5	*	*	*	*	*

 */
public class TYpe4_1 {
    public static void main(String[] args) {
        int n=5;
        for(int row=1;row<=n;row++){

            for(int space=1;space<= n-row ;space++){
                System.out.print("- ");
            }

            for(int star=1;star<= row ;star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
