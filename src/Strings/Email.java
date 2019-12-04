package Strings;

import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
       Scanner scan =new Scanner (System.in);

     String char1 = scan.nextLine();
     String char2 = scan.nextLine();
        String email = " ";
        
        if(char1.length() >= 6 && char2.length() >= 6) {
            email = char1.substring(0,4).toLowerCase();
            email += char2.substring(char2.length()- 3);
            email += "@cybertek.com";
            System.out.println(email);
     }else {
         System.out.println("invalid data");
     }

    }

}
