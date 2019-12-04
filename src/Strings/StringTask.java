package Strings;

import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//
//        String msg = "Cybertek is located in Des Plaines";
//
//        System.out.println("Enter a part of the String:");
//
//        String word = scan.nextLine();
//        int word2 = msg.indexOf(word);
//        System.out.println(word2);
//
//
//
//
//        String month = "October";
//        System.out.println("Enter the month:");
//        String month2 = scan.nextLine();
//
////        if (month.equalsIgnoreCase(month2)){
////            System.out.println(true);
////        }else{
////            System.out.println(false);
////        }

//
//        String sentence = "We will have a picnic when the weather gets nicer";
//        System.out.println("We will have a picnic when the weather gets nicer");
//        System.out.println("Enter the set of character that you want to change");
//        String letter = scan.nextLine();
//        System.out.println("Enter the character to which one you want to change");
//        String newLetter = scan.nextLine();
//
//        String wordChange = sentence.replace(letter ,newLetter);
//        System.out.println(wordChange);


        System.out.println();

        String word = scan.nextLine();
        String word1 = scan.nextLine();

        System.out.println(word.compareTo(word1));


        System.out.println("enter your name");
        String name = scan.nextLine().toLowerCase();

        if(name.startsWith("a")&&name.startsWith("z")){
            System.out.println("Your name is cool!");
        }else{
            System.out.println("Sorry not a cool name");
        }

    }
}
