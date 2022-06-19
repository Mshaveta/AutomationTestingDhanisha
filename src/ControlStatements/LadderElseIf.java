package operators.ControlStatements;

public class LadderElseIf {
    public static void main(String[] args) {
        int a=1,b=2,c=3;

        if(a>b){ // 1>2
            System.out.println("a is largest");
        }else if(a>c){//1>3
            System.out.println("b is largest");
        }else{
            System.out.println("c is largest");
        }
    }
}
