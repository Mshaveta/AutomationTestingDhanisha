package operators.ControlStatements.LoopingStatements.NestedLoop;

public class ImpConcept3 {

    public static void main(String[] args) {
        int n=5;

        for(int i=1;i<=n;i++){
            int num=i;
            for(int j=1;j<=i;j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
}

