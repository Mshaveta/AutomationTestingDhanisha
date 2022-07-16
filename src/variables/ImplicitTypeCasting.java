package variables;

public class ImplicitTypeCasting {
    public static void main(String[] args) {
        byte b =100;
        short s = b;
        int i =s;
        long l =i;
        System.out.println(l);

        ////////////////////////////////////////
        float ft = 12.3f;
        double d = ft;
        System.out.println(d);
        //////////////////////////////////////////////
        char ch = 'a';
        int x = ch;
        System.out.println(x);
    }
}
