package operators.programs;

public class SwapusingThirdvar {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a;
        a = b;
        b = c;

        System.out.println("After Swapping.....");
        System.out.println(a);
        System.out.println(b);

    }
}
