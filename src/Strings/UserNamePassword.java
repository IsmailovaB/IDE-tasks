package Strings;

import java.util.Scanner;

public class UserNamePassword {
    public static void main(String[] args) {
//        1) Credentials: Given two existing data: user and pass of “test” and “test123”
//        Write a program that asks users to enter a username and password.
//—> If the username and password match print: “ Welcome!”
//—> If username is incorrect print: “invalid username” and don’t ask for the password
//—> If password is incorrect print: “invalid password”

        Scanner scan = new Scanner(System.in);
        String user = "test";
        String pass = "test123";

        System.out.println("Please enter your username");
        String userName = scan.nextLine();

        if (userName.equals(user)) {
            System.out.println("Please enter password");
            String password = scan.nextLine();
            if (password.equals(pass)) {
                System.out.println(" Welcome!");
            } else {
                System.out.println("Invalid password");
            }
        }
        else{
                System.out.println("Invalid username");
            }
    }
}
