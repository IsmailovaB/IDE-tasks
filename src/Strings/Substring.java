package Strings;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        String message = "hello world!";

        message = message.substring(4);
        System.out.println(message);

        String word = "Welcome";

        word = word.substring(1,5);
        System.out.println(word);

        String word2 = "Kevin fell from bike";
        int from = word.indexOf("from");
       // we can do word.indexOf("from"); and without -1.
        String word1 = word.substring(0,from-1);
        System.out.println(word1);
        System.out.println(word.substring(from) + " " + word1);






    }
}



