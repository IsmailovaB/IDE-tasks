package switchRandomStatement;

import java.util.Scanner;

public class NumbertoWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write a number from 1 - 9");

        int num = scan.nextInt();
        String word = "";
        switch(num){
            case 1:
                word = "one";
                break;
            case 2:
                word = "two";
                break;
            case 3:
                word = "three";
                break;
            case 4:
                word = "four";
                break;
            case 5:
                word = "five";
                break;
            case 6:
                word = "six";
                break;
            case 7:
                word = "seven";
                break;
            case 8:
                word = "eight";
                break;
            case 9:
                word = "nine";
                break;
            default:
                System.out.println("Invalid number");
        }
        System.out.println(word);


    }
}
