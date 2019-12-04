package methods;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String:");
        String str = scan.nextLine();
        countWords(str);
    }

    public static void countWords(String str1) {
    String [] words = str1.trim().split(" ");
        System.out.println("The number of words in the sentence is: " + words.length);
        // in array split, words.length it will give us the number of words.

    }
}