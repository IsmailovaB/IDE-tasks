package switchRandomStatement;

import java.util.Random;
import java.util.Scanner;

public class UppercaseLetter {
    public static void main(String[] args) {
        Random ran = new Random();

        int number = ran.nextInt(26);// there will be a number from 0-26.
        number += 65; // and randomly number we add +65. And whatever number it is it convert it into ASCII table letter

        char letter = (char) (number); //And whatever number it is it convert it into ASCII table letter
        System.out.println("My number is " + number);
        System.out.println("Your letter is " + letter);

    }
}
