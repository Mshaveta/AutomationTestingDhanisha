package StringDemos;

public class CountChar {
    public static void main(String[] args) {
        String str = "aabccdbbsaaaaabaaaaaabccdbbsaaaa" ;
        int count = str.length();
        char searchedChar = 'z';
        int countOfChar =0;

        for(int index=0;index<count;index++){
            char currentChar = str.charAt(index);
            if (currentChar == searchedChar) {
                countOfChar++;
            }
        }
        System.out.println("Total number of '"+searchedChar+"' char is -"+countOfChar);
    }
}
