package switchRandomStatement;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random ran = new Random();

        int number = ran.nextInt(10); //here comp.random number will be from 0-9.
        number++;                           //this is how i get the range to be 1-10.
        System.out.println("Enter random number");
        int number1 = scan.nextInt();



        if (number == number1){
            System.out.println("Congrats you guessed right");
        } else if (number <number1) {
            System.out.println("Your guess is too low");
        }
            else if (number1<0||number1>10){
            System.out.println("Not a valid number");
        } else if (number >number1) {
            System.out.println("Your guess is too high");
        }



    }
}
