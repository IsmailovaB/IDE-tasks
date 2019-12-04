package Strings;

import java.util.Scanner;

public class MoveFirstWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your sentence");

        String sentence = scan.nextLine();

        int space = sentence.indexOf(" ");  // when we want to take first letter from sentence, we need first space
        String firstWord = sentence.substring(0,space); // it will give first letter till the space.
        String reamin = sentence.substring(space +1); // it will ignore the space. and will read rest of the sentence.

        System.out.println(reamin+" "+firstWord);


    }
}
