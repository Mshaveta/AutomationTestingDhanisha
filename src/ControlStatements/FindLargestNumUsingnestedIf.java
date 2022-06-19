package operators.ControlStatements;

public class FindLargestNumUsingnestedIf {
    public static void main(String[] args) {
        int a=100,b=120,c=900;
        if(a>b){
            System.out.println("Yes, a i greater than b");
            if(a>c){
                System.out.println("Yes, a i largest");
            }else{
                System.out.println("Yes, c i largest");
            }
        }else{
            System.out.println("Yes, b i greater than a");
            if(b>c){
                System.out.println("Yes, b i largest");
            }else{
                System.out.println("Yes, c i largest");
            }
        }

    }
}
