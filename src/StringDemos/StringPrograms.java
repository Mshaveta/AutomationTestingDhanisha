package StringDemos;

import java.util.Arrays;

public class StringPrograms {
    public static void main(String[] args) {
        String str = "Testing";
        System.out.println(str);

        //way1: String method
        for(int index=0;index<str.length();index++){
            System.out.println(str.charAt(index));
        }

        //way2: convert String to Array
        char[] chArr = str.toCharArray();
        System.out.println(Arrays.toString(chArr));//[T, e, s, t, i, n, g]
        for(int index=0;index<chArr.length;index++){
            System.out.println(chArr[index]);
        }
    }
}
