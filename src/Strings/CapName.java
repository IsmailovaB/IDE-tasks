package Strings;

import java.util.Scanner;

public class CapName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name");

        String name = scan.nextLine();

        String firstLetter = name.substring(0,1);
        firstLetter = firstLetter.toUpperCase();

        String restOfTheWord = name.substring(1).toLowerCase();
        System.out.println(firstLetter+restOfTheWord);

        // we did the name that user put in console first letter uppercase and rest of the letter is lowercase


    }
}
