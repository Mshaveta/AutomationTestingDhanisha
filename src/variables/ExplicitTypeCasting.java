package variables;

public class ExplicitTypeCasting {
    public static void main(String[] args) {
        int i = 800;//4 bytes
        byte b = (byte) i;//1 byte// -128 - 127
        System.out.println(b);

//        long l = 1234L;
//        int i = (int) l;
//
//        System.out.println(l);
//
//        ////////////////////////////////////////
//
//        double d = 1000.456;
//        float ft = (float) d;
//        System.out.println(d);
//        //////////////////////////////////////////////

        int x = 97;//4
        char ch = (char) x;//2
        System.out.println(ch);
    }
}
