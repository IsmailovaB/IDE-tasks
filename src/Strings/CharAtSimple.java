package Strings;

import java.util.Scanner;

public class CharAtSimple {
    public static void main(String[] args) {
        String word = "java";
        char c = word.charAt(3);// the index in cha c is "3" and result is "a" (java)(0123)
        char d = word.charAt(2);
        System.out.println(word.substring(1,1));
        System.out.println("" + c + d); //the result will be "av", because we start with string space""
        System.out.println(c+d); // it will just do addition from ASCII table.result is '215'
    }
}
