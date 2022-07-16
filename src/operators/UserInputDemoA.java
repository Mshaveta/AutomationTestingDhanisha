package operators;

import java.util.Scanner;

public class UserInputDemoA {
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);

        System.out.println("Enter a username:");
        int username =  scn.nextInt();
        System.out.println(username);

        //string
        System.out.println("Enter a password:");
        int password = scn.nextInt();
        System.out.println(password);

        if (username==100 && password==100) {
            System.out.println("user has logged in to the app.");
        }else{
            System.out.println("Wrong username & Password!");
        }


    }
}
