package operators.ControlStatements;

public class NestedIf {
    public static void main(String[] args) {
        if(false){
            System.out.println("outer if part....");//1
            if(true){
                System.out.println("inner if-if part....");//2
            }else{
                System.out.println("inner if- else part....");
            }
        }else{
            System.out.println("outer else part....");
            if(false){
                System.out.println("inner else-if part....");//2
            }else{
                System.out.println("inner else- else part....");
            }
        }
    }
}
