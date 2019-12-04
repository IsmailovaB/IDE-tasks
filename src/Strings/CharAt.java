package Strings;

import java.util.Scanner;

public class CharAt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        String word = "welcow";
//
//        if(word.charAt(0)==word.charAt(5)){
//            System.out.println("First and last chars are the same");
//        }else{
//            System.out.println("First and Last chars are not the same");
//        }
//
//       String word4 = "Hello everyone!";
//        char last = word4.charAt(word4.length()-1);   // it will read last char of the centence.
//        System.out.println("Last char of the "+ word4+ " is " +last);

        System.out.println("Enter two words(separate with space):");
        String str3 = input.nextLine();
        int len = str3.length();
        System.out.println(len);


    }
}
