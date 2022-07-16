package operators.programs;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 12;
        boolean flag = false;
        for(int i=2;i<num;i++){
       // for(int i=2;i<=num/2;i++){-----optimized way
            if(num % i == 0){
                flag = true;
                break;
            }
        }

        if(flag) {
            System.out.println("Not a prime no");
        }else{
            System.out.println("No. is  prime");
        }

    }
}
