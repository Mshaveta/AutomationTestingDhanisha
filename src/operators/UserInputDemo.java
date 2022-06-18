package operators;

import java.util.Scanner;


public class UserInputDemo {
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);

        System.out.println("Enter a username:");
        String username =  scn.next();
        System.out.println(username);

        //string
        System.out.println("Enter a password:");
        String password = scn.next();
        System.out.println(password);

        if (username.equals("admin") && password.equals("admin123")) {
            System.out.println("user has logged in to the app.");

        }


    }
}
