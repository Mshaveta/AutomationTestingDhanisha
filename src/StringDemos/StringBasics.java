package StringDemos;

import java.util.Arrays;

public class StringBasics {
    public static void main(String[] args) {
        String st = "Testing";
        String st2 = " using tool";

        //BuiltIn Methods
        st = st.concat(st2);
        System.out.println(st);

        //length
        String str = "Hello World";
        int count = str.length();
        System.out.println(count);

        //imp - used
        System.out.println(str.charAt(8)); // char at specified index no
        System.out.println(str.indexOf('W')); // index number of char

        //How to convert String into Array?
        //what is the resturn typr of method toCharArray(); - char[] (char type array)
        String str1 = "LearnWithMe";
        System.out.println("String length - "+str1.length());
        char[] chArr = str1.toCharArray();//[L, e, a, r, n, W, i, t, h, M, e]
        //char[] chArr = {'L','e','a'};
        System.out.println(Arrays.toString(chArr));
        System.out.println("Array length - "+chArr.length);

        System.out.println(str.toLowerCase());//hello world
        System.out.println(str.toUpperCase());

        //split method - String type Array -  String[] arr

        String date = "2022-07-31";
        char[] dCharArr = date.toCharArray();
        System.out.println("toCharArray() "+Arrays.toString(dCharArr)+"length of array - "+dCharArr.length);
        //[2, 0, 2, 2, -, 0, 7, -, 3, 1]

       // System.out.println(date);
        String[] dateArr = date.split("-");
        System.out.println("Split "+Arrays.toString(dateArr)+" length of String Array -"+ dateArr.length);
        // [2022, 07, 31]

//        String year = dateArr[0];
//        String month = dateArr[1];
//        String day = dateArr[2];
//        System.out.println("Year - "+year);
//        System.out.println("Month - "+month);
//        System.out.println("Day - "+day);


    }
}
