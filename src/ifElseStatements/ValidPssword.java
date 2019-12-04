package ifElseStatements;

import java.util.Scanner;

public class ValidPssword {
    public static void main(String[] args) {

        System.out.println("Please enter word:");
        Scanner scanner = new Scanner(System.in);
        String n1 = scanner.nextLine();

        // Your code here
        //------------------------------------------------
        int len = n1.length();
        if (len >= 8) {
            if (n1.charAt(len) >= 65 || n1.charAt(len) <= 90) {
                if (n1.charAt(len) >= 97 || n1.charAt(len) <= 122) {
                    if (n1.charAt(len) >= '0' || n1.charAt(len) <= '9') {

                    } else {
                        System.out.println("Password should contain at least 1 lowercase letter");
                    }
                } else {
                    System.out.println("Password should contain at least 1 uppercase letter");

                }
            } else {
                System.out.println("Password should contain minimum 8 characters");
            }
        }
    }
}
