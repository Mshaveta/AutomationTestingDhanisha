package operators;

public class UniaryOps {
    public static void main(String[] args) {
        int x=10;
        System.out.println(++x);//x=11

        System.out.println(x++);//12
        System.out.println(x);//12
        x++;//13
        ++x;//14

        System.out.println(x);//14

        int y = ++x;//15
        System.out.println(x);//15
        System.out.println(y);//15

        //post increment
        System.out.println("=================post increment============");
        int n=10;
        System.out.println(n++);//10

        System.out.println(n++);//11
        System.out.println(n);//12
        n++;//13

        System.out.println(n);//13

        int m = ++n;//
        System.out.println(m);//14
        System.out.println(n);//14

    }
}
